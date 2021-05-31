package com.ec.tp1

import android.content.ClipData
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import com.ec.tp1.adapter.Item
import com.ec.tp1.adapter.ItemAdapter

class ShowListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_list)
        val list_name: String? = intent.getStringExtra("list")
        this.title = "Items of $list_name"

        val recyclerView = findViewById<RecyclerView>(R.id.list)
        val items: MutableList<Item> = mutableListOf()

        repeat(3) {
            items.add(Item("item  ${it + 1}"))
        }


        val adapter = ItemAdapter(items)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)


        val refBtnNewList: Button = findViewById(R.id.btnNewList)
        val refEdtTxtNewList: EditText = findViewById(R.id.newlist)
        refBtnNewList.setOnClickListener {
            val newItemName = refEdtTxtNewList.text.toString()
            adapter.addData(newItemName) // add new item
            refEdtTxtNewList.setText("") // clear the input area
        }
    }
}
