package com.roamyhub.android.core.ui.theme

import androidx.compose.ui.graphics.Color

// Brand Colors (matching iOS app)
val BrandPrimary = Color(0xFF14B8A6) // Teal/Turquoise
val BrandSecondary = Color(0xFF06B6D4) // Cyan
val BrandDark = Color(0xFF235479) // Dark Blue
val AccentGreen = Color(0xFF10B981) // Success Green

// Status Colors
val StatusSuccess = Color(0xFF10B981) // Green
val StatusWarning = Color(0xFFF59E0B) // Amber
val StatusError = Color(0xFFEF4444) // Red
val StatusInfo = Color(0xFF3B82F6) // Blue

// Tailwind Gray Scale (for consistent grays)
val Gray50 = Color(0xFFF9FAFB)
val Gray100 = Color(0xFFF3F4F6)
val Gray200 = Color(0xFFE5E7EB)
val Gray300 = Color(0xFFD1D5DB)
val Gray400 = Color(0xFF9CA3AF)
val Gray500 = Color(0xFF6B7280)
val Gray600 = Color(0xFF4B5563)
val Gray700 = Color(0xFF374151)
val Gray800 = Color(0xFF1F2937)
val Gray900 = Color(0xFF111827)
val Gray950 = Color(0xFF030712)

// Semantic Colors - Light Theme
val BackgroundLight = Color.White
val SurfaceLight = Gray50
val OnBackgroundLight = Gray900
val OnSurfaceLight = Gray800

// Semantic Colors - Dark Theme
val BackgroundDark = Gray950
val SurfaceDark = Gray900
val OnBackgroundDark = Gray50
val OnSurfaceDark = Gray100

// Additional Semantic Colors
val DividerLight = Gray200
val DividerDark = Gray700
val BorderLight = Gray300
val BorderDark = Gray600

// Data Usage Colors
val DataUsageActive = BrandPrimary
val DataUsageWarning = StatusWarning
val DataUsageCritical = StatusError
val DataUsageBackground = Gray200

// eSIM Status Colors
val ESimActive = StatusSuccess
val ESimExpired = Gray500
val ESimDepleted = StatusError
val ESimPending = StatusWarning
