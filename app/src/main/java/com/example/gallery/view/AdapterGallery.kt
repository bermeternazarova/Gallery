package com.example.gallery.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.R
import com.example.gallery.databinding.ItemGalleryBinding
import com.example.gallery.loadImage
import com.example.gallery.model.ModelGallery

class AdapterGallery(private val list: ArrayList<ModelGallery>,
private val clickListener: ImageClickListener) :
    RecyclerView.Adapter<AdapterGallery.ViewHolderGallery>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderGallery {
        return ViewHolderGallery(
            ItemGalleryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolderGallery, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolderGallery(private val binding: ItemGalleryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(modelGallery: ModelGallery) {
            binding.imageItem.loadImage(modelGallery.image)
            itemView.setOnLongClickListener {
                clickListener.imageClickListener(modelGallery)
                binding.imageItem.apply {
                    setStrokeColorResource(R.color.orange)
                    setStrokeWidthResource(R.dimen.device_p12)
                }
                return@setOnLongClickListener false
            }
        }

    }
}