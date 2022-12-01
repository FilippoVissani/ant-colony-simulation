plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.gitSemVer)
    alias(libs.plugins.kotlinQA)
    alias(libs.plugins.dokka)
    alias(libs.plugins.taskTree)
    alias(libs.plugins.sonarqube)
    jacoco
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

tasks.test {
    useJUnitPlatform()
}

gitSemVer {
    buildMetadataSeparator.set("-")
    maxVersionLength.set(20)
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required.set(true)
        html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
    }
}

sonarqube {
    properties {
        property("sonar.projectKey", "FilippoVissani_ant-colony-simulation")
        property("sonar.organization", "filippovissani")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
