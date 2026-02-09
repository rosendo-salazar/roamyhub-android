pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "roamyhub-android"
include(":app")
include(":core:common")
include(":core:domain")
include(":core:network")
include(":core:data")
include(":core:ui")
include(":feature:auth")
include(":feature:plans")
include(":feature:purchase")
include(":feature:esims")
include(":feature:profile")
