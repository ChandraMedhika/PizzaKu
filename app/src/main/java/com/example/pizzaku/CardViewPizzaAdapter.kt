package com.example.pizzaku

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewPizzaAdapter(private val listPizza: ArrayList<Pizza>) :
    RecyclerView.Adapter<CardViewPizzaAdapter.CardViewViewHolder>(), View.OnClickListener {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_pizza, parent, false)
        return CardViewViewHolder(view)
    }
    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val pizza = listPizza[position]
        Glide.with(holder.itemView.context)
            .load(pizza.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = pizza.name
        holder.tvDetail.text = pizza.detail
        holder.btnBeli.setOnClickListener { Toast.makeText(holder.itemView.context, "Membeli " + listPizza[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.btnRincian.setOnClickListener { Toast.makeText(holder.itemView.context, "Rincian dari " + listPizza[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listPizza[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listPizza.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnBeli: Button = itemView.findViewById(R.id.btn_set_beli)
        var btnRincian: Button = itemView.findViewById(R.id.btn_set_rincian)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

}
