package com.github.hx1176406648.ideaplugintemplate.services

import com.github.hx1176406648.ideaplugintemplate.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
