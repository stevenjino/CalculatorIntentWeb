package com.example.calculatorintentweb

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calc.setOnClickListener {
            val maths=Intent(this,CalculatorActivity::class.java)
            startActivity(maths)
        }
        btn_intent.setOnClickListener {
            val intentpage=Intent(this,IntentActivity::class.java)
            startActivity(intentpage)
        }
        btn_web.setOnClickListener {
            val webpage=Intent(this,WebActivity::class.java)
            startActivity(webpage)
        }
    }
}
