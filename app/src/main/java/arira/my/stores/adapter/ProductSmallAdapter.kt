package arira.my.stores.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import arira.my.id.R
import arira.my.stores.adapter.holder.ProductSmallHolder


class ProductSmallAdapter(): RecyclerView.Adapter<ProductSmallHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductSmallHolder {
        return  ProductSmallHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_produk_small, parent, false))
    }

    override fun onBindViewHolder(holder: ProductSmallHolder, position: Int) {
        holder.setData()
    }

    override fun getItemCount(): Int {
        return 5
    }
}