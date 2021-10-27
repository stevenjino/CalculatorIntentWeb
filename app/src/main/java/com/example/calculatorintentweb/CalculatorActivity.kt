package com.example.calculatorintentweb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        btn_add.setOnClickListener {
            //        receive entered data from user
            var num1 = edt_num1.text.toString()
            var num2 = edt_num2.text.toString()

//        checking entered fields
            if (num1.isEmpty()or num2.isEmpty()){
                txt_answer.text= "Please fill in all the details"
            }else{
                var answer = num1.toDouble()+ num2.toDouble()
                txt_answer.text = answer.toString()
            }
        }
        btn_subtract.setOnClickListener {
            //        receive entered data from user
            var num1 = edt_num1.text.toString()
            var num2 = edt_num2.text.toString()

//        checking entered fields
            if (num1.isEmpty()or num2.isEmpty()){
                txt_answer.text= "Please fill in all the details"
            }else{
                var answer = num1.toDouble()- num2.toDouble()
                txt_answer.text = answer.toString()
            }
        }
        btn_multiply.setOnClickListener {
            //        receive entered data from user
            var num1 = edt_num1.text.toString()
            var num2 = edt_num2.text.toString()

//        checking entered fields
            if (num1.isEmpty()or num2.isEmpty()){
                txt_answer.text= "Please fill in all the details"
            }else{
                var answer = num1.toDouble()* num2.toDouble()
                txt_answer.text = answer.toString()
            }
        }
        btn_divide.setOnClickListener {
            //        receive entered data from user
            var num1 = edt_num1.text.toString()
            var num2 = edt_num2.text.toString()

//        checking entered fields
            if (num1.isEmpty()or num2.isEmpty()){
                txt_answer.text= "Please fill in all the details"
            }else{
                var answer = num1.toDouble()/ num2.toDouble()
                txt_answer.text = answer.toString()
            }
        }
    }
}