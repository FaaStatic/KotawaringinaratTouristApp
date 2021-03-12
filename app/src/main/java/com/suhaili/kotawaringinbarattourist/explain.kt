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
import com.suhaili.kotawaringinbarattourist.databinding.ActivityExplainBinding
import com.suhaili.kotawaringinbarattourist.databinding.ActivityMainBinding

class explain : AppCompatActivity() {

lateinit var binExplain : ActivityExplainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binExplain = ActivityExplainBinding.inflate(layoutInflater)
        setContentView(binExplain.root)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val data : Bundle? = intent.extras

        Glide.with(this)
            .load(data?.getInt("picture"))
            .into(binExplain.pic)

        binExplain.judul.text = data?.getString("judul")
       binExplain.location.text =data?.getString("location")
        binExplain.detail.text = data?.getString("detail")

        supportActionBar?.title = data?.getString("judul")

        binExplain.like.setOnClickListener { klik ->
            Toast.makeText(this,"Favorit!",Toast.LENGTH_SHORT).show()
        }

        binExplain.share.setOnClickListener { klik ->
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