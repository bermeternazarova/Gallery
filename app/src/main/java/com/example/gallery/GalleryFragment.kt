package com.example.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.gallery.databinding.FragmentGalleryBinding
import com.example.gallery.model.ModelGallery
import com.example.gallery.snackbar.SnackBarGallery
import com.example.gallery.view.AdapterGallery
import com.example.gallery.view.ImageClickListener
import com.example.gallery.viewmodel.ViewModelGallery

class GalleryFragment : Fragment() {

    private lateinit var binding: FragmentGalleryBinding
    private lateinit var adapterGallery: AdapterGallery
    private val viewModelGallery :ViewModelGallery by viewModels()

    private var list: ArrayList<ModelGallery> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentGalleryBinding.inflate(LayoutInflater.from(context),container,false)
        initialize()
        listeners()
        return binding.root
    }

    private fun listeners() {
        binding.btnSend.setOnClickListener {
            findNavController().navigate(R.id.fileFragment)
        }
        binding.btnGallery.setOnClickListener {
       // SnackBarGallery.make(title = "hallo", anchorView = it, viewGroup = it.findViewById(R.id.galleryFragment))
        }
    }

    private fun initialize() {
        adapterGallery = AdapterGallery(list, object : ImageClickListener {
            override fun imageClickListener(modelGallery: ModelGallery) {
                showToast("Click")
            }
        })
        binding.rvMain.adapter = adapterGallery
        viewModelGallery.addImage(list)

    }
    }