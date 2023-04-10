package com.example.psucalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import com.google.android.material.button.MaterialButton
import java.util.stream.DoubleStream
import java.util.stream.DoubleStream.concat

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var textn = ""
        var textn1 = ""
        var textn2=""


        var l1 = 1
        var b1 = findViewById<MaterialButton>(R.id.but9)
        var k1 = findViewById<MaterialButton>(R.id.but7)
        var k2 = findViewById<MaterialButton>(R.id.but8)
        var k3 = findViewById<MaterialButton>(R.id.but6)
        var k4 = findViewById<MaterialButton>(R.id.but5)
        var k5 = findViewById<MaterialButton>(R.id.but4)
        var k6 = findViewById<MaterialButton>(R.id.but3)
        var k7 = findViewById<MaterialButton>(R.id.but2)
        var k8 = findViewById<MaterialButton>(R.id.but)
        var k9 = findViewById<MaterialButton>(R.id.but11)
        var k10 = findViewById<MaterialButton>(R.id.button1)
        var k11 = findViewById<MaterialButton>(R.id.but19)
        var k12 = findViewById<MaterialButton>(R.id.but13)
        var k13 =findViewById<MaterialButton>(R.id.but12)
        var k14 = findViewById<MaterialButton>(R.id.but15)
        var k15 = findViewById<MaterialButton>(R.id.but23)
        var k16 =findViewById<MaterialButton>(R.id.but24)
        var k17 =findViewById<MaterialButton>(R.id.but00)
        var t1 = findViewById<TextView>(R.id.textView)
        var t2 = findViewById<TextView>(R.id.textView2)

        k1.setOnClickListener{
            textn1 =  k1.text.toString()
            textn= textn+textn1
            t1.text= textn.toString()
        }
        k2.setOnClickListener{
            textn1 =  k2.text.toString()
            textn += textn1
            t1.text= textn.toString()
        }

        b1.setOnClickListener{
            textn1 =  b1.text.toString()
            textn= textn+textn1
            t1.text= textn.toString()
        }
        k3.setOnClickListener{
           for(i in textn){
               if(i == '+'){

                   var m2=0.0
                   var x1 = ""
                   var m1= textn.split('+')
                   m2=m1[0].toDouble()+m1[1].toDouble()

                   x1 = m2.toString()

                       if(x1.endsWith(".0")) {
                           var x2 = x1.split(".0")
                           t2.text = x2[0].toString()
                       }
                   else{
                       t2.text = m2.toString()

                   }



               }
               if(i == '-'){
                   var m3=0.0
                   var x1 =""
                   var m4= textn.split('-')
                   m3= m4[0].toDouble()-m4[1].toDouble()

                   x1 = m3.toString()

                       if(x1.endsWith(".0")){
                           var x2 = x1.split(".0")
                           t2.text = x2[0].toString()
                       }
                   else{
                       t2.text=m3.toString()

                   }



               }
               if(i == 'x'){
                   var m5=0.0
                   var m6= textn.split('x')
                   m5=m6[0].toDouble()*m6[1].toDouble()
                   t2.text = m5.toString()
                   var x1=""
                   x1 = m5.toString()

                       if(x1.endsWith(".0")){
                           var x2 = x1.split(".0")
                           t2.text = x2[0].toString()
                       }
                  else {
                      t2.text=m5.toString()

                   }


               }
               if(i == '%'){
                   var m7=0.0
                   var m8= textn.split('%')
                   m7=m8[0].toDouble()/m8[1].toDouble()
                   t2.text = m7.toString()
                   var x1=""
                   x1 = m7.toString()

                       if(x1.endsWith(".0")){
                           var x2 = x1.split(".0")
                           t2.text = x2[0].toString()
                       }
                   else{
                         t2.text=m7.toString()
                   }



               }
           }
        }
        k4.setOnClickListener{
            textn1=  k4.text.toString()
            textn += textn1
            t1.text= textn.toString()
        }
        k5.setOnClickListener{
            textn1 =  k5.text.toString()
            textn += textn1
            t1.text= textn.toString()
        }

        k6.setOnClickListener{
            textn1 =  k6.text.toString()
            textn += textn1
            t1.text= textn.toString()
        }
        k7.setOnClickListener{
            textn1 =  k7.text.toString()
            textn += textn1
            t1.text= textn.toString()
        }
        k8.setOnClickListener{
            textn1 =  k8.text.toString()
            textn += textn1
            t1.text= textn.toString()
        }
        k9.setOnClickListener{
            t1.text = ""
            textn=""
        }
        k10.setOnClickListener{
            textn1=  k10.text.toString()
            textn += textn1
            t1.text= textn.toString()
        }
        k11.setOnClickListener{


            for(m in textn){
                if(m == '+' || m=='-' || m=='x' || m=='%'){
                    textn1=""
                }
                else{
                    textn1 =  k11.text.toString()

                }
            }
            textn += textn1
            t1.text= textn.toString()

        }

        k12.setOnClickListener{
            textn1 =  k12.text.toString()
            var d = "."
            var result= textn.endsWith(d)
            if(result){
                textn1=""
            }
            else {
                textn += textn1
                t1.text = textn.toString()
            }
        }
        k13.setOnClickListener{

            textn2 = textn.dropLast(l1)
            t1.text=textn2.toString()
            textn=textn2
        }
        k14.setOnClickListener{
            for(m in textn){
                if(m == '+' || m=='-' || m=='x' || m=='%'){
                    textn1=""
                }
                else{
                    textn1 =  k14.text.toString()

                }
            }
            textn += textn1
            t1.text= textn.toString()
        }
        k15.setOnClickListener{
            for(m in textn){
                if(m == '+' || m=='-' || m=='x' || m=='%'){
                    textn1=""
                }
                else{
                    textn1 =  k15.text.toString()

                }
            }
            textn += textn1
            t1.text= textn.toString()
        }
        k16.setOnClickListener{
            for(m in textn){
                if(m == '+' || m=='-' || m=='x' || m=='%'){
                    textn1=""
                }
                else{
                    textn1 =  k16.text.toString()

                }
            }
            textn += textn1
            t1.text= textn.toString()
        }
        k17.setOnClickListener{
            textn1=  k17.text.toString()
            textn += textn1
            t1.text= textn.toString()
        }





    }


}




