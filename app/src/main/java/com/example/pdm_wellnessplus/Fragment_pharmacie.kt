package com.example.pdm_wellnessplus



import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pdm_wellnessplus.databinding.FragmentPharmacieBinding
import com.example.pdm_wellnessplus.pharmacieAdapter

class Fragment_pharmacie : Fragment(R.layout.fragment_pharmacie) {
    private lateinit var binding: FragmentPharmacieBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPharmacieBinding.inflate(layoutInflater)

        binding.recyclerViewPharmacie.adapter = pharmacieAdapter(getListNews(requireContext()),requireContext())
        binding.recyclerViewPharmacie.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        return binding.root

    }



    fun getListNews(context: Context) : MutableList<pharmacie> {
        return mutableListOf(

            pharmacie(0,"MOHAMED ABDENADHER", "ouverte","Residence cleopatre\n" +
                    "avenue habib bourguiba hammam linf","pharmacie de nuit"),
            pharmacie(0,"MOHAMED ABDENADHER", "ouverte","Residence cleopatre\n" +
                    "avenue habib bourguiba hammam linf","pharmacie de nuit"),

            pharmacie(0,"MOHAMED ABDENADHER", "ouverte","Residence cleopatre\n" +
                    "avenue habib bourguiba hammam linf","pharmacie de nuit"),
            pharmacie(0,"MOHAMED ABDENADHER", "ouverte","Residence cleopatre\n" +
                    "avenue habib bourguiba hammam linf","pharmacie de nuit"),
            pharmacie(0,"MOHAMED ABDENADHER", "ouverte","Residence cleopatre\n" +
                    "avenue habib bourguiba hammam linf","pharmacie de nuit"),
            pharmacie(0,"MOHAMED ABDENADHER", "ouverte","Residence cleopatre\n" +
                    "avenue habib bourguiba hammam linf","pharmacie de nuit"),

            pharmacie(0,"MOHAMED ABDENADHER", "ouverte","Residence cleopatre\n" +
                    "avenue habib bourguiba hammam linf","pharmacie de nuit"),


            )






    }

}