package com.github.entera.gradle.relnotes.plugin.task

import org.gradle.api.internal.ConventionTask
import org.gradle.api.tasks.TaskAction

class GenerateTask extends ConventionTask {

    //---------------------------------------------------------------------------------------------
    // METHODS.
    //---------------------------------------------------------------------------------------------

    @TaskAction
    void generate() {
        println "generate()"
    }

}