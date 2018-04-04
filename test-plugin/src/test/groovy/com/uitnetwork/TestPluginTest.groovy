package com.uitnetwork

import org.gradle.testkit.runner.GradleRunner

import static org.assertj.core.api.Assertions.assertThat
import static org.gradle.testkit.runner.TaskOutcome.SUCCESS

class TestPluginTest extends GroovyTestCase {
    def projectDir = new File(System.getProperty("user.dir") + "/testProjects")
    def pluginClasspathResource = getClass().classLoader.getResource("plugin-classpath.txt")
    def pluginClasspath = pluginClasspathResource.readLines().collect { new File(it) }

    void testHello() {
        def result = GradleRunner.create()
                .withProjectDir(projectDir)
                .withPluginClasspath(pluginClasspath)
                .withArguments("helloWorld")
                .build()

        assertThat(SUCCESS).isEqualTo(result.task(":helloWorld").getOutcome())
        assertThat(result.output).contains("HelloWorld from TestPlugin")
    }

}
