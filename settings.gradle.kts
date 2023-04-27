
rootProject.name = "otus-kotlin-homework"
include("m1-l1-hello")

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}