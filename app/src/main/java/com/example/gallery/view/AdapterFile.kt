package com.example.gallery.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.databinding.ItemGalleryBinding

class AdapterFile(private val list: ArrayList<String>) :
    RecyclerView.Adapter<AdapterFile.ViewHolderFile>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderFile {
        return ViewHolderFile(
            ItemGalleryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolderFile, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolderFile(private val binding: ItemGalleryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(image: String) {

        }

    }
}