// Kotlin settings specific for all Kotlin modules. We configure this after the fact because
// the Kotlin plugins for JVM and Android cannot be applied both.

plugins.withId("org.jetbrains.kotlin.jvm") {
    configure()
}

plugins.withId("kotlin-android") {
    configure()
}

fun Project.configure() {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
            allWarningsAsErrors = true
            // treat nullability warnings with Java APIs as errors
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }
}
