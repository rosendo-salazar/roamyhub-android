package com.roamyhub.android.feature.profile.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.usecase.profile.GetProfileUseCase
import com.roamyhub.android.core.domain.usecase.profile.UpdateProfileUseCase
import com.roamyhub.android.feature.profile.state.EditProfileUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for Edit Profile screen
 *
 * Manages profile editing form state and validation.
 */
@HiltViewModel
class EditProfileViewModel @Inject constructor(
    private val getProfileUseCase: GetProfileUseCase,
    private val updateProfileUseCase: UpdateProfileUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(EditProfileUiState())
    val uiState: StateFlow<EditProfileUiState> = _uiState.asStateFlow()

    init {
        loadProfile()
    }

    /**
     * Load user profile
     */
    private fun loadProfile() {
        viewModelScope.launch {
            getProfileUseCase().collect { resource ->
                when (resource) {
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(
                                isLoading = true,
                                error = null
                            )
                        }
                    }
                    is Resource.Success -> {
                        val user = resource.data
                        _uiState.update {
                            it.copy(
                                user = user,
                                firstName = user.firstName,
                                lastName = user.lastName,
                                phoneNumber = user.phoneNumber ?: "",
                                isLoading = false,
                                error = null
                            )
                        }
                    }
                    is Resource.Error -> {
                        _uiState.update {
                            it.copy(
                                error = resource.message,
                                isLoading = false
                            )
                        }
                    }
                }
            }
        }
    }

    /**
     * Update first name
     */
    fun onFirstNameChange(firstName: String) {
        _uiState.update { it.copy(firstName = firstName) }
    }

    /**
     * Update last name
     */
    fun onLastNameChange(lastName: String) {
        _uiState.update { it.copy(lastName = lastName) }
    }

    /**
     * Update phone number
     */
    fun onPhoneNumberChange(phoneNumber: String) {
        _uiState.update { it.copy(phoneNumber = phoneNumber) }
    }

    /**
     * Save profile changes
     */
    fun saveProfile() {
        val currentState = _uiState.value

        if (!currentState.isValid()) {
            _uiState.update {
                it.copy(error = "Please fill in all required fields")
            }
            return
        }

        if (!currentState.hasChanges()) {
            _uiState.update {
                it.copy(successMessage = "No changes to save")
            }
            return
        }

        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isSaving = true,
                    error = null,
                    successMessage = null
                )
            }

            val result = updateProfileUseCase(
                firstName = currentState.firstName.takeIf { it != currentState.user?.firstName },
                lastName = currentState.lastName.takeIf { it != currentState.user?.lastName },
                phoneNumber = currentState.phoneNumber.takeIf {
                    it != (currentState.user?.phoneNumber ?: "")
                }
            )

            when (result) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            user = result.data,
                            isSaving = false,
                            successMessage = "Profile updated successfully",
                            error = null
                        )
                    }
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            error = result.message,
                            isSaving = false,
                            successMessage = null
                        )
                    }
                }
                is Resource.Loading -> {
                    // No-op
                }
            }
        }
    }

    /**
     * Clear messages
     */
    fun clearMessages() {
        _uiState.update {
            it.copy(
                error = null,
                successMessage = null
            )
        }
    }
}
