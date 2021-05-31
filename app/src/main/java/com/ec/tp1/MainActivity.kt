package com.ec.tp1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private var TAG: String = "Hello"
    var lastPseudo: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"onCreate")
        val refBtnOk: Button  = findViewById(R.id.btnOK)
        val refInputNom: TextView = findViewById(R.id.inputNom)
        //Action bar
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar!!.title = "MainActivity"


        //val refBtnSettings

        refBtnOk.setOnClickListener(this)
        refInputNom.setOnClickListener(this)
    }
    /*
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_settings -> {
            // User chose the "Settings" item, show the app settings UI...
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
    */
    override fun onStart(){
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart")
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnOK -> {
                val s: String = findViewById<TextView>(R.id.inputNom).text.toString()//recuperer un champ texte
                val t: Toast = Toast.makeText(this,s + " ajouté", Toast.LENGTH_SHORT)
                lastPseudo = s
                t.show()
                // nouvelle activité
                val b: Bundle = Bundle()
                b.putString("pseudo",s)
                val toChoixListActivity: Intent = Intent(this, ChoixListActivity::class.java).apply{
                    putExtra("pseudo", b)
                }
                startActivity(toChoixListActivity)

            }
            R.id.inputNom -> {
                print("Click sur input nom")
                val t: Toast = Toast.makeText(this,"click sur input nom", Toast.LENGTH_SHORT)
                t.show()
            }

        }
    }


}

