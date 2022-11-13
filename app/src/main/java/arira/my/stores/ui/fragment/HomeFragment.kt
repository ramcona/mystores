package arira.my.stores.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import arira.my.id.R
import arira.my.id.databinding.FragmentHomeBinding
import arira.my.stores.adapter.ProductBigAdapter
import arira.my.stores.adapter.ProductSmallAdapter

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        setDummyData()
        return binding.root
    }

    private fun setDummyData(){
        binding.rvFavorit.apply {
            layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL, false)
            adapter = ProductSmallAdapter()
        }

        binding.rvProduk.apply {
            layoutManager = GridLayoutManager(context,2)
            adapter = ProductBigAdapter()
        }
    }
}