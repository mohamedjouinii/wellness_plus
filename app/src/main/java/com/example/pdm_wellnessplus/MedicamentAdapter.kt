package com.example.pdm_wellnessplus

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.pdm_wellnessplus.databinding.ItemMedicamentBinding
import com.example.pdm_wellnessplus.databinding.ItemPharmacieBinding
import com.google.android.material.snackbar.Snackbar

class medicamentAdapter(val medicaments: MutableList<medicament>, val context: Context) : RecyclerView.Adapter<medicamentAdapter.medicamentHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): medicamentAdapter.medicamentHolder {
        val binding = ItemMedicamentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return medicamentHolder(binding)
    }

    override fun onBindViewHolder(holder: medicamentAdapter.medicamentHolder, position: Int) {
        val item = medicaments[position]
        holder.binding.Nom.text=item.name
        holder.binding.type.text = item.type
        holder.binding.img.setImageResource(item.Img)
        holder.binding.prix.text = item.prix
        holder.itemView.setOnClickListener {
            val produit_fragment = Fragment_produit()
            val fragmentManager = (context as AppCompatActivity).supportFragmentManager // Assurez-vous que votre activité étend AppCompatActivity
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout_medicaments, produit_fragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }

    }

    override fun getItemCount(): Int {
        return medicaments.count()
    }



    inner class medicamentHolder(val binding: ItemMedicamentBinding) : RecyclerView.ViewHolder(binding.root)
}