package com.ec.tp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var TAG: String = "Hello"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"onCreate")
        val refBtnOk : Button = findViewById(R.id.btnOK)
        val inputNom : TextView = findViewById(R.id.inputNom)

        refBtnOk.setOnClickListener(this)
        inputNom.setOnClickListener(this)
    }

    override fun onStart(){
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart")
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    fun enterName(){

    }

    fun foo1(view: View) {}

    fun saveName(view: View) {

    }

}