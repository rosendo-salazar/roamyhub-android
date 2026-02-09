package com.roamyhub.android.navigation

/**
 * Sealed interface representing all navigation routes in the app
 */
sealed interface Route {
    val route: String

    // Auth routes
    sealed interface Auth : Route {
        data object Graph : Auth {
            override val route = "auth"
        }
        data object Login : Auth {
            override val route = "login"
        }
        data object Signup : Auth {
            override val route = "signup"
        }
        data object ForgotPassword : Auth {
            override val route = "forgot_password"
        }
        data class Verification(val email: String) : Auth {
            override val route = "verification/$email"
            companion object {
                const val routePattern = "verification/{email}"
            }
        }
    }

    // Main routes
    sealed interface Main : Route {
        data object Graph : Main {
            override val route = "main"
        }
        data object Home : Main {
            override val route = "home"
        }
        data object Browse : Main {
            override val route = "browse"
        }
        data object MyESims : Main {
            override val route = "my_esims"
        }
        data object Profile : Main {
            override val route = "profile"
        }
    }
}
