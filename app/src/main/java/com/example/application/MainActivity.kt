package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//varibles
 //  lateinit var  number_1:EditText
    //lateinit var  number_2:EditText
    //lateinit var  btn_sumar:Button
   // lateinit var  btn_restar:Button
   // lateinit var  btn_multiplicar:Button
   // lateinit var  btn_dividir:Button
   // lateinit var  resultado:TextView

    private lateinit var binding:ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {

       super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
      //setContentView(R.layout.activity_main)

        var number_1 = binding.editText1
        var number_2 = binding.editText2
        var btn_sumar = binding.butttonSuma
        var btn_restar = binding.buttonResta
        var btn_multiplicar= binding.buttonMultiplicacion
        var btn_dividir= binding.buttonDivision
        var resultado= binding.textView



      //number_1 = findViewById(R.id.edit_text_1)
      //  number_2 = findViewById(R.id.edit_text_2)
       // btn_sumar = findViewById(R.id.buttton_suma)
       // btn_restar = findViewById(R.id.button_resta)
       // btn_multiplicar = findViewById(R.id.button_multiplicacion)
       // btn_dividir = findViewById(R.id.button_division)
       // resultado = findViewById(R.id.text_view)
       // btn_total = findViewById(R.id.button_total)


            //FUN SUMAR
            fun sumar(number1: Double, number2: Double): Double {
                return number1.toDouble() + number2.toDouble()
            }

            //FUN RESTAR
            fun restar(number1: Double, number2: Double): Double {


                return number1.toDouble() - number2.toDouble()
            }

            //FUN MULTIPLICAR
            fun multiplicar(number1: Double, number2: Double): Double {
                return number1.toDouble() * number2.toDouble()
            }

            // FUN DUVIDIR
            fun division(number1: Double, number2: Double): Double {
                return number1.toDouble() / number2.toDouble()
            }




//Button sumar
   btn_sumar.setOnClickListener(View.OnClickListener {
   if (number_1.getText().toString().isEmpty() || number_2.getText().toString().isEmpty()
               ) {
// EditText contiene algún caracter!
                    resultado.setText("Empty")
                } else {
                    val n1:Double=(number_1.text.toString().toDouble())
                    val n2:Double=(number_2.text.toString().toDouble())
                    resultado.setText("SUMA:  " + sumar(n1, n2))
                    number_1.clearFocus()
                    number_2.clearFocus()
                    val intent = Intent(this, resulActivity::class.java)
                    val op = resultado.text.toString()
                    intent.putExtra("suma", op)
                    startActivity(intent)



                }
            }
            )
//Buton restar
            btn_restar.setOnClickListener(View.OnClickListener {
                if (number_1.getText().toString().isEmpty() || number_2.getText().toString()
                        .isEmpty()
                )
                //EditText contiene algún caracter!
                    resultado.setText("Empty")
                else {
                   val n1:Double=(number_1.text.toString().toDouble())
                     val n2:Double=(number_2.text.toString().toDouble())
                    resultado.setText("RESTA:  " + restar(n1, n2))
                    number_1.clearFocus()
                    number_2.clearFocus()

                    val intent = Intent(this, resulActivity::class.java)
                    val op = resultado.text.toString()
                    intent.putExtra("resta", op)
                    startActivity(intent)


                }
            })

            //Button multiplicar
            btn_multiplicar.setOnClickListener(View.OnClickListener {
                if (number_1.getText().toString().isEmpty() || number_2.getText().toString()
                        .isEmpty()
                )
                //EditText contiene algún caracter!
                    resultado.setText("Empty")
                else {
                val n1:Double=(number_1.text.toString().toDouble())
                val n2:Double=(number_2.text.toString().toDouble())
                    resultado.setText("MULTIPLICACION:  " + multiplicar(n1, n2))
                    number_1.clearFocus()
                    number_2.clearFocus()

                    val intent = Intent(this, resulActivity::class.java)
                    val op = resultado.text.toString()
                    intent.putExtra("multiplicacion", op)
                    startActivity(intent)
                }
            })
            //Buton dividir
            btn_dividir.setOnClickListener(View.OnClickListener {
                if (number_1.getText().toString().isEmpty() || number_2.getText().toString()
                        .isEmpty()
                )
                //EditText contiene algún caracter!
                    resultado.setText("Empty")
                else {
                  val n1:Double=(number_1.text.toString().toDouble())
                 val n2:Double=(number_2.text.toString().toDouble())
                    resultado.setText("DIVISION:  " + division(n1, n2))
                    number_1.clearFocus()
                    number_2.clearFocus()

                    val intent = Intent(this, resulActivity::class.java)
                    val op = resultado.text.toString()
                    intent.putExtra("division", op)
                    startActivity(intent)
                }
            }
            )

        }

}


