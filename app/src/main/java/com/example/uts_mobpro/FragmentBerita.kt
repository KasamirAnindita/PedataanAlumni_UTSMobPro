package com.example.uts_mobpro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.uts_mobpro.adapter.AdapterListBerita

class FragmentBerita : Fragment() {
    private lateinit var listView: ListView
    private lateinit var adapter: AdapterListBerita

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmentberita, container, false)
        listView = view.findViewById(R.id.listView)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsList = buatData()
        adapter = AdapterListBerita(requireContext(), newsList)
        listView.adapter = adapter
    }

    private fun buatData(): List<DataBerita> {
        val arrayList = ArrayList<DataBerita>()

        // Add your news manually here
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "3 Faktor yang Pengaruhi Membaiknya Tren Wisata di Dunia hingga Akhir 2024",
                desc = "KOMPAS.com - Mastercard Economics Institute (MEI) mencatat perkembangan pesat dunia pariwisata hingga akhir 2024 mendatang. Melalui laporan bertajuk “Travel Trends 2024: Breaking Boundaries” perkembangan industri pariwisata ini terjadi di setidaknya 74 negara, termasuk 13 negara di kawasan Asia Pasifik."
            )
        )
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Bali Masuk Daftar Destinasi Wisata Musim Panas 2024 Paling Menarik\n",
                desc = "KOMPAS.com - Bali masuk daftar 10 destinasi wisata musim panas paling menarik sepanjang Juni-Agustus 2024 mendatang. Daftar tersebut dirilis oleh Mastercard Economics Institute (MEI) berdasarkan data pemesanan penerbangan."
            )
        )
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 3",
                desc = "Deskripsi berita 3."
            )
        )

        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 4",
                desc = "Deskripsi berita 4."
            )
        )
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 5",
                desc = "Deskripsi berita 5."
            )
        )
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 6",
                desc = "Deskripsi berita 6."
            )
        )
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 7",
                desc = "Deskripsi berita 7."
            )
        )
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 8",
                desc = "Deskripsi berita 8."
            )
        )
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 8",
                desc = "Deskripsi berita 8."
            )
        )

        // Add more news as needed

        return arrayList
    }
}
