package com.vedatbasboga.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vedatbasboga.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var layout : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layout = ActivityMainBinding.inflate(layoutInflater)
        setContentView(layout.root)

        layout.sum.setOnClickListener {
            val numberOne: Int = layout.numberOne.text.toString().toIntOrNull() ?: 0
            val numberTwo: Int = layout.numberTwo.text.toString().toIntOrNull() ?: 0

            layout.result.text = sum(numberOne, numberTwo).toString()
        }

        layout.subtract.setOnClickListener {
            val numberOne: Int = layout.numberOne.text.toString().toIntOrNull() ?: 0
            val numberTwo: Int = layout.numberTwo.text.toString().toIntOrNull() ?: 0

            layout.result.text = sub(numberOne, numberTwo).toString()
        }

        layout.multiply.setOnClickListener {
            val numberOne: Int = layout.numberOne.text.toString().toIntOrNull() ?: 0
            val numberTwo: Int = layout.numberTwo.text.toString().toIntOrNull() ?: 0

            layout.result.text = mul(numberOne, numberTwo).toString()
        }

        layout.division.setOnClickListener {
            val numberOne: Int = layout.numberOne.text.toString().toIntOrNull() ?: 0
            val numberTwo: Int = layout.numberTwo.text.toString().toIntOrNull() ?: 1

            layout.result.text = div(numberOne, numberTwo).toString()
        }


    }

    private fun sum (a: Int, b: Int) : Int {
        return a + b
    }

    private fun sub (a: Int, b: Int) : Int {
        return a - b
    }

    private fun mul (a: Int, b: Int) : Int {
        return a * b
    }

    private fun div(a: Int, b: Int): Double {
        return if (b != 0) {
            a.toDouble() / b.toDouble()
        } else {
            Double.NaN
        }
    }

    // This is New Task in branch


    //Vedat Başboğa

}