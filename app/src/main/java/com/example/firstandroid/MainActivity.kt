package com.example.firstandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var first:EditText
    private lateinit var second:EditText
    private lateinit var buttonOK:Button
    private lateinit var result:TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        first=findViewById(R.id.firstNumber)
        second=findViewById(R.id.secondNumber)
        buttonOK=findViewById(R.id.buttonOk)
        result=findViewById(R.id.result)
        buttonOK.setOnClickListener{
            var a:Double=first.text.toString().toDouble()
            var b:Double=second.text.toString().toDouble()
            result.setText("$a+$b=${a+b}")
        }
    }
}