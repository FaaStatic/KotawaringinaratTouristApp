package com.suhaili.kotawaringinbarattourist.Adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.suhaili.kotawaringinbarattourist.Model.KobarModel

class AdapterKobar(val listing:ArrayList<KobarModel>): RecyclerView.Adapter<AdapterKobar.itemTarget>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterKobar.itemTarget {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AdapterKobar.itemTarget, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
       return listing.size
    }

    inner class itemTarget(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}