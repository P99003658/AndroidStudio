package com.ltts.androidpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button4.setOnClickListener{
        //var un=editTextTextPersonName2.text.toString()
        Toast.makeText(this,"PREVIOUS BUTTON CLICKED", Toast.LENGTH_LONG).show()
     // editTextTextPersonName2.setText(un)
        var myIntent= Intent(this,MainActivity::class.java)
        startActivity(myIntent)
    }

        button6.setOnClickListener{
            //var un=editTextTextPersonName2.text.toString()
            Toast.makeText(this,"NEXT BUTTON CLICKED", Toast.LENGTH_LONG).show()
            //editTextTextPersonName2.setText(un)
            var myIntent= Intent(this,MainActivity3::class.java)
            startActivity(myIntent)
        }
}
}