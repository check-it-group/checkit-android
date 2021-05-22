package com.checkit.app

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

fun AppCompatActivity.setAsActionBar(toolbar: Toolbar) {
    setSupportActionBar(toolbar)
    supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    supportActionBar!!.setDisplayShowHomeEnabled(true)
    supportActionBar!!.setDisplayShowTitleEnabled(false)
    toolbar.setNavigationOnClickListener { onBackPressed() }
}