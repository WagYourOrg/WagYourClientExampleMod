import xyz.wagyourtail.patchbase.gradle.patchBase

plugins {
    id("java")
    id("xyz.wagyourtail.unimined") version "1.1.0"
    id ("xyz.wagyourtail.patchbase") version "1.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

unimined.minecraft {
    version("1.20.2")

    mappings {
        mojmap()
    }

    patchBase {

    }
}

dependencies {
    "patchBase"("xyz.wagyourtail:wagyourclient:1.0.0")
}

tasks.test {
    useJUnitPlatform()
}