package arira.my.stores.adapter.holder

import androidx.recyclerview.widget.RecyclerView
import arira.my.id.databinding.ItemProdukBigBinding
import arira.my.id.databinding.ItemProdukSmallBinding

class ProductBigHolder(var item:ItemProdukBigBinding): RecyclerView.ViewHolder(item.root) {

    val context = itemView.context

    fun setData(){

        item.tvHarga.rootView.setOnClickListener {

        }

    }
}