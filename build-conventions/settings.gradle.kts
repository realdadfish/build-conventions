pluginManagement {
    repositories {
		mavenCentral()
		google()
		gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
		mavenCentral()
		google()
		gradlePluginPortal()
    }
}

rootProject.name = "build-conventions"

include(":kotlin-common")
include(":kotlin-jvm-library")
include(":kotlin-android-library")