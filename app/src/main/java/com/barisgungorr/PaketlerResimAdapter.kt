package com.barisgungorr

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.barisgungorr.turkcellapp.databinding.CardTasarimBinding
import com.barisgungorr.turkcellapp.databinding.PaketTasarimBinding

class PaketlerResimAdapter(var mContext: Context, var paketResimlerListesi: List<PaketlerResim>)
    : RecyclerView.Adapter<PaketlerResimAdapter.PaketTasarimTutucu>() {

    inner class PaketTasarimTutucu(var tasarimm: PaketTasarimBinding) : RecyclerView.ViewHolder(tasarimm.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaketTasarimTutucu {
        val binding = PaketTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return PaketTasarimTutucu(binding)

    }

    override fun onBindViewHolder(holder: PaketTasarimTutucu, position: Int) {
        val resim =paketResimlerListesi.get(position)
        val r = holder.tasarimm

        r.imageView.setImageResource(mContext.resources.getIdentifier(resim.resimm,"drawable",mContext.packageName))
        r.imageView.scaleType = ImageView.ScaleType.FIT_CENTER
    }

    override fun getItemCount(): Int {
       return paketResimlerListesi.size
    }


}