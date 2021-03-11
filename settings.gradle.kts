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

includeBuild("platforms")
includeBuild("build-conventions")

include(
        ":jvm-library",
        ":android-library"
)
