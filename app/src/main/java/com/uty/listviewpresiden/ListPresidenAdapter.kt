package com.uty.listviewpresiden

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uty.listviewpresiden.Model.Presiden

class ListPresidenAdapter (val listPresiden: ArrayList<Presiden>) : RecyclerView.Adapter<ListPresidenAdapter.PresidenViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListPresidenAdapter.PresidenViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.bentuk_presiden, parent, false)
        return PresidenViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPresiden.size
    }

    override fun onBindViewHolder(holder: ListPresidenAdapter.PresidenViewHolder, position: Int) {
        val presiden: Presiden = listPresiden[position]
        holder.tvnamapresiden.text = presiden.nama
        holder.tvbiodatapresiden.text = presiden.biodata
        Glide.with(holder.itemView.context)
            .load(presiden.foto)
            .into(holder.ivfotopresiden)

    }

    inner class PresidenViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvnamapresiden: TextView = itemView.findViewById(R.id.textview_nama_presiden)
        val tvbiodatapresiden: TextView = itemView.findViewById(R.id.textview_biodata_presiden)
        val ivfotopresiden: ImageView = itemView.findViewById(R.id.foto_presiden)

    }

}