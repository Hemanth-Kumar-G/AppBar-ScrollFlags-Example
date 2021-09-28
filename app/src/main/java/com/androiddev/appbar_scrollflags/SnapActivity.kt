package com.androiddev.appbar_scrollflags

import android.os.Bundle

class SnapActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flag_snap)
        setToolbar("Snap")
    }
}