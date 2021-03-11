plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("ris.platforms:build-plugins"))
    implementation(project(":kotlin-common"))

    implementation("com.android.tools.build:gradle")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
}
