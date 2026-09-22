import com.lagradost.cloudstream3.gradle.BuildTask

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.lagradost.cloudstream3.gradle")
}

android {
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    add("cloudstream", "com.lagradost:cloudstream3:pre-release")
}

tasks.register<BuildTask>("make") {
    authors = listOf("xiaopin129")
    description = "Nguồn C Provider"
}
