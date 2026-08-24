plugins {
    id("com.android.application")
}

android {
    namespace = "com.bailan.stressbegone"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.bailan.stressbegone"
        minSdk = 24
        targetSdk = 36
        versionCode = 13
        versionName = "1.3-test"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
