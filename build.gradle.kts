plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    composeOptions { kotlinCompilerExtensionVersion = "1.5.15" }
    buildFeatures { compose = true }
    namespace = "com.touchline26.app"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.touchline26.app"
        minSdk = 23
        targetSdk = 36
        versionCode = 61
        versionName = "6.1"
    }
}

dependencies {
    implementation("androidx.activity:activity-compose:1.10.1")
    implementation("androidx.compose.ui:ui:1.7.8")
    implementation("androidx.compose.material3:material3:1.3.1")
    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("androidx.webkit:webkit:1.14.0")
}
