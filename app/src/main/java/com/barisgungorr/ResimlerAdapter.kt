package com.barisgungorr

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.barisgungorr.turkcellapp.databinding.CardTasarimBinding

class ResimlerAdapter(var mContext: Context, var resimlerListesi: List<Resimler>)
    : RecyclerView.Adapter<ResimlerAdapter.CardTasarimTutucu>()  {

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)

    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val resim = resimlerListesi.get(position)
            val r = holder.tasarim

        r.imageView.setImageResource(mContext.resources.getIdentifier(resim.resim,"drawable",mContext.packageName))
        r.imageView.scaleType = ImageView.ScaleType.FIT_CENTER

    }


    override fun getItemCount(): Int {
        return resimlerListesi.size
    }


}