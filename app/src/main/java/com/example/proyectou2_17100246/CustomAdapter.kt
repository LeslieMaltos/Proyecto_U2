package com.example.proyectou2_17100246

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    val titles = arrayOf("Redes Sociales","Collares de Iniciales", "Conjunto", "Collar de Mariposas", "Aretes")
    val details = arrayOf("Encuentranos en Facebook y Instagram como @MalediShop","Distintas Iniciales Disponibles", "Juego de joyeria, incluye collar de corazón con aretes",
        "Chocker de Mariposas de Acero Inoxidable", "Lindos Aretes de Mariposa")
    val images = intArrayOf(R.drawable.maledi,R.drawable.cadenas, R.drawable.corazon,
        R.drawable.mariposa, R.drawable.mariposa)
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDescripcion.text= details[i]
        viewHolder.itemImage.setImageResource(images[i])

    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var itemImage : ImageView
        var itemTitle : TextView
        var itemDescripcion : TextView
        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.titulo)
            itemDescripcion = itemView.findViewById(R.id.detalles)
        }

    }
}