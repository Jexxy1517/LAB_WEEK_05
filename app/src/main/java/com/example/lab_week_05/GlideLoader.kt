package com.example.lab_week_05

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Implementasi dari ImageLoader yang menggunakan library Glide
 * untuk memuat gambar dari URL.
 *
 * @param context Konteks aplikasi, diperlukan oleh Glide.
 */
class GlideLoader(private val context: Context) : ImageLoader {

    /**
     * Memuat gambar dari URL ke dalam ImageView menggunakan Glide.
     * Gambar akan di-load, di-crop ke tengah (centerCrop), lalu ditampilkan
     * di dalam ImageView yang diberikan.
     *
     * @param imageUrl URL dari gambar yang akan dimuat.
     * @param imageView Komponen ImageView tempat gambar akan ditampilkan.
     */
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(context)
            .load(imageUrl)
            .centerCrop()
            .into(imageView)
    }
}
