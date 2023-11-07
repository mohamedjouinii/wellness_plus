package com.example.pdm_wellnessplus

import android.content.Context


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pdm_wellnessplus.databinding.ItemPharmacieBinding
import com.example.pdm_wellnessplus.pharmacie

class pharmacieAdapter(val pharmacies: MutableList<pharmacie>, val context: Context) : RecyclerView.Adapter<pharmacieAdapter.pharmacieHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): pharmacieAdapter.pharmacieHolder {
        val binding = ItemPharmacieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return pharmacieHolder(binding)
    }

    override fun onBindViewHolder(holder: pharmacieAdapter.pharmacieHolder, position: Int) {
        val item = pharmacies[position]
        holder.binding.Nom.text=item.name
        holder.binding.dispo.text = item.dispo
        holder.binding.nuitJour.text = item.type
        holder.binding.positionText.text = item.position
    }

    override fun getItemCount(): Int {
        return pharmacies.count()
    }




    inner class pharmacieHolder(val binding: ItemPharmacieBinding) : RecyclerView.ViewHolder(binding.root)
}