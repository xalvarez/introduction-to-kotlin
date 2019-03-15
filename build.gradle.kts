plugins {
    kotlin("jvm") version "1.3.21"
    application
    idea
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit5"))
}

application {
    mainClassName = "com.github.xalvarez.introductiontokotlin.Application"
}
