package com.andra.tugasrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.char_item.view.*

class CharaAdapter(val listChara: ArrayList<ClassCharacter>) :
    RecyclerView.Adapter<CharaAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharaAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.char_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listChara.size
    }

    override fun onBindViewHolder(holder: CharaAdapter.ViewHolder, position: Int) {
        holder.itemView.tv_nama.setText(listChara[position].nama)
        holder.itemView.tv_kekuatan.setText(listChara[position].kekuatan)
        holder.itemView.tv_usia.setText(listChara[position].usia.toString())
    }

}