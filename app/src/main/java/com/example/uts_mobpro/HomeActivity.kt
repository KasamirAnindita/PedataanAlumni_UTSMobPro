package com.example.uts_mobpro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.uts_mobpro.databinding.ActivityHomeBinding


private val ViewBinding.fragmenthomebtn: Any
    get() {
        TODO("Not yet implemented")
    }

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragmenthomebtn.setOnClickListener{

            replaceFragment(FragmentHome())
        }

        binding.fragmentberitabtn.setOnClickListener{

            replaceFragment(FragmentBerita())

        }

        binding.fragmentprofilebtn.setOnClickListener{

            replaceFragment(FragmentProfile())

        }

    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()



    }
}