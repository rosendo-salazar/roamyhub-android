package com.roamyhub.android.core.common.extensions

import java.util.Locale

/**
 * Returns true if the string is a valid email address
 */
fun String.isValidEmail(): Boolean {
    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\$".toRegex()
    return emailRegex.matches(this)
}

/**
 * Returns true if the string is a valid password (at least 8 characters, contains letter and number)
 */
fun String.isValidPassword(): Boolean {
    return this.length >= 8 &&
            this.any { it.isDigit() } &&
            this.any { it.isLetter() }
}

/**
 * Capitalizes the first letter of the string
 */
fun String.capitalizeFirst(): String {
    return this.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
    }
}

/**
 * Truncates the string to the specified length, adding ellipsis if truncated
 */
fun String.truncate(maxLength: Int, ellipsis: String = "..."): String {
    return if (this.length <= maxLength) this
    else "${this.substring(0, maxLength - ellipsis.length)}$ellipsis"
}

/**
 * Masks the string, showing only the first and last n characters
 */
fun String.mask(visibleChars: Int = 4, maskChar: Char = '*'): String {
    if (this.length <= visibleChars * 2) return this
    val start = this.substring(0, visibleChars)
    val end = this.substring(this.length - visibleChars)
    val masked = maskChar.toString().repeat(this.length - (visibleChars * 2))
    return "$start$masked$end"
}

/**
 * Returns true if the string contains only digits
 */
fun String.isDigitsOnly(): Boolean = this.all { it.isDigit() }

/**
 * Formats a phone number (basic formatting for display)
 */
fun String.formatPhoneNumber(): String {
    val cleaned = this.filter { it.isDigit() }
    return when (cleaned.length) {
        10 -> "(${cleaned.substring(0, 3)}) ${cleaned.substring(3, 6)}-${cleaned.substring(6)}"
        11 -> "+${cleaned[0]} (${cleaned.substring(1, 4)}) ${cleaned.substring(4, 7)}-${cleaned.substring(7)}"
        else -> this
    }
}

/**
 * Returns null if the string is blank, otherwise returns the string
 */
fun String.nullIfBlank(): String? = if (this.isBlank()) null else this
