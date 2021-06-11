package com.github.gabsone.intellijmyfirstplugin.services

import com.github.gabsone.intellijmyfirstplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
