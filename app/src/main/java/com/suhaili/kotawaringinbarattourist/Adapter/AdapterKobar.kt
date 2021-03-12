package com.suhaili.kotawaringinbarattourist.Adapter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.suhaili.kotawaringinbarattourist.Model.KobarModel
import com.suhaili.kotawaringinbarattourist.R
import com.suhaili.kotawaringinbarattourist.databinding.CustomlistBinding
import com.suhaili.kotawaringinbarattourist.databinding.ListdataBinding
import com.suhaili.kotawaringinbarattourist.explain

import kotlin.math.round

class AdapterKobar(val listing:ArrayList<KobarModel>): RecyclerView.Adapter<AdapterKobar.itemTarget>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterKobar.itemTarget {
       val seen =CustomlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return itemTarget(seen)
    }

    override fun onBindViewHolder(holder: AdapterKobar.itemTarget, position: Int) {
            val destination = listing[position]
            Glide.with(holder.viewBind.root)
                .load(destination.pic)
                .apply(RequestOptions().transform(RoundedCorners(30)))
                .into(holder.viewBind.customlistpic)
        holder.viewBind.customlisttitle.text = destination.destination
        holder.viewBind.root.setOnClickListener {
            val move = Intent(holder.itemView.context,explain::class.java)
            move.putExtra("judul",destination.destination)
            move.putExtra("picture",destination.pic)
            move.putExtra("location",destination.location)
            move.putExtra("detail",destination.detail)
            holder.itemView.context.startActivity(move)
        }
    }

    override fun getItemCount(): Int {
       return listing.size
    }

    inner class itemTarget(val viewBind : CustomlistBinding) : RecyclerView.ViewHolder(viewBind.root) {


    }
}