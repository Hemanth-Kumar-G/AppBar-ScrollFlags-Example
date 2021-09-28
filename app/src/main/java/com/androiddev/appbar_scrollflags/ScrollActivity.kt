package com.androiddev.appbar_scrollflags

import android.os.Bundle

class ScrollActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flag_scroll)
        setToolbar("Scroll")
    }
}