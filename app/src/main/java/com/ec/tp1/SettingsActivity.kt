@file:Suppress("DEPRECATION")

package com.ec.tp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceActivity

class SettingsActivity :PreferenceActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        //Action bar
        //setSupportActionBar(findViewById(R.id.my_toolbar))
        //supportActionBar?.title = "Settings"
    }

}