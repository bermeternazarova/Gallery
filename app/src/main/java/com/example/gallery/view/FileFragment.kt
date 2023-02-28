package com.example.gallery.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gallery.R
import com.example.gallery.databinding.FragmentFileBinding
import com.example.gallery.model.ModelGallery

class FileFragment : Fragment() {

    private lateinit var binding: FragmentFileBinding
    private lateinit var adapterFile: AdapterFile
    private var list= arrayListOf<ModelGallery>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
        listeners()
    }

    private fun getData() {
        list = arguments?.getSerializable(KEY) as ArrayList<ModelGallery>
        adapterFile = AdapterFile(list)
        binding.rvMain2.adapter = adapterFile
    }

    private fun listeners() {
        binding.tvBack.setOnClickListener {
            findNavController().navigate(R.id.galleryFragment)
        }}

    companion object{
        const val KEY ="key"
    }
}