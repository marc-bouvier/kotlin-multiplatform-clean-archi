plugins {
    kotlin("multiplatform")
}
group = "fr.baldir.showcase"
version = "1.0-SNAPSHOT"
repositories {
    google()
    mavenCentral()
    mavenLocal()
}
kotlin {
    js(IR) {
        browser {
            testRuns["test"].executionTask.configure {
                useMocha()
            }
        }
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(project(":shared-domain"))
                implementation(kotlin("stdlib-common"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-js"))
            }
        }
    }
}
