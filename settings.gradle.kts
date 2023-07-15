rootProject.name = "Template"
include(":shared")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        kotlin("multiplatform").version("1.8.22")
        kotlin("plugin.serialization").version("1.8.22")
        id("com.android.library").version("7.4.2")
        id("io.realm.kotlin").version("1.5.2")
        id("com.android.application") version "7.4.2"
        id("org.jetbrains.kotlin.android") version "1.7.20"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            library("kotlinx-coroutines-core", "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
            library("touchlab-kermit", "co.touchlab:kermit:1.2.2")
            library("ktor-client-core", "io.ktor:ktor-client-core:2.2.4")
            library("ktor-client-ios", "io.ktor:ktor-client-ios:2.2.4")
            library("ktor-client-okhttp", "io.ktor:ktor-client-okhttp:2.2.4")
            library("kotlinx-serialization-json", "org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
            library("kotlinx-datetime", "org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
            library("realm-base", "io.realm.kotlin:library-base:1.5.2")
        }
    }
}
include(":androidapp")
