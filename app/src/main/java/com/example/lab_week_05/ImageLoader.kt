package com.example.lab_week_05

import android.widget.ImageView

/**
 * Interface untuk memuat gambar dari URL ke dalam ImageView.
 */
interface ImageLoader {
    /**
     * Memuat gambar dari URL yang diberikan ke dalam ImageView target.
     * @param imageUrl URL dari gambar yang akan dimuat.
     * @param imageView Komponen ImageView tempat gambar akan ditampilkan.
     */
    fun loadImage(imageUrl: String, imageView: ImageView)
}
