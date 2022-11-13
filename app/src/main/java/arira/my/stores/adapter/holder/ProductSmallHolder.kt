package arira.my.stores.adapter.holder

import androidx.recyclerview.widget.RecyclerView
import arira.my.id.databinding.ItemProdukSmallBinding

class ProductSmallHolder(var item:ItemProdukSmallBinding): RecyclerView.ViewHolder(item.root) {

    val context = itemView.context

    fun setData(){

        item.tvHarga.rootView.setOnClickListener {

        }

    }
}