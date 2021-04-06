package com.ltts.androidpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        button.setOnClickListener{
           // var un=editTextTextPersonName2.text.toString()
            Toast.makeText(this,"HOME BUTTON CLICKED", Toast.LENGTH_LONG).show()
            //editTextTextPersonName2.setText(un)
            var myIntent= Intent(this,MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}