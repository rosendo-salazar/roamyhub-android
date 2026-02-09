# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Test Commands

```bash
# Build the project
./gradlew build

# Build debug APK
./gradlew assembleDebug

# Run unit tests
./gradlew test

# Run a single unit test class
./gradlew testDebugUnitTest --tests "com.roamyhub.app.ExampleUnitTest"

# Run instrumented tests (requires connected device/emulator)
./gradlew connectedAndroidTest

# Clean build
./gradlew clean

# Lint check
./gradlew lint
```

## Architecture

- **Single-module Android app** (`app/`) using Kotlin and Jetpack Compose
- **Single-activity architecture**: `MainActivity` is the sole entry point, using `setContent {}` for Compose UI
- **Material 3 theming** with dynamic color support (Android 12+), falling back to a static purple/pink color scheme on older devices
- **Compose BOM** manages all Compose dependency versions centrally via `gradle/libs.versions.toml`

## Key Configuration

| Setting | Value |
|---------|-------|
| Package | `com.roamyhub.app` |
| Compile/Target SDK | 36 |
| Min SDK | 24 |
| Kotlin JVM Target | 11 |
| AGP | 8.13.2 |
| Kotlin | 2.0.21 |

## Project Conventions

- Version catalog (`gradle/libs.versions.toml`) is used for all dependency management — add new dependencies there, not inline
- Theme is defined in `app/src/main/java/com/roamyhub/app/ui/theme/` (Color.kt, Theme.kt, Type.kt)
- XML theme (`themes.xml`) uses `Material.Light.NoActionBar` as the base; actual theming is handled in Compose
- Edge-to-edge display is enabled via `enableEdgeToEdge()` in MainActivity
