package com.roamyhub.android.feature.profile.rewards.state

import com.roamyhub.android.core.domain.model.reward.RewardsSummary

/**
 * UI state for Rewards screen
 */
data class RewardsUiState(
    val rewardsSummary: RewardsSummary? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
