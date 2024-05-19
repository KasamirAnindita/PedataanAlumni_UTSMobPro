package com.example.uts_mobpro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_mobpro.databinding.DetailBeritaBinding

class DetailBeritaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DetailBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data berita dari intent
        val judulBerita = intent.getStringExtra("judul")
        val deskripsiBerita = intent.getStringExtra("deskripsi")
        val imageResId = intent.getIntExtra("imageResId", 0)

        // Set data berita ke dalam layout
        binding.textViewJudulBerita.text = judulBerita
        binding.textViewDeskripsiBerita.text = deskripsiBerita
        binding.imageViewBerita.setImageResource(imageResId)
    }
}
