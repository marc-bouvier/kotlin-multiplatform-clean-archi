rootProject.name = "kotlin-multiplatform-clean-archi"

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("multiplatform") version kotlinVersion
        kotlin("jvm") version kotlinVersion
        kotlin("js") version kotlinVersion
    }
}

include(":shared-domain")
include(":jvm-cli-app")
include(":js-browser-app")

