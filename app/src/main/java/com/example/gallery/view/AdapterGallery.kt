package com.example.gallery.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.R
import com.example.gallery.databinding.ItemGalleryBinding
import com.example.gallery.loadImage
import com.example.gallery.model.ModelGallery

class AdapterGallery(private var list: ArrayList<ModelGallery>) :
    RecyclerView.Adapter<AdapterGallery.ViewHolderGallery>() {
     var clickListener: ((ModelGallery)-> Unit)? = null

    fun updateLIst(list1:List<ModelGallery>) {
       list = list1 as ArrayList<ModelGallery>
        notifyDataSetChanged()
    }

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
            itemView.setOnClickListener {
                clickListener?.invoke(modelGallery)
                binding.containerItem.apply {
                   if ( it.isPressed){
                       it.setBackgroundResource(R.drawable.is_press)
                       binding.imageCheck.isVisible = true
                   }
                }
            }
        }
    }
}