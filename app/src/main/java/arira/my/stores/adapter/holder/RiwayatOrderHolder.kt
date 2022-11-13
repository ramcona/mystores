package arira.my.stores.adapter.holder

import androidx.recyclerview.widget.RecyclerView
import arira.my.id.databinding.ItemProdukBigBinding
import arira.my.id.databinding.ItemProdukSmallBinding
import arira.my.id.databinding.ItemRiwayatBinding

class RiwayatOrderHolder(var item:ItemRiwayatBinding): RecyclerView.ViewHolder(item.root) {

    val context = itemView.context

    fun setData(){

        item.tvJam.rootView.setOnClickListener {

        }

    }
}