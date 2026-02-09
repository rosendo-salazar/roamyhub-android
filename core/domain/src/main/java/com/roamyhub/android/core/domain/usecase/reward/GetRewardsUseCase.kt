package com.roamyhub.android.core.domain.usecase.reward

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.reward.RewardsSummary
import com.roamyhub.android.core.domain.repository.RewardRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Use case to retrieve the current user's rewards summary.
 *
 * Returns a Flow that emits rewards updates whenever points balance changes.
 */
class GetRewardsUseCase @Inject constructor(
    private val rewardRepository: RewardRepository
) {
    operator fun invoke(): Flow<Resource<RewardsSummary>> {
        return rewardRepository.getRewardsSummary()
    }
}
