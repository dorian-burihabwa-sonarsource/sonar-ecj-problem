plugins {
    java
    id("org.sonarqube") version "latest.release"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "net.openhft", name = "affinity", version = "3.2.2")
    implementation("com.google.inject:guice:4.2.2")
}
