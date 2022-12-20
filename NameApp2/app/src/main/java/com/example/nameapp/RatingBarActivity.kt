package com.example.nameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class RatingBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)

        val click = findViewById<Button>(R.id.ratingButton) as Button
        val ratingBar = findViewById<RatingBar>(R.id.rating) as RatingBar

        click.setOnClickListener {
            val ratingBarValue = ratingBar.rating
            Toast.makeText(this@RatingBarActivity, "Rating  $ratingBarValue",Toast.LENGTH_SHORT).show()
        }
    }
}