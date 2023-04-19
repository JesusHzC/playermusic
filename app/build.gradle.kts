plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
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
    implementation (platform("androidx.compose:compose-bom:2022.10.00"))
    implementation ("androidx.compose.ui:ui")
    implementation ("androidx.compose.ui:ui-graphics")
    implementation ("androidx.compose.ui:ui-tooling-preview")
    implementation ("androidx.compose.material3:material3")
    testImplementation ("junit:junit:${Versions.jUnit}")
    androidTestImplementation ("androidx.test.ext:junit:${Versions.androidJUnit}")
    androidTestImplementation ("androidx.test.espresso:espresso-core:${Versions.espressoCore}")
    androidTestImplementation (platform("androidx.compose:compose-bom:2022.10.00"))
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4")
    debugImplementation ("androidx.compose.ui:ui-tooling")
    debugImplementation ("androidx.compose.ui:ui-test-manifest")
}