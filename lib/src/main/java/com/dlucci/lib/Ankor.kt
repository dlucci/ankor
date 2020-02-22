package com.dlucci.lib

import android.view.View

open class Ankor {

    fun getName() = "Hello world!"

    class Builder {
        private lateinit var url : String

        private lateinit var view : View
    }

}