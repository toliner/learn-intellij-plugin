package com.github.toliner.learnintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.toliner.learnintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
