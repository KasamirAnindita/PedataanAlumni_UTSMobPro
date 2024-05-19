package com.example.uts_mobpro.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.uts_mobpro.DataBerita
import com.example.uts_mobpro.DetailBeritaActivity
import com.example.uts_mobpro.R

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
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_berita, parent, false)
            holder = ViewHolder(view)
            view.tag = holder
        } else {
            view = convertView
            holder = convertView.tag as ViewHolder
        }

        val dataBerita = dataList[position]

        holder.titleTextView.text = dataBerita.title
        holder.descTextView.text = dataBerita.desc
        holder.imageView.setImageResource(dataBerita.imageResId)

        view.setOnClickListener {
            val intent = Intent(context, DetailBeritaActivity::class.java).apply {
                putExtra("judul", dataBerita.title)
                putExtra("deskripsi", dataBerita.desc)
                putExtra("imageResId", dataBerita.imageResId)
            }
            context.startActivity(intent)
        }

        return view
    }

    private class ViewHolder(view: View) {
        val titleTextView: TextView = view.findViewById(R.id.titleView)
        val descTextView: TextView = view.findViewById(R.id.descView)
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }
}