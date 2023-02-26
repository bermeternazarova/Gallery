package com.example.gallery.snackbar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.gallery.R
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class SnackBarGallery(parent: ViewGroup, content:CustomSnackBar):
    BaseTransientBottomBar<SnackBarGallery>(parent,content,content) {
    init {
        getView().setBackgroundColor(ContextCompat.getColor(view.context, R.color.white))
        getView().setPadding(0,0,0,0)
        content.constraint.setOnClickListener {
            dismiss()
            Toast.makeText(context,"test", Toast.LENGTH_SHORT).show()
        }
    }
    companion object{
        fun make(viewGroup: ViewGroup, anchorView: View?=null,title:String):SnackBarGallery{
            val  customView = LayoutInflater.from(viewGroup.context).inflate(
                R.layout.snack_bar,viewGroup,false) as CustomSnackBar
            customView.title.text=title
            customView.rootView.setOnClickListener {

            }
            return SnackBarGallery(viewGroup,customView).setDuration(Snackbar.LENGTH_LONG).setAnchorView(anchorView)

        }
    }
}