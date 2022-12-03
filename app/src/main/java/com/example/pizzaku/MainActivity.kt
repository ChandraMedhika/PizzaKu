package com.example.pizzaku

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPizza: RecyclerView
    private var list: ArrayList<Pizza> = arrayListOf()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPizza = findViewById(R.id.rv_pizza)
        rvPizza.setHasFixedSize(true)

        /*list.addAll(PizzaData.listData)
        showRecyclerList()*/

        list.addAll(PizzaData.listData)
        showRecyclerCardView()

        /*val btnRincian : Button = findViewById(R.id.btn_set_rincian)
        btnRincian.setOnClickListener(this)*/

    }


    /*private fun showRecyclerList() {
        rvPizza.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListPizzaAdapter(list)
        rvPizza.adapter = listHeroAdapter
    }*/

    private fun showRecyclerCardView(){
        rvPizza.layoutManager = LinearLayoutManager(this)
        val cardViewPizzaAdapter = CardViewPizzaAdapter(list)
        rvPizza.adapter = cardViewPizzaAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_profile -> {
                //
            }
        }
    }

    /*override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_set_rincian -> {
                val moveIntent = Intent(this@MainActivity,Avocadobiltong_pizza_detail::class.java)
                startActivity(moveIntent)
            }
        }
    }*/
}
