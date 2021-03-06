/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package io.vortex.gradle.safety.deps.plugin

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import spock.lang.Specification

/**
 * A simple unit test for the 'io.vortex.gradle.safety.deps.plugin.greeting' plugin.
 */
public class VortexSafetyDepsPluginTest extends Specification {
    def "plugin registers task"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply("io.vortex.gradle.safety.deps.plugin.greeting")

        then:
        project.tasks.findByName("greeting") != null
    }
}
