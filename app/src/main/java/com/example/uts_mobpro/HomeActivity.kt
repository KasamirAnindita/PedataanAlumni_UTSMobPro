package com.example.uts_mobpro

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewbinding.ViewBinding
import com.example.uts_mobpro.databinding.ActivityMainBinding
import android.view.View
import androidx.fragment.app.Fragment
import com.example.uts_mobpro.FragmentHome
import com.example.uts_mobpro.databinding.ActivityHomeBinding
import com.example.uts_mobpro.FragmentHome as FragmentHome1


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

        }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()



    }
}


//    enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//
//        val splashLogo = findViewById<Button>(R.id.btn_login)
//        splashLogo.setOnClickListener {
//            // Tindakan yang ingin dilakukan saat gambar diklik
//            // Misalnya, pindah ke aktivitas lain
//            val intent = Intent(this, HomeActivity::class.java)
//            startActivity(intent)