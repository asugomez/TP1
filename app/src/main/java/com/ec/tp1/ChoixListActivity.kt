package com.ec.tp1


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast
import com.ec.tp1.adapter.Item
import com.ec.tp1.adapter.ItemAdapter

class ChoixListActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choix_list)
        val bundle2: Bundle? = intent.extras
        if(bundle2 != null){
            val pseudo: Bundle? = intent.getBundleExtra("pseudo")
            val t: Toast = Toast.makeText(this,pseudo?.getString("pseudo"), Toast.LENGTH_SHORT)
            t.show()
        }
        Log.i("hola", "abc")

        /*val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        val items: MutableList<Item> = mutableListOf()
        val pseudo: String? = intent.getStringExtra("pseudo")
        val t: Toast = Toast.makeText(this,pseudo, Toast.LENGTH_SHORT)
        t.show()

        repeat(3){
            val item = Item("item $it")
            items.add(item)
        }

        recyclerView.adapter = ItemAdapter(items)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

         */
    }


}

/*

        val pseudo: String? = intent.getStringExtra("pseudo")
        this.title="$pseudo item"

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
        //  Permet de faire la liaison (Bind) entre la vue RecyclerView et une liste de données.
        recyclerView.adapter = adapter
        // Permet de positionner correctement l'ensemble des données de la liste.
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

    override fun onClick(v: View?) {
        when(v?.id){

        }
 */
