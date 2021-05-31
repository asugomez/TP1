package com.ec.tp1

import android.annotation.SuppressLint
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
        setContentView(R.xml.text_row_item)
        val pseudo: String? = intent.getStringExtra("pseudo")
        this.title="$pseudo lists"

        val recyclerView = findViewById<RecyclerView>(R.id.list)
        val items: MutableList<Item> = mutableListOf()


        recyclerView.adapter = ItemAdapter(items)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)



    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnNewList->{
                //ajouter une nouvelle list
                val nameNewList: String = findViewById<EditText>(R.id.newlist).text.toString()
                //r
            }
        }
    }

    /*override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnNewList -> {
                val newListName = t.text.toString()
                Toast.makeText(this, newListName, Toast.LENGTH_SHORT).show()
                adapter.addData(newListName)
                t.setText("")
            }
        }

    }

     */
    /*

        repeat(3){
            lists.add(List("list ${it + 1}"))
        }

        val adapter = AdapterList(lists)

        var refBtnNewList: Button = findViewById(R.id.btnNewList)
        var refEditNewList: EditText =findViewById(R.id.newlist)

        refBtnNewList.setOnClickListener(this)


        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val change = Intent(this,ShowListActivity::class.java)
        change.putExtra("pseudo", pseudo)

        adapter.setOnItemClickListener(object : AdapterList.OnItemClickListener {
            override fun onItemClick(position: Int) {
                val listName = lists[position].listTextStr
                val t: Toast = Toast.makeText(applicationContext, listName, Toast.LENGTH_SHORT)
                t.show()
                change.putExtra("list", listName)
                startActivity(change)
            }

        })
     */

}
