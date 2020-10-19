import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    kotlin("kapt") version "1.4.10"
}
group = "me.clemens"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test-junit"))
    testImplementation("org.assertj:assertj-core:3.14.0")
    kapt("com.ryanharter.auto.value:auto-value-moshi-extension:1.0.0")
    api("com.ryanharter.auto.value:auto-value-moshi-annotations:1.0.0")

    api("com.google.auto.value:auto-value-annotations:1.7")
    kapt("com.google.auto.value:auto-value:1.7")
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}