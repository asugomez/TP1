package com.ec.tp1

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ChoixListActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choix_list)

        //Action bar
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar!!.title = "ChoixListActivity"

        // recuperer bundle
        val b: Bundle? = this.intent.extras
        val s: String? = b?.getString("pseudo")
        val t: Toast = Toast.makeText(this, "pseudo reçu " + s, Toast.LENGTH_SHORT)
        t.show()


    }
}