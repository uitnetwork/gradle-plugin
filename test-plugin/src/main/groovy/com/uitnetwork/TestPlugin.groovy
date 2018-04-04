package com.uitnetwork

import org.gradle.api.Plugin
import org.gradle.api.Project

class TestPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.add("testPlugin", TestTaskConfig)
        project.task("helloWorld", type : TestTask) {
            group = "ABC"
            description = "This is just a hello world"
        }
        project.task("helloWorld2", type: TestTask) {
            group = "ABC"
            description = "This is just a hello world 2"
        }

    }
}
