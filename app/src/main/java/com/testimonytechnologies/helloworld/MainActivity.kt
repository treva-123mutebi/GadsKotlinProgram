package com.testimonytechnologies.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textHello.text = "1"
    }

    fun addNumber(v: View) {
        val currVal = textHello.text.toString().toInt()
        val nextVal = currVal + 1
        textHello.text = nextVal.toString()
    }
}