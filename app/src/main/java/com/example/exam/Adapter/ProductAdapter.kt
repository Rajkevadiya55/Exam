package com.example.exam.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.DB.ProductDB
import com.example.exam.DB.ProductEntity
import com.example.exam.R

class ProductAdapter(list: List<ProductEntity>) :
    RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    var list = list
    lateinit var db: ProductDB
    lateinit var context: Context

    class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var txtname = itemView.findViewById<TextView>(R.id.name)
        var txtprice = itemView.findViewById<TextView>(R.id.price)
        var txtaddre = itemView.findViewById<TextView>(R.id.address)
        var txtdscrip = itemView.findViewById<TextView>(R.id.dscrip)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        context = parent.context

        return ProductHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        )

        return  ProductHolder(LayoutInflater.from(parent.context).inflate(R.layout.product_item,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        db = ProductDB.init(context)

        holder.txtname.text = list.get(position).name
        holder.txtprice.text = list.get(position).price
        holder.txtaddre.text = list.get(position).address
        holder.txtdscrip.text = list.get(position).dscrip

    }
}