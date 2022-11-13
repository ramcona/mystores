package arira.my.stores.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import arira.my.id.R
import arira.my.stores.adapter.holder.ProductBigHolder


class ProductBigAdapter(): RecyclerView.Adapter<ProductBigHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductBigHolder {
        return  ProductBigHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_produk_big, parent, false))
    }

    override fun onBindViewHolder(holder: ProductBigHolder, position: Int) {
        holder.setData()
    }

    override fun getItemCount(): Int {
        return 8
    }
}