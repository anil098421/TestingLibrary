// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("maven-publish")
}

// This is a workaround for JitPack
val publishCommand = "publishToMavenLocal"
val capitalized = publishCommand.replaceFirstChar { it.uppercase() }
tasks.register(publishCommand) {
    group = "publishing"
    description = "Publishes all Maven publications to Maven Local"
    dependsOn(gradle.includedBuilds.map { it.task(":$publishCommand") })
}

allprojects {
    // Avoid issues with JitPack
    group = "com.github.anil098421"
}