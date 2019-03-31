plugins {
    kotlin("jvm") version "1.3.21"
    idea
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}