package arira.my.stores.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import arira.my.id.R
import arira.my.stores.adapter.holder.RiwayatOrderHolder


class RiwayatOrderAdapter(): RecyclerView.Adapter<RiwayatOrderHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RiwayatOrderHolder {
        return  RiwayatOrderHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_riwayat, parent, false))
    }

    override fun onBindViewHolder(holder: RiwayatOrderHolder, position: Int) {
        holder.setData()
    }

    override fun getItemCount(): Int {
        return 4
    }
}