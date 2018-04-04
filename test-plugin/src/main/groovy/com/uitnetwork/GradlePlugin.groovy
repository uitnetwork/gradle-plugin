package com.uitnetwork

import org.gradle.api.Plugin
import org.gradle.api.Project

class GradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("helloWorld") {
            println("HelloWorld")
        }
    }
}
