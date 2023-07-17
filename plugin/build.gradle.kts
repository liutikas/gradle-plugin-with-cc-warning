plugins {
    `java-gradle-plugin`
    id("org.jetbrains.kotlin.jvm") version "1.9.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

gradlePlugin {
    // Define the plugin
    val greeting by plugins.creating {
        id = "com.example.gradle.greeting"
        implementationClass = "com.example.gradle.GradlePluginPlugin"
    }
}
