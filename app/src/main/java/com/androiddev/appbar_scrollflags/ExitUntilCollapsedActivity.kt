package com.androiddev.appbar_scrollflags

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.google.android.material.appbar.CollapsingToolbarLayout


class ExitUntilCollapsedActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flag_exit_until_collapsed)
        setToolbar("ExitUntilCollapsed")
    }

    override fun setToolbar(title: String) {
        setSupportActionBar(findViewById<View>(R.id.toolbar) as Toolbar)
        val collapsingToolbar = findViewById<CollapsingToolbarLayout>(R.id.collapsingToolbarLayout)
        collapsingToolbar.title = title
    }
}