package com.ec.tp1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ec.tp1.adapter.Item
import com.ec.tp1.adapter.ItemAdapter

class ChoixListActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_choix_list)
        setContentView(R.layout.activity_choix_list)
        val pseudo: String? = intent.getStringExtra("pseudo")
        this.title="$pseudo item"

        val recyclerView = findViewById<RecyclerView>(R.id.list)
        val items: MutableList<Item> = mutableListOf()

        repeat(3){
            items.add(Item("item ${it + 1}"))
        }

        val adapter: ItemAdapter = ItemAdapter(items)

        val refBtnNewList: Button = findViewById(R.id.btnNewList)
        val refEdtTxtNewList: EditText = findViewById(R.id.newlist)

        refBtnNewList.setOnClickListener{
            val nameNewList: String = refEdtTxtNewList.text.toString()
            adapter.addData(nameNewList)
            refEdtTxtNewList.setText("")
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val toShowListActivity = Intent(this, ShowListActivity::class.java).apply {
            putExtra("pseudo", pseudo)
        }

        adapter.setOnItemClickListener(object : ItemAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val listName = items[position].listTextStr
                Toast.makeText(applicationContext, listName, Toast.LENGTH_SHORT).show()
                toShowListActivity.putExtra("list", listName)
                startActivity(toShowListActivity )
            }

        })

    }




    }

}
