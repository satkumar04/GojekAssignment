package com.example.assignment.ui.base

import androidx.databinding.BindingAdapter
import android.graphics.Color
import android.widget.ImageView
import com.squareup.picasso.Picasso

object CustomBindingAdapter{

    @JvmStatic
    @BindingAdapter("bind:image_url")
    fun loadImage(imageView: ImageView, url: String) {
        Picasso.with(imageView.context)
            .load(url).into(imageView)

    }

    @JvmStatic
    @BindingAdapter("bind:colorCode")
    fun loadColorAsBackGround(imageView: ImageView, colorCode: String?) {
        colorCode?.let { imageView.setBackgroundColor(Color.parseColor(it)) }
    }

}
