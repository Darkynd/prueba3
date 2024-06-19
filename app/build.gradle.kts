plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "es.uji.al341571.pokeuji"
    compileSdk = 34

    defaultConfig {
        applicationId = "es.uji.al341571.pokeuji"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Activity ktx:
    implementation("androidx.activity:activity-ktx:1.9.0")
    // ViewModelScope:
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.1")
    // Retrofit:
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    // Moshi:
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    // Glide:
    implementation("com.github.bumptech.glide:glide:4.12.0")
    // Dialogs:
    implementation("androidx.fragment:fragment-ktx:1.7.1")
    // Exceptions:
    implementation("org.chromium.net:cronet-api:119.6045.31")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}