package com.example.pdm_wellnessplus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pdm_wellnessplus.databinding.FragmentPharmacieBinding
import com.example.pdm_wellnessplus.databinding.ProduitBinding
import com.example.pdm_wellnessplus.pharmacieAdapter

class Fragment_produit : Fragment(R.layout.produit) {
    private lateinit var binding: ProduitBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ProduitBinding.inflate(layoutInflater)


        return binding.root

    }
}