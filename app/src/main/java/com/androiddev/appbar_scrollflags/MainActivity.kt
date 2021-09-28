package com.androiddev.appbar_scrollflags

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    open fun setToolbar(title: String) {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.title = title
        setSupportActionBar(toolbar)
    }

    open fun showFlagEnterAlwaysBehavior(view: View?) {
        startScrollActivity(EnterAlwaysActivity::class.java)
    }

    open fun showFlagEnterAlwaysCollapsedBehavior(view: View?) {
        startScrollActivity(EnterAlwaysCollapsedActivity::class.java)
    }

    open fun showFlagExitUntilCollapsedBehavior(view: View?) {
        startScrollActivity(ExitUntilCollapsedActivity::class.java)
    }

    open fun showFlagScrollBehavior(view: View?) {
        startScrollActivity(ScrollActivity::class.java)
    }

    open fun showFlagSnapBehavior(view: View?) {
        startScrollActivity(SnapActivity::class.java)
    }

    private fun startScrollActivity(activity: Class<*>) {
        startActivity(Intent(this, activity))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}