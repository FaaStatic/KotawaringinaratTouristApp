package com.suhaili.kotawaringinbarattourist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.suhaili.kotawaringinbarattourist.Adapter.AdapterKobar
import com.suhaili.kotawaringinbarattourist.Data.KobarData
import com.suhaili.kotawaringinbarattourist.Model.KobarModel

class MainActivity : AppCompatActivity() {

    private lateinit var Recycle : RecyclerView
    private var prosesdata : ArrayList<KobarModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title="List of Tourism Locations"
        Recycle  = findViewById(R.id.viewrecycler)
        Recycle.setHasFixedSize(true)
        prosesdata.addAll(KobarData.getDataKobar)
        listview()
    }

    fun listview(){
        Recycle.layoutManager = LinearLayoutManager(this)
        val listKobar = AdapterKobar(prosesdata)
        Recycle.adapter = listKobar
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about-> {
                startActivity(Intent(this,about::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }


}