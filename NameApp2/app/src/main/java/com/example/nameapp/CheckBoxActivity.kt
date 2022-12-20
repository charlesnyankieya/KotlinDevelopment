package com.example.nameapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        val click = findViewById<Button>(R.id.clickit) as Button
        val checkOne = findViewById<CheckBox>(R.id.kotlin) as CheckBox
        val checkTwo = findViewById<CheckBox>(R.id.java) as CheckBox

        click.setOnClickListener {
            if (checkOne.isChecked && checkTwo.isChecked){
                Toast.makeText(this@CheckBoxActivity, "Kotlin and Java", Toast.LENGTH_SHORT).show()
            }
            else if (checkTwo.isChecked)
            {
                Toast.makeText(this@CheckBoxActivity, "Java", Toast.LENGTH_SHORT).show()
            }
            else if (checkOne.isChecked){
                Toast.makeText(this@CheckBoxActivity, "Kotlin", Toast.LENGTH_SHORT).show()

            }
            else {
                Toast.makeText(this@CheckBoxActivity, "nothing selected", Toast.LENGTH_SHORT).show()

            }
            val intent = Intent(this@CheckBoxActivity,RatingBarActivity::class.java)
            startActivity(intent)
        }
    }
}