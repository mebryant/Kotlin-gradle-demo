plugins {
    id("org.jetbrains.kotlin.js") version "1.3.41"
}

group = "com.mebryant.example"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin.target.browser { }