package com.example.myapplicationdemo

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationdemo.adapter.PersonAdapter
import com.example.myapplicationdemo.model.Person
import com.example.myapplicationdemo.utils.PersonsListUtils
import io.paperdb.Paper
import java.sql.DriverManager.println
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PersonAdapter
    var peopleList = mutableListOf<Person>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Paper.init(this)
        recyclerView = findViewById(R.id.recyclerView)
        adapter = PersonAdapter(initUI())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_sort_name -> {
                sortByName()
                return true
            }
            R.id.action_sort_age -> {
                sortByAge()
                return true
            }
            R.id.action_sort_city -> {
                sortByCity()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun initUI(): List<Person> {
        var list = PersonsListUtils.addPersons()
        println("list = ${list.size}")
        Log.d("MainActivity", "list = $list");
        return list
    }

    private fun sortByName() {
        var list = adapter.tempList
        list = list.sortedBy { it.name }
        adapter.mList = list
        adapter.notifyDataSetChanged()
    }

    private fun sortByAge() {
        var list = adapter.tempList
        list = list.sortedBy { it.age }
        adapter.mList = list
        adapter.notifyDataSetChanged()
    }

    private fun sortByCity() {
        var list = adapter.tempList
        list = list.sortedBy { it.city }
        adapter.mList = list
        adapter.notifyDataSetChanged()
    }
}