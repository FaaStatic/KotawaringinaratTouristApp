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
import com.suhaili.kotawaringinbarattourist.databinding.ListdataBinding
import com.suhaili.kotawaringinbarattourist.explain
import kotlin.math.round

class AdapterKobarList(val listing:ArrayList<KobarModel>): RecyclerView.Adapter<AdapterKobarList.itemTarget>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterKobarList.itemTarget {
        val seen = ListdataBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return itemTarget(seen)
    }

    override fun onBindViewHolder(holder: AdapterKobarList.itemTarget, position: Int) {
            val destination = listing[position]
            Glide.with(holder.ViewBindList.root)
                .load(destination.pic)
                .into(holder.ViewBindList.listviewpic)
        holder.ViewBindList.listviewjudul.text = destination.destination
        holder.ViewBindList.listviewlok.text = destination.location
        holder.ViewBindList.root.setOnClickListener {
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

    inner class itemTarget(val ViewBindList : ListdataBinding) : RecyclerView.ViewHolder(ViewBindList.root) {


    }
}