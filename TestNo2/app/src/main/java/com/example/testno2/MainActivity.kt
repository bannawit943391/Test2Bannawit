package com.example.testno2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var answer:Int = 0
        var channel = 0
        var plus = ""

        var summer = 0

        a0.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("0")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(0)
                answer.setText(str)
            }
        }

        a1.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("1")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(1)
                answer.setText(str)
            }
        }

        a2.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("2")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(2)
                answer.setText(str)
            }
        }

        a3.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("3")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(3)
                answer.setText(str)
            }
        }

        a4.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("4")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(4)
                answer.setText(str)
            }
        }

        a5.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("5")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(5)
                answer.setText(str)
            }
        }

        a6.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("6")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(6)
                answer.setText(str)
            }
        }

        a7.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("7")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(7)
                answer.setText(str)
            }
        }

        a8.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("8")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(8)
                answer.setText(str)
            }
        }

        a9.setOnClickListener {
            if(answer.text.toString() == "0" || channel == 1) {
                answer.setText("9")
                channel = 0
            }
            else{
                var str = answer.text.toString().plus(9)
                answer.setText(str)
            }
        }

        C.setOnClickListener {
            answer.setText("0")
        }

        del.setOnClickListener {
            if(answer.text.toString().length <= 1) {
                answer.setText("0")

            }
            else if(answer.text.isNotEmpty()){
                answer.text = answer.text.dropLast(1)

            }
        }

        plus.setOnClickListener {
            answer = answer.text.toString().toInt()
            channel = 1
            plus = "plus"
        }

        discount.setOnClickListener {
            answer = answer.text.toString().toInt()
            channel = 1
            plus = "minus"
        }

        multiply.setOnClickListener {
            answer = answer.text.toString().toInt()
            channel = 1
            plus = "mul"
        }

        devide.setOnClickListener {
            answer = answer.text.toString().toInt()
            channel = 1
            plus = "div"
        }

        percent.setOnClickListener {
            answer = answer.text.toString().toInt()
            channel = 1
            plus = "mod"
        }


        answer.setOnClickListener {
            if(plus == "plus") {
                summer = answer + answer.text.toString().toInt()
                answer.setText(summer.toString())
            }
            else if (plus == "minus"){
                summer = answer - answer.text.toString().toInt()
                answer.setText(summer.toString())

            }
            else if (plus == "mul"){
                summer = answer * answer.text.toString().toInt()
                answer.setText(summer.toString())
            }
            else if (plus == "div"){
                summer = answer / answer.text.toString().toInt()
                answer.setText(summer.toString())
            }
            else if (plus == "mod"){

                var mod = 0
                summer = answer % answer.text.toString().toInt()

                answer.setText(summer.toString())
            }

        }
    }
}