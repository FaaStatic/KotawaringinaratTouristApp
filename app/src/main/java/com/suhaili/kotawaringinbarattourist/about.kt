package com.suhaili.kotawaringinbarattourist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.suhaili.kotawaringinbarattourist.databinding.ActivityAboutBinding


class about : AppCompatActivity() {
    lateinit var AboutBind : ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AboutBind = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(AboutBind.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="About Me"
        Glide.with(this)
                .load(R.drawable.aboutme)
                .apply(RequestOptions().override(250,250))
                .into(AboutBind.aboutpic)
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