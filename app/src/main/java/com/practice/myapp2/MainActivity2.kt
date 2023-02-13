package com.practice.myapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tvname: TextView
    lateinit var tvc: TextView
    lateinit var tvabout:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvname=findViewById(R.id.tvname)
        tvc=findViewById(R.id.tvc)
        tvabout=findViewById(R.id.tvabout)
 intent?.let{
     val name=intent.getStringExtra("messagekey")
     tvname.setText(name)
     var cclass=intent.getStringExtra("messagekey1")
       tvc.setText(cclass)
     var about=intent.getStringExtra("messagekey2")
      tvabout.setText(about)
 }
    }
}