plugins {
    `java-library`
    `maven-publish`
}

group = "com.romcon.pft"
version = "0.2.1"
description = "Shared error-code catalogue, API exceptions and constants for PFT services"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
    withSourcesJar()
}

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name = "pft-commons"
                description = project.description
                url = "https://github.com/Kostyanoid/pft-commons"
            }
        }
    }
}