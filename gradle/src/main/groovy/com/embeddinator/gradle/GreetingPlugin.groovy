package com.embeddinator.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.extensions.create("greeting", GreetingPluginExtension)
        project.task('hello') {
            doLast {
                println "${project.greeting.message} from ${project.greeting.greeter}, what?"
            }
        }
    }
}

class GreetingPluginExtension {
    String message
    String greeter
}