plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android") version "2.0.0"
    id("com.lagradost.cloudstream3.gradle")
}

android {
    namespace = "com.nguonc"
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
    val cloudstream by configurations
    cloudstream("com.lagradost:cloudstream3:pre-release")

    // Nạp thư viện Jackson Annotations hỗ trợ @JsonProperty
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.15.2")
}

cloudstream {
    authors = listOf("xiaopin129")
    description = "Nguồn C Provider"
}
