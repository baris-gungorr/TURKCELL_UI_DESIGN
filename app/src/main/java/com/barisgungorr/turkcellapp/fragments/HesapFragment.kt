package com.barisgungorr.turkcellapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.barisgungorr.PaketlerResim
import com.barisgungorr.PaketlerResimAdapter
import com.barisgungorr.Resimler
import com.barisgungorr.ResimlerAdapter
import com.barisgungorr.turkcellapp.R
import com.barisgungorr.turkcellapp.databinding.FragmentHesapBinding


class HesapFragment : Fragment() {

        private lateinit var binding: FragmentHesapBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHesapBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.ResimlerRv.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val resimlerListesi = ArrayList<Resimler>()

        val r1 = Resimler("resimbir")
        val r2 = Resimler("resimiki")
        val r3 = Resimler("resimuc")
        val r4 = Resimler("resimdort")
        val r5 = Resimler("resimalti")

        resimlerListesi.add(r1)
        resimlerListesi.add(r2)
        resimlerListesi.add(r3)
        resimlerListesi.add(r3)
        resimlerListesi.add(r4)
        resimlerListesi.add(r5)

        val adapter = ResimlerAdapter(requireContext(),resimlerListesi)

        binding.ResimlerRv.adapter = adapter

        println("""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""")


        binding.paketlerRv.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)


        val paketResimlerListesi = ArrayList<PaketlerResim>()

        val p1 = PaketlerResim("paketbir")
            val p2 = PaketlerResim("paketiki")
        val p3 = PaketlerResim("paketuc")
            val p4 = PaketlerResim("paketdort")


        paketResimlerListesi.add(p1)
                paketResimlerListesi.add(p2)
                paketResimlerListesi.add(p3)
        paketResimlerListesi.add(p4)


        val adapterP = PaketlerResimAdapter(requireContext(),paketResimlerListesi)

        binding.paketlerRv.adapter = adapterP



     return view
    }

}