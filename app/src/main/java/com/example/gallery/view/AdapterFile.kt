package com.example.gallery.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.databinding.ItemGalleryBinding
import com.example.gallery.loadImage
import com.example.gallery.model.ModelGallery

class AdapterFile(private val list: ArrayList<ModelGallery>) :
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
        fun bind(image: ModelGallery) {
           binding.imageItem.loadImage(image.image)
        }
    }
}