package com.example.hw14fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.fibonacci_loop_to_screen)
        text.text = fibonacci(20)
        val textTwo = findViewById<TextView>(R.id.fibonacci_recursion_to_screen)
        textTwo.text = fibonacciRecursion(20).toString()
    }

    fun fibonacci(x: Int): String {
        val y = arrayOfNulls<Int>(x)
        for (item in y) {
            y[0] = 0
            y[1] = 1
            for (i in 2 until y.size) {
                y[i] = y[i - 1]!!.plus(y[i - 2]!!)
            }
        }
        return y.contentToString()
    }

    fun fibonacciRecursion(x: Int): Int {
        if (x <= 1) {
            return 0
        } else if (x == 2) return 1
        else {
            return fibonacciRecursion(x - 1).plus(fibonacciRecursion(x - 2))
        }
    }
}
