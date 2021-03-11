plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("ris.platforms:build-plugins"))
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin")
}
