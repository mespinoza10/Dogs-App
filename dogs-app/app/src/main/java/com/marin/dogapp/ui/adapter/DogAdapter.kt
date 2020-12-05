package com.marin.dogapp.ui.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.marin.dogapp.R
import com.marin.dogapp.base.BaseViewHolder
import com.marin.dogapp.entity.DogEntity
import kotlinx.android.synthetic.main.dogs_row.view.*

class DogAdapter(private val context: Context,private val dogsList: List<DogEntity>,
                 private val itemClickLister:OnDogClickListener) : RecyclerView.Adapter<BaseViewHolder<*>>() {

    interface OnDogClickListener{
        fun OnDogClick(drink: DogEntity,position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return MainViewHolder(
            LayoutInflater.from(context).inflate(R.layout.dogs_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when (holder) {
            is MainViewHolder -> holder.bind(dogsList[position], position)
        }
    }

    override fun getItemCount(): Int {
      return dogsList.size
    }

    inner class MainViewHolder(itemView: View) : BaseViewHolder<DogEntity>(itemView) {
        override fun bind(item: DogEntity, position: Int) {
            itemView.imgDog.setImageResource(item.imagen);
           // itemView.cardDog.setCardBackgroundColor(item.background)
          //  itemView.cardDog.setCardBackgroundColor(item.background);
            itemView.cardDog.setCardBackgroundColor(ContextCompat.getColor(context, item.background));
            itemView.txtRaza.text = item.raza
            itemView.txtTamanio.text = item.tamanio
            itemView.txtRangoEdad.text = item.rangoEdad
            itemView.txtEspecialidad.text = item.especialidad
            itemView.setOnClickListener{itemClickLister.OnDogClick(item,position)}
        }
    }
}