package com.example.nameapp

import android.annotation.SuppressLint
import android.app.StatusBarManager
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.RelativeLayout
import android.widget.Toast

class RadioButtonActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        val resetButton = findViewById<Button>(R.id.reset) as Button
        val radio = findViewById<RadioGroup>(R.id.radioGroup) as RadioGroup
        val background = findViewById<RelativeLayout>(R.id.back) as RelativeLayout

        radio.setOnCheckedChangeListener { _, checkedID ->
            when (checkedID){
                R.id.red -> {
                    background.setBackgroundColor(Color.parseColor("#FF0000"))
                    Toast.makeText(this@RadioButtonActivity, "You selected color red", Toast.LENGTH_SHORT).show()
                }
                R.id.green -> {
                    background.setBackgroundColor(Color.parseColor("#00FF00"))
                    Toast.makeText(this@RadioButtonActivity, "You selected color green", Toast.LENGTH_SHORT).show()
                }
                R.id.blue -> {
                    background.setBackgroundColor(Color.parseColor("#0000FF"))
                    Toast.makeText(this@RadioButtonActivity, "You selected color blue", Toast.LENGTH_SHORT).show()
                }
            }
        }
        resetButton.setOnClickListener { Toast.makeText(this@RadioButtonActivity, "Original color set", Toast.LENGTH_SHORT).show()
        background.setBackgroundColor(Color.parseColor("#FFFFFF"))
            Toast.makeText(this@RadioButtonActivity, "color reset", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@RadioButtonActivity, CheckBoxActivity::class.java)
            startActivity(intent)
        }

    }
}