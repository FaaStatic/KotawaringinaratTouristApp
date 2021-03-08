package com.suhaili.kotawaringinbarattourist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class explain : AppCompatActivity() {
lateinit var gambar : ImageView
lateinit var judul : TextView
lateinit var lokasi : TextView
lateinit var detail : TextView
lateinit var like : Button
lateinit var share : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explain)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val data : Bundle? = intent.extras
        gambar = findViewById(R.id.pic)
        judul = findViewById(R.id.judul)
        lokasi = findViewById(R.id.location)
        detail = findViewById(R.id.detail)
        like = findViewById(R.id.like)
        share = findViewById(R.id.share)

        Glide.with(this)
            .load(data?.getInt("picture"))
            .into(gambar)

        judul.text = data?.getString("judul")
        lokasi.text =data?.getString("location")
        detail.text = data?.getString("detail")

        supportActionBar?.title = data?.getString("judul")

        like.setOnClickListener { klik ->
            Toast.makeText(this,"Favorit!",Toast.LENGTH_SHORT).show()
        }

        share.setOnClickListener { klik ->
            Toast.makeText(this,"Share!",Toast.LENGTH_SHORT).show()
        }

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