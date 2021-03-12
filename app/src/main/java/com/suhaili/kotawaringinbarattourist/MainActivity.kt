package com.suhaili.kotawaringinbarattourist


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.suhaili.kotawaringinbarattourist.Adapter.AdapterKobar
import com.suhaili.kotawaringinbarattourist.Adapter.AdapterKobarList
import com.suhaili.kotawaringinbarattourist.Data.KobarData
import com.suhaili.kotawaringinbarattourist.Model.KobarModel
import com.suhaili.kotawaringinbarattourist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var BindView : ActivityMainBinding
    private lateinit var Recycle : RecyclerView
    private var prosesdata : ArrayList<KobarModel> = arrayListOf()
    var listpic = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(BindView.root)
        supportActionBar?.title="List of Tourism Locations"
        Recycle  = BindView.viewrecycler
        Recycle.setHasFixedSize(true)
        prosesdata.addAll(KobarData.getDataKobar)
        listviewpic()


    }

    fun listviewpic(){
        Recycle.layoutManager = LinearLayoutManager(this)
        val listKobar = AdapterKobar(prosesdata)
        Recycle.adapter = listKobar
    }

    fun listview(){
        Recycle.layoutManager = LinearLayoutManager(this)
        val listKobar = AdapterKobarList(prosesdata)
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
                finish()
            }R.id.Listviewchange->{
                if(listpic == true){
                    listview()
                    listpic = false
                }else{
                    listviewpic()
                    listpic = true
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }



    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }


}