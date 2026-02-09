package com.roamyhub.android.core.common.extensions

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

/**
 * Formats an Instant to a readable date string
 */
fun Instant.toReadableDate(timeZone: TimeZone = TimeZone.currentSystemDefault()): String {
    val dateTime = this.toLocalDateTime(timeZone)
    val month = dateTime.month.name.lowercase().capitalizeFirstInternal().substring(0, 3)
    val day = dateTime.dayOfMonth
    val year = dateTime.year
    return "$month $day, $year"
}

/**
 * Formats an Instant to a readable date and time string
 */
fun Instant.toReadableDateTime(timeZone: TimeZone = TimeZone.currentSystemDefault()): String {
    val dateTime = this.toLocalDateTime(timeZone)
    val month = dateTime.month.name.lowercase().capitalizeFirstInternal().substring(0, 3)
    val day = dateTime.dayOfMonth
    val year = dateTime.year
    val hour = dateTime.hour.toString().padStart(2, '0')
    val minute = dateTime.minute.toString().padStart(2, '0')
    return "$month $day, $year $hour:$minute"
}

/**
 * Returns true if the instant is in the past
 */
fun Instant.isPast(): Boolean = this < Clock.System.now()

/**
 * Returns true if the instant is in the future
 */
fun Instant.isFuture(): Boolean = this > Clock.System.now()

/**
 * Returns a human-readable "time ago" string (e.g., "2 hours ago", "3 days ago")
 */
fun Instant.toTimeAgo(): String {
    val now = Clock.System.now()
    val duration = now - this

    return when {
        duration < 1.minutes -> "just now"
        duration < 1.hours -> "${duration.inWholeMinutes}m ago"
        duration < 1.days -> "${duration.inWholeHours}h ago"
        duration < 7.days -> "${duration.inWholeDays}d ago"
        duration < 30.days -> "${duration.inWholeDays / 7}w ago"
        duration < 365.days -> "${duration.inWholeDays / 30}mo ago"
        else -> "${duration.inWholeDays / 365}y ago"
    }
}

/**
 * Returns the number of days between this instant and now
 */
fun Instant.daysUntilNow(): Long {
    val now = Clock.System.now()
    return (now - this).inWholeDays
}

/**
 * Returns the number of days from now until this instant
 */
fun Instant.daysFromNow(): Long {
    val now = Clock.System.now()
    return (this - now).inWholeDays
}

/**
 * Checks if this instant is within the given duration from now
 */
fun Instant.isWithin(duration: Duration): Boolean {
    val now = Clock.System.now()
    val diff = kotlin.math.abs((this - now).inWholeMilliseconds)
    return diff <= duration.inWholeMilliseconds
}

/**
 * Returns true if this LocalDate is today
 */
fun LocalDate.isToday(timeZone: TimeZone = TimeZone.currentSystemDefault()): Boolean {
    val today = Clock.System.now().toLocalDateTime(timeZone).date
    return this == today
}

/**
 * Converts a String in ISO-8601 format to an Instant
 */
fun String.toInstantOrNull(): Instant? = try {
    Instant.parse(this)
} catch (e: Exception) {
    null
}

private fun String.capitalizeFirstInternal(): String {
    return this.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
}
