package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.config.AppVersion
import com.roamyhub.android.core.domain.model.config.LegalLinks
import com.roamyhub.android.core.network.model.AppVersionDto
import com.roamyhub.android.core.network.model.LegalLinksDto

/**
 * Extension function to convert AppVersionDto to domain AppVersion model
 */
fun AppVersionDto.toDomain(): AppVersion {
    return AppVersion(
        currentVersion = currentVersion,
        minimumVersion = minimumVersion,
        latestVersion = latestVersion,
        updateAvailable = updateAvailable,
        forceUpdate = forceUpdate,
        updateUrl = updateUrl,
        releaseNotes = releaseNotes
    )
}

/**
 * Extension function to convert LegalLinksDto to domain LegalLinks model
 */
fun LegalLinksDto.toDomain(): LegalLinks {
    return LegalLinks(
        termsOfServiceUrl = termsOfServiceUrl,
        privacyPolicyUrl = privacyPolicyUrl,
        refundPolicyUrl = refundPolicyUrl,
        cookiePolicyUrl = cookiePolicyUrl,
        acceptableUseUrl = acceptableUseUrl
    )
}
