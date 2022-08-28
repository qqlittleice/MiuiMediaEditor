import com.android.build.gradle.internal.api.BaseVariantOutputImpl

plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 33
    buildToolsVersion = "33.0.0"
    namespace = "com.yuk.mediaeditor"
    defaultConfig {
        applicationId = namespace
        minSdk = 26
        targetSdk = 33
        versionCode = 15
        versionName = "1.5"
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            setProguardFiles(listOf("proguard-rules.pro", "proguard-log.pro"))

        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.majorVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/**"
            excludes += "/kotlin/**"
            excludes += "/*.txt"
            excludes += "/*.bin"
            excludes += "/*.json"
        }
        dex {
            useLegacyPackaging = true
        }
        applicationVariants.all {
            outputs.all {
                (this as BaseVariantOutputImpl).outputFileName = "MiuiMediaEditor-$versionName($versionCode)-$name.apk"
            }
        }
    }

}

dependencies {
    compileOnly("de.robv.android.xposed:api:82")
    implementation("com.github.kyuubiran:EzXHelper:1.0.1")
}
