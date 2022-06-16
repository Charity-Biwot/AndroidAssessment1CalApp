package com.example.calculatorappactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1: TextInputLayout
    lateinit var etNum1: EditText
    lateinit var tilNum2: TextInputLayout
    lateinit var etNum2: EditText
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision:Button
    lateinit var tvCalculate: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNum1 = findViewById(R.id.tilNum1)
        etNum1 = findViewById(R.id.etNum1)
        tilNum2 = findViewById(R.id.tilNum2)
        etNum2 = findViewById(R.id.etNum2)

        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivision = findViewById(R.id.btnDivision)
        tvCalculate = findViewById(R.id.tvCalculate)


        btnAddition.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            addition(num1.toInt(), num2.toInt())
        }
        btnSubtraction.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            subtraction(num1.toInt(), num2.toInt())
        }
        btnModulus.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            modulation(num1.toInt(), num2.toInt())
        }

        btnDivision.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()
            division(num1.toInt(), num2.toInt())

        }

    }





    fun addition(num1: Int, num2: Int) {
        var addition = num1 + num2
        tvCalculate.text = addition.toString()
    }

    fun subtraction(num1: Int, num2: Int) {
        var subtraction = num1 - num2
        tvCalculate.text = subtraction.toString()
    }

    fun modulation(num1: Int, num2: Int) {
        var modulation = num1 % num2
        tvCalculate.text = modulation.toString()
    }

    fun division(num1: Int, num2: Int) {
        var division = num1 / num2
        tvCalculate.text = division.toString()
    }
}









