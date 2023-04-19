object ProjectConfiguration {
    const val applicationId: String = "com.github.jesushzc.musicplayer"
    const val versionMajor = 1
    const val versionMinor = 0
    const val versionPatch = 0
    const val internalVersionMajor = 1
    const val internalVersionMinor = 0
    const val internalVersionPatch = 0
    const val buildVersionCode = versionMajor + versionMinor + versionPatch
    const val buildVersionName = "${internalVersionMajor}.${internalVersionMinor}.${internalVersionPatch}"
    const val compileSdk = 33
    const val minSdk = 27
    const val targetSdk = 33
}

object Versions {
    const val androidApplication = "8.0.0"
    const val androidLibrary = "8.0.0"
    const val androidCore = "1.8.0"
    const val kotlin = "1.7.20"
    const val lifecycleRuntime = "2.3.1"
    const val activityCompose = "1.5.1"
    const val jUnit = "4.13.2"
    const val androidJUnit = "1.1.5"
    const val espressoCore = "3.5.1"
    const val composeBom = "2022.10.00"
    const val daggerHilt = "2.44"
    const val navigationCompose = "2.5.3"
    const val retrofit = "2.9.0"
    const val okhttp = "4.10.0"
    const val room = "2.4.3"
}