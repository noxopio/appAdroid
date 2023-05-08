package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView




class MainActivity : AppCompatActivity() {
//varibles
    lateinit var  number_1:EditText
    lateinit var  number_2:EditText
    lateinit var  btn_sumar:Button
    lateinit var  btn_restar:Button
    lateinit var  btn_multiplicar:Button
    lateinit var  btn_dividir:Button
    lateinit var  resultado:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         number_1=findViewById(R.id.edit_text_1)
         number_2=findViewById(R.id.edit_text_2)
         btn_sumar=findViewById(R.id.buttton_suma)
         btn_restar=findViewById(R.id.button_resta)
         btn_multiplicar=findViewById(R.id.button_multiplicacion)
         btn_dividir=findViewById(R.id.button_division)
         resultado=findViewById(R.id.text_view)
        fun  sumar  (number1:Double,number2:Double):Double{
            return  number1.toDouble()+number2.toDouble()
        }
        btn_sumar.setOnClickListener(View.OnClickListener {

            if(number_1.getText().toString().isEmpty()||number_2.getText().toString().isEmpty())
            //EditText contiene algún caracter!
                resultado.setText("Empty")
                    else{
                val n1:Double=(number_1.text.toString().toDouble())
                val n2:Double=(number_2.text.toString().toDouble())
            resultado.setText("Total : " + sumar(n1,n2))
            number_1.clearFocus()
            number_2.clearFocus()
        }
        }
        )
        fun  restar (number1:Double,number2:Double):Double{
            return  number1.toDouble()-number2.toDouble()
        }
        btn_restar.setOnClickListener(View.OnClickListener {
            if(number_1.getText().toString().isEmpty()||number_2.getText().toString().isEmpty())
            //EditText contiene algún caracter!
                resultado.setText("Empty" )
            else{
                val n1:Double=(number_1.text.toString().toDouble())
                val n2:Double=(number_2.text.toString().toDouble())
                resultado.setText("Total : " + restar(n1,n2))
                number_1.clearFocus()
                number_2.clearFocus()
            }
        })
        fun  multiplicar (number1:Double,number2:Double):Double{
            return  number1.toDouble()*number2.toDouble()
        }
        btn_multiplicar.setOnClickListener(View.OnClickListener {
            if(number_1.getText().toString().isEmpty()||number_2.getText().toString().isEmpty())
            //EditText contiene algún caracter!
                resultado.setText("Empty")
            else{
                val n1:Double=(number_1.text.toString().toDouble())
                val n2:Double=(number_2.text.toString().toDouble())
            resultado.setText("Total : " + multiplicar(n1,n2))
            number_1.clearFocus()
            number_2.clearFocus()
            }
        })
        fun  division (number1:Double,number2:Double):Double{
             return  number1.toDouble()/number2.toDouble()
        }
        btn_dividir.setOnClickListener(View.OnClickListener {
            if(number_1.getText().toString().isEmpty()||number_2.getText().toString().isEmpty())
            //EditText contiene algún caracter!
                resultado.setText("Empty")
            else{
            val n1:Double=(number_1.text.toString().toDouble())
            val n2:Double=(number_2.text.toString().toDouble())
    resultado.setText("Total : " + division(n1,n2))
    number_1.clearFocus()
    number_2.clearFocus() }
            }
        )
       }
    }



