package com.checkit.app

import android.os.Bundle
import android.view.LayoutInflater
import com.checkit.app.databinding.ActivityMainBinding

class MainActivity() : ViewBindingActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setAsActionBar(binding.toolbar)
    }

}