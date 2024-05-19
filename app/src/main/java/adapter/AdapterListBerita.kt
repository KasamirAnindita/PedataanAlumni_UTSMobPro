package com.example.uts_mobpro.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.uts_mobpro.R
import com.example.uts_mobpro.DataBerita

class AdapterListBerita(private val context: Context, private val dataList: List<DataBerita>) : BaseAdapter() {

    override fun getCount(): Int {
        return dataList.size
    }

    override fun getItem(position: Int): Any {
        return dataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_berita, parent, false)

        val imageView: ImageView = view.findViewById(R.id.imageView)
        val titleTextView: TextView = view.findViewById(R.id.titleView)
        val descTextView: TextView = view.findViewById(R.id.descView)

        val dataBerita = dataList[position]

        imageView.setImageResource(dataBerita.imageResId)
        titleTextView.text = dataBerita.title
        descTextView.text = dataBerita.desc

        return view
    }
}
