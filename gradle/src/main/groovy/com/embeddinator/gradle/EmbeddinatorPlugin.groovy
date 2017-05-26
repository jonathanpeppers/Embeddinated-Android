package com.embeddinator.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class EmbeddinatorPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.extensions.create("embeddinator", EmbeddinatorPluginExtension)
        project.task('embeddinator') {
            doLast {
                println "${project.embeddinator.message} from ${project.embeddinator.greeter}, what?"
            }
        }
    }
}

class EmbeddinatorPluginExtension {
    String message
    String greeter
}