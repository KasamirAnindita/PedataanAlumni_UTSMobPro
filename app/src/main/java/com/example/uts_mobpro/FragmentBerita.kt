package com.example.uts_mobpro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.uts_mobpro.DataBerita
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

        listView.setOnItemClickListener { parent, view, position, id ->
            val data = newsList[position]
            Toast.makeText(requireContext(), "Judul Berita ${data.title}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun buatData(): List<DataBerita> {
        val arrayList = ArrayList<DataBerita>()

        // Add your news manually here
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 1",
                desc = "Deskripsi berita 1."
            )
        )
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 2",
                desc = "Deskripsi berita 2."
            )
        )
        arrayList.add(
            DataBerita(
                imageResId = R.drawable.ic_action_name,
                title = "Berita 3",
                desc = "Deskripsi berita 3."
            )
        )

        // Add more news as needed

        return arrayList
    }
}