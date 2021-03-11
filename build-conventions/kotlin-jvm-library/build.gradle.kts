plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("ris.platforms:build-plugins"))
    implementation(project(":kotlin-common"))

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
}
