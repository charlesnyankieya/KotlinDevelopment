package com.example.nameapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav) as BottomNavigationView
        bottomNav.setOnClickListener {
            when (it.id){
                R.id.home -> {
                    Toast.makeText(this@MainActivity,"Main Activity selected", Toast.LENGTH_SHORT).show()
                }
                R.id.radio -> {
                    val intent = Intent(this@MainActivity,RadioButtonActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this@MainActivity,"RadioButton Activity selected", Toast.LENGTH_SHORT).show()
                }
                R.id.ratingIcon -> {
                    val intent = Intent(this@MainActivity,RatingBarActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this@MainActivity,"RatingBar Activity selected", Toast.LENGTH_SHORT).show()
                }
                R.id.check -> {
                    val intent = Intent(this@MainActivity,CheckBoxActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this@MainActivity,"CheckBox Activity selected", Toast.LENGTH_SHORT).show()
                }
                R.id.edit -> {
                    val intent = Intent(this@MainActivity, EditTextActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(
                        this@MainActivity,
                        "EditText Activity selected",
                        Toast.LENGTH_SHORT
                    ).show()
                }
             }
        } */
        val firstLine = findViewById<TextView>(R.id.first_line) as TextView
        firstLine.setOnClickListener { Toast.makeText(this@MainActivity, "Adele", Toast.LENGTH_SHORT).show() }

        val secondLine = findViewById<TextView>(R.id.secondline) as TextView
        secondLine.setOnClickListener { Toast.makeText(this@MainActivity, "25", Toast.LENGTH_SHORT).show() }

        val thirdLine = findViewById<TextView>(R.id.thirdline) as TextView
        thirdLine.setOnClickListener { Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show() }

        val btn1 = findViewById<Button>(R.id.EditTextButton) as Button
        btn1.setOnClickListener { val intent = Intent(this@MainActivity, EditTextActivity::class.java)
        startActivity(intent)
        Toast.makeText(this@MainActivity,"This is a button", Toast.LENGTH_SHORT).show()}
    }

}