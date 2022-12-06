package com.example.nameapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)




        val buttonListener = findViewById<Button>(R.id.submit) as Button
        buttonListener.setOnClickListener { Toast.makeText(this@EditTextActivity, "By Using on click listener", Toast.LENGTH_SHORT).show() }


        val firstName = findViewById<EditText>(R.id.firstname) as EditText
        val secondName = findViewById<EditText>(R.id.secondname) as EditText
        val thirdName = findViewById<EditText>(R.id.thirdname) as EditText
        firstName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val first :  String = firstName.text.toString()
                Toast.makeText(this@EditTextActivity,first,Toast.LENGTH_SHORT).show()
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })

        secondName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val second : String = secondName.text.toString()
                Toast.makeText(this@EditTextActivity, second, Toast.LENGTH_SHORT).show()

            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        thirdName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val third : String = thirdName.text.toString()
                Toast.makeText(this@EditTextActivity,third,Toast.LENGTH_SHORT).show()

            }

            override fun afterTextChanged(p0: Editable?) {

            }


        })

    }

    fun buttonFunc(view: View)
        {if (view.id == R.id.clickme){
            Toast.makeText(this@EditTextActivity, "Wtf", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@EditTextActivity,RadioButtonActivity::class.java)
            startActivity(intent)
        }}
    }
