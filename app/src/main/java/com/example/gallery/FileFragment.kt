package com.example.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gallery.databinding.FragmentFileBinding

class FileFragment : Fragment() {

    private lateinit var binding: FragmentFileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFileBinding.inflate(LayoutInflater.from(context),container,false)
        return binding.root
    }
}