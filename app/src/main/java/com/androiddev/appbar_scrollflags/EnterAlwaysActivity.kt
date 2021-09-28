package com.androiddev.appbar_scrollflags

import android.os.Bundle

class EnterAlwaysActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flag_enter_always)
        setToolbar("EnterAlways")
    }
}