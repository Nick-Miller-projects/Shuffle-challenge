plugins {
    kotlin("jvm") version "1.6.10"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "com.example"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
}
tasks.test {
    useJUnitPlatform()
}