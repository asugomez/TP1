@file:Suppress("DEPRECATION")

package com.ec.tp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceActivity

class SettingsActivity :PreferenceActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.preferences);
    }

}