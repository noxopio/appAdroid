package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.application.databinding.ActivityResulBinding

class resulActivity : AppCompatActivity() {


    private lateinit var binding:ActivityResulBinding














    override fun onCreate(savedInstanceState: Bundle?) {
      //  super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_resul)

        super.onCreate(savedInstanceState)
        binding= ActivityResulBinding.inflate(layoutInflater)
        setContentView(binding.root)



    //    var   resultadoSuma=findViewById<TextView>((R.id.view_suma))
          var resultadoSuma=binding.viewSuma
          val totalSuma :String=intent.extras?.getString("suma").orEmpty()
          resultadoSuma.text="$totalSuma"

     //   var   resultadosResta=findViewById<TextView>((R.id.view_resta))
        var resultadosResta = binding.viewResta
        val totalResta :String=intent.extras?.getString("resta").orEmpty()
        resultadosResta.text="$totalResta"


   //     var   resultadosMultiplicacion=findViewById<TextView>((R.id.view_multiplicacion))
        var resultadosMultiplicacion =binding.viewMultiplicacion
        val totalMultiplicacion :String=intent.extras?.getString("multiplicacion").orEmpty()
        resultadosMultiplicacion.text="$totalMultiplicacion"

        var   resultadosDivision=findViewById<TextView>((R.id.view_division))
        val totalDivision :String=intent.extras?.getString("division").orEmpty()
        resultadosDivision.text="$totalDivision"


    }








}