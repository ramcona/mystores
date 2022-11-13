package arira.my.stores.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import arira.my.id.R
import arira.my.id.databinding.FragmentHomeBinding
import arira.my.id.databinding.FragmentMyorderBinding
import arira.my.stores.adapter.RiwayatOrderAdapter

class MyOrderFragment : Fragment() {

    private lateinit var binding: FragmentMyorderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_myorder, container, false)
        setDummyData()
        return binding.root
    }

    private fun setDummyData() {
        binding.rvData.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = RiwayatOrderAdapter()
        }
    }
}