package com.example.gallery.snackbar

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.gallery.R
import com.google.android.material.snackbar.ContentViewCallback

class CustomSnackBar(context: Context, attributeSet: AttributeSet?=null, defaultStyle:Int =0) :
    ConstraintLayout(
    context,attributeSet,defaultStyle), ContentViewCallback {

    var imageView: ImageView
    var title : TextView
    var constraint : ConstraintLayout

    init {
        View.inflate(context, R.layout.snack_bar,this)
        clipToPadding=false
        this.imageView =findViewById(R.id.tv_snack)
        this.title=findViewById(R.id.btn_snack)
        this.constraint=findViewById(R.id.constraint_snack)
    }

    override fun animateContentIn(delay: Int, duration: Int) {
    }

    override fun animateContentOut(delay: Int, duration: Int) {
    }
}