package com.example.pdm_wellnessplus

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pdm_wellnessplus.databinding.FragmentMedicamentsBinding
import com.example.pdm_wellnessplus.databinding.FragmentPharmacieBinding
import com.google.android.material.snackbar.Snackbar
import com.example.pdm_wellnessplus.medicamentAdapter


class Fragment_medicament : Fragment(R.layout.fragment_medicaments) {
    private lateinit var binding: FragmentMedicamentsBinding
    private lateinit var recyclerView: RecyclerView

    @SuppressLint("ShowToast")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMedicamentsBinding.inflate(layoutInflater)

        binding.recyclerViewMedicaments.adapter = medicamentAdapter(getListNews(requireContext()),requireContext())
        binding.recyclerViewMedicaments.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)



        return binding.root

    }



    fun getListNews(context: Context) : MutableList<medicament> {
        return mutableListOf(

            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),
            medicament(0,"ACNETA 10 10mg Gél. BT30", "Dermatologique",R.drawable.med,"18.085 TND" ),


            )






    }

}
