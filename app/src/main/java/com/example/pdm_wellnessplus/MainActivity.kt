package com.example.pdm_wellnessplus

import android.os.Bundle
import android.view.Menu
import android.view.View
import android.view.Window
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.pdm_wellnessplus.databinding.ActivityMainBinding

private lateinit var binding:ActivityMainBinding
class MainActivity : AppCompatActivity() {
//    var courses = arrayOf(
//        "Nuit", "Jour"
//    )

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        requestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        setContentView(binding.root)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pharmaciefragment = Fragment_pharmacie()
        changeFragment(pharmaciefragment, "homeFragment")
//        val spin = binding.spinner1
//        spin.onItemSelectedListener = this
//
//        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(
//            this,
//            android.R.layout.simple_spinner_item,
//            courses
//        )
//        ad.setDropDownViewResource(
//            android.R.layout.simple_spinner_dropdown_item
//        )
//        spin.adapter = ad
//    }
//
//    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//        Toast.makeText(
//            applicationContext,
//            courses[position],
//            Toast.LENGTH_LONG
//        )
//            .show()
//    }
//
//        override fun onNothingSelected(parent: AdapterView<*>?) {
//
//        }
    }
    private fun changeFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .replace(binding.frameLayout.id, fragment, tag)
            .commit()
    }


}
