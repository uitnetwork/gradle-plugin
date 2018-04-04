package com.uitnetwork

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TestTask  extends DefaultTask{
    @TaskAction
    def doSomething() {
        def outputMessage = project.extensions.testPlugin.someConfig ?: "Default Message"
        println("HelloWorld from TestPlugin with message: $outputMessage")
    }
}
