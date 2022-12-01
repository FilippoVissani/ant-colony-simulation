plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.gitSemVer)
    alias(libs.plugins.kotlinQA)
    alias(libs.plugins.dokka)
    alias(libs.plugins.taskTree)
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.bundles.kotlin.testing)
}

application {
    mainClass.set("io.github.filippovissani.acs.AppKt")
}

kotlin {
    target {
        compilations.all {
            kotlinOptions {
                allWarningsAsErrors = true
                freeCompilerArgs = listOf("-opt-in=kotlin.RequiresOptIn")
            }
        }
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

gitSemVer {
    buildMetadataSeparator.set("-")
    maxVersionLength.set(20)
}
