package com.suhaili.kotawaringinbarattourist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class explain : AppCompatActivity() {
lateinit var gambar : ImageView
lateinit var judul : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explain)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val data : Bundle? = intent.extras
        gambar = findViewById(R.id.pic)
        judul = findViewById(R.id.judul)

        Glide.with(this)
            .load(data?.getInt("picture"))
            .into(gambar)

        judul.text = data?.getString("judul")
        supportActionBar?.title = data?.getString("judul")


    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home ->{
                startActivity(Intent(this,MainActivity::class.java))
                finish()
                return true
            }
            else-> {
                return super.onOptionsItemSelected(item)
            }
        }

    }

}