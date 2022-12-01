rootProject.name = "ant-colony-simulation"
val destination = File(".git/hooks/commit-msg")
include("app")

plugins {
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.0.25"
}

gitHooks {
    commitMsg {
        conventionalCommits()
    }
    createHooks(true)
}