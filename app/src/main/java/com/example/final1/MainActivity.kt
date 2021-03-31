package com.example.final1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.height
import kotlinx.android.synthetic.main.activity_main.weight
import kotlinx.android.synthetic.main.activity_main.tv
import kotlinx.android.synthetic.main.activity_main.btclear
import kotlinx.android.synthetic.main.activity_main.btok

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        package com.example.final1
        class MainActivity : AppCompatActivity() {

            var num1:Int = 0
            var num2:Int = 0
            var sum = 0

            @SuppressLint("MissingSuperCall")
            override fun onCreate(savedInstanceState: Bundle?) {


                setContentView(R.layout.activity_main)

                btok.setOnClickListener{
                    if (weight.text.toString() > "300" || height.text.toString() > "300"){
                        tv.setText("ไม่สามารถคำนวณข้อมูลได้")
                    }
                    else if(weight.text.toString() < "0" || height.text.toString() < "0"){
                        tv.setText("ไม่สามารถคำนวณข้อมูลได้")
                    }
                    else{
                        num1 = weight.text.toString().toInt()
                        num2 = height.text.toString().toInt()
                        sum = num1 * (num2 / num2)
                        tv.setText(sum)
                    }
                }
                btclear.setOnClickListener{
                    weight.setText(" ")
                    height.setText(" ")
                }
            }
        }
    }
}