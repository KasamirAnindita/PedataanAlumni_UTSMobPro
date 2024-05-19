//package adapter
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ArrayAdapter
//import com.example.uts_mobpro.databinding.ItemBeritaBinding
//
//class AdapterBerita(context: Context, private val beritaList: List<Berita>) :
//    ArrayAdapter<Berita>(context, 0, beritaList) {
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        var binding = convertView?.let { ItemBeritaBinding.bind(it) }
//        if (binding == null) {
//            binding = ItemBeritaBinding.inflate(LayoutInflater.from(context), parent, false)
//        }
//
//        val currentBerita = beritaList[position]
//
//        binding.textViewJudul.text = currentBerita.judul
//
//        // Menambahkan onClickListener pada setiap item listview
//        binding.root.setOnClickListener {
//            // Mengirim data berita ke halaman detail berita
//            val intent = Intent(context, DetailBeritaActivity::class.java).apply {
//                putExtra("judul", currentBerita.judul)
//                putExtra("deskripsi", currentBerita.deskripsi)
//                putExtra("imageUrl", currentBerita.imageUrl)
//            }
//            context.startActivity(intent)
//        }
//
//        return binding.root
//    }
//}
