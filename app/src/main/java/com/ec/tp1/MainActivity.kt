package com.ec.tp1

import android.content.ClipData
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.util.Log
import android.view.View
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.*
import com.ec.tp1.R.menu.menubar

class MainActivity : AppCompatActivity(), View.OnClickListener, MenuItem.OnMenuItemClickListener {
    private var TAG: String = "TP1"
    //var lastPseudo: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"onCreate")
        //Action bar
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar!!.title = "MainActivity"

        val refBtnOk: Button  = findViewById(R.id.btnOK)
        val refInputNom: EditText = findViewById(R.id.inputNom)

        //val refBtnSettings
        refBtnOk.setOnClickListener(this)
        refInputNom.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(menubar,menu)
        val refOptionPref: MenuItem? = menu?.findItem(R.id.optionPreferences)
        refOptionPref?.setOnMenuItemClickListener(this)
        return true
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.optionPreferences ->{
                //val t: Toast = Toast.makeText(this,"click sur pref", Toast.LENGTH_SHORT)
                val toSettingsActivity: Intent = Intent(this, SettingsActivity::class.java)
                startActivity(toSettingsActivity)
                return true
            }
            else ->{
                return true
            }
        }
    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnOK -> {
                val s: String = findViewById<EditText>(R.id.inputNom).text.toString().trim() //recuperer un champ texte
                //val t: Toast = Toast.makeText(this,s + " ajouté", Toast.LENGTH_SHORT)
                //lastPseudo = s
                //t.show()
                // nouvelle activité
                val bundle: Bundle = Bundle()
                bundle.putString("pseudo",s)

                val intentChoixListActivity: Intent = Intent(this, ChoixListActivity::class.java)
                intentChoixListActivity.putExtra("pseudo", bundle)
                startActivity(intentChoixListActivity)

            }
            R.id.inputNom -> {
                val t: Toast = Toast.makeText(this,"click sur input nom", Toast.LENGTH_SHORT)
                t.show()
            }


        }
    }



    override fun onStart(){
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart")
    }





}

