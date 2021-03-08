package com.suhaili.kotawaringinbarattourist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var imageme : ImageView
        setContentView(R.layout.activity_about)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="About Me"
        imageme = findViewById(R.id.aboutpic)
        Glide.with(this)
                .load(R.drawable.aboutme)
                .apply(RequestOptions().override(250,250))
                .into(imageme)
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