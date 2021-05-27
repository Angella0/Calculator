package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var add = findViewById<Button>(R.id.btnadd)
        var substract = findViewById<Button>(R.id.btnsubstract)
        var multiplication = findViewById<Button>(R.id.btnmultiplication)
        var modulus = findViewById<Button>(R.id.btnmodulus)
        var number = findViewById<EditText>(R.id.etnumber)
        var Number = findViewById<EditText>(R.id.etNumber)
        var View = findViewById<TextView>(R.id.tvanswer)

        add.setOnClickListener {
            var num1 = number.text.toString().toInt()
            var num2 = Number.text.toString().toInt()
            var sum = num1 + num2
            View.setText(sum.toString())

        }
        substract.setOnClickListener {
            var num1= number.text.toString().toInt()
            var num2= Number.text.toString().toInt()
            var minus=num1 - num2
            View.setText(minus.toString())
        }
        multiplication.setOnClickListener {
            var num1= number.text.toString().toInt()
            var num2= Number.text.toString().toInt()
            var times= num1*num2
            View.setText(times.toString())
        }
        modulus.setOnClickListener {
            var num1= number.text.toString().toInt()
            var num2= Number.text.toString().toInt()
            var modulo=num1 % num2
            View.setText(modulo.toString())
        }
    }
}