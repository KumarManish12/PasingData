package com.practice.myapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var eteyn: EditText
    lateinit var etclass: EditText
    lateinit var etwa: EditText
    lateinit var btnnext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        eteyn=findViewById(R.id.eteyn)
        etclass=findViewById(R.id.etclass)
        etwa=findViewById(R.id.etwa)
        btnnext=findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
           if (eteyn.text.toString().isEmpty()){
               eteyn.error="Enter your name"
           }
            if (etclass.text.toString().isEmpty()){
                etclass.error="Enter your name"
            }
            if (etwa.text.toString().isEmpty()){
                etwa.error="Enter your name"
            }
            else {
             val  intent = Intent(this, MainActivity2::class.java)
               intent.putExtra("messagekey", eteyn.text.toString())
              intent.putExtra("messagekey1", etclass.text.toString())
               intent.putExtra("messagekey2", etwa.text.toString())
               startActivity(intent)
           }
        }
    }
}