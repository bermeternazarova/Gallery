package com.example.gallery

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

fun Context.showToast(text:String){
    Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
}
fun View.loadImage(url:String){
    Glide.with(this).load(url).placeholder(R.drawable.ic_launcher_background).centerCrop().into(this as ImageView)
}
fun Fragment.showToast(text: String){
    Toast.makeText(requireContext(),text,Toast.LENGTH_SHORT).show()
}