package com.uitnetwork

import org.gradle.testkit.runner.GradleRunner

import static org.assertj.core.api.Assertions.assertThat
import static org.gradle.testkit.runner.TaskOutcome.UP_TO_DATE

class TestPluginTest extends GroovyTestCase {
    def projectDir = new File("/tmp/gradle-plugin/test-plugin/src/test/resources/testProjects")
    def pluginClasspathResource = getClass().classLoader.getResource("plugin-classpath.txt")
    def pluginClasspath = pluginClasspathResource.readLines().collect { new File(it) }

    void testHello() {
        def result = GradleRunner.create()
                .withProjectDir(projectDir)
                .withPluginClasspath(pluginClasspath)
                .withArguments("hello")
                .build()

        assertThat(UP_TO_DATE).isEqualTo(result.task(":helloWorld").getOutcome())
        assertThat(result.output).contains("HelloWorld from TestPlugin")
    }

}
