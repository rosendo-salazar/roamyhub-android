package com.roamyhub.android.core.domain.usecase.config

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.config.LegalLinks
import com.roamyhub.android.core.domain.repository.ConfigRepository
import javax.inject.Inject

/**
 * Use case to retrieve legal document links.
 *
 * Returns URLs to Terms of Service, Privacy Policy, and other legal documents.
 */
class GetLegalLinksUseCase @Inject constructor(
    private val configRepository: ConfigRepository
) {
    suspend operator fun invoke(): Resource<LegalLinks> {
        return configRepository.getLegalLinks()
    }
}
