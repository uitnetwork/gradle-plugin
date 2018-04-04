package com.uitnetwork

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TestTask  extends DefaultTask{
    String message = "default message"

    @TaskAction
    def doSomething() {
        println("This is doSomething() with message: $message")
    }
}
