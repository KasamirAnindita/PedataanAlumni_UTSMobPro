package com.example.uts_mobpro

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uts_mobpro.databinding.ActivityMainBinding
import com.example.uts_mobpro.databinding.FragmentprofileBinding


class FragmentProfile : Fragment() {
    private lateinit var binding: FragmentprofileBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentprofileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedPreferences = requireActivity().getSharedPreferences("mySharedPreferences", Context.MODE_PRIVATE)

        // Retrieve data from SharedPreferences
        val email = sharedPreferences.getString("EMAIL", "Default Email")
        val nim = sharedPreferences.getString("NIM", "Default NIM")
        val nama = sharedPreferences.getString("NAMA", "Default Nama")
        val kelas = sharedPreferences.getString("KELAS", "Default Kelas")

        // Set retrieved data to TextInputEditTexts
        binding.textInputEmail.setText(email)
        binding.textInputNim.setText(nim)
        binding.textInputNama.setText(nama)
        binding.textInputKelas.setText(kelas)


        binding.btnLogout.setOnClickListener {
            // Clear SharedPreferences and navigate to login page
            sharedPreferences.edit().clear().apply()
            // Navigate to login page
            val intent = Intent(requireContext(), HomeActivity::class.java)
            startActivity(intent)
            requireActivity().finish() // Optional: Finish current activity
        }
    }
}
