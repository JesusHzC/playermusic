plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = ProjectConfiguration.applicationId
    compileSdk = ProjectConfiguration.compileSdk

    defaultConfig {
        applicationId = ProjectConfiguration.applicationId
        minSdk = ProjectConfiguration.minSdk
        targetSdk = ProjectConfiguration.targetSdk
        versionCode = ProjectConfiguration.buildVersionCode
        versionName = ProjectConfiguration.buildVersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packaging {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {
    implementation ("androidx.core:core-ktx:${Versions.androidCore}")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}")
    implementation ("androidx.activity:activity-compose:${Versions.activityCompose}")
    implementation (platform("androidx.compose:compose-bom:${Versions.composeBom}"))
    implementation ("androidx.compose.ui:ui")
    implementation ("androidx.compose.ui:ui-graphics")
    implementation ("androidx.compose.ui:ui-tooling-preview")
    implementation ("androidx.compose.material3:material3")
    testImplementation ("junit:junit:${Versions.jUnit}")
    androidTestImplementation ("androidx.test.ext:junit:${Versions.androidJUnit}")
    androidTestImplementation ("androidx.test.espresso:espresso-core:${Versions.espressoCore}")
    androidTestImplementation (platform("androidx.compose:compose-bom:${Versions.composeBom}"))
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-tooling")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")

    //Dagger Hilt
    implementation("com.google.dagger:hilt-android:${Versions.daggerHilt}")
    kapt("com.google.dagger:hilt-android-compiler:${Versions.daggerHilt}")

    //Navigation
    implementation ("androidx.navigation:navigation-compose:${Versions.navigationCompose}")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:${Versions.retrofit}")
    implementation ("com.squareup.retrofit2:converter-gson:${Versions.retrofit}")

    //OkHttp
    implementation ("com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}")

    //Room
    implementation ("androidx.room:room-runtime:${Versions.room}")
    kapt("androidx.room:room-compiler:${Versions.room}")
    implementation ("androidx.room:room-ktx:${Versions.room}")
}

kapt {
    correctErrorTypes = true
}