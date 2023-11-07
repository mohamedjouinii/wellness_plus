package com.example.pdm_wellnessplus


import android.R
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuInflater
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.pdm_wellnessplus.Fragment_medicament
import com.example.pdm_wellnessplus.databinding.MedicamentsMainBinding
import com.google.android.material.snackbar.Snackbar

private lateinit var binding: MedicamentsMainBinding
class MedicamentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        binding = MedicamentsMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        val medicalmentfragment = Fragment_medicament()
        changeFragment(medicalmentfragment, "homeFragment")



    }


    private fun changeFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .replace(binding.frameLayoutMedicaments.id, fragment, tag)
            .commit()
    }


}


