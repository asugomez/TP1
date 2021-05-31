package com.ec.tp1

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.Toast

class ChoixListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choix_list)

        //Action bar
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar!!.title = "ChoixListActivity"

        val recyclerview = findViewById<RecyclerView>(R.id.list)
        val posts: MutableList<List> = mutableListOf()

        repeat(10) {
            val pseudo =
            posts.add(pseudo)
        }

        recyclerview.adapter = PostAdapter(posts)
        recyclerview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        // recuperer bundle
        val s: String? = intent.getStringExtra("pseudo")
        //val b: Bundle? = this.intent.extras
        //val s: String? = b?.getString("pseudo")
        val t: Toast = Toast.makeText(this, "pseudo reçu " + s, Toast.LENGTH_SHORT)
        t.show()


    }
}