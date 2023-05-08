package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resul)

        var   resultadoSuma=findViewById<TextView>((R.id.view_suma))
        val toltalSuma :String=intent.extras?.getString("suma").orEmpty()
        resultadoSuma.text="$toltalSuma"

        var   resultadosResta=findViewById<TextView>((R.id.view_resta))
        val totalResta :String=intent.extras?.getString("resta").orEmpty()
        resultadosResta.text="$totalResta"


        var   resultadosMultiplicacion=findViewById<TextView>((R.id.view_multiplicacion))
        val totalMultiplicacion :String=intent.extras?.getString("multiplicacion").orEmpty()
        resultadosMultiplicacion.text="$totalMultiplicacion"

        var   resultadosDivision=findViewById<TextView>((R.id.view_division))
        val totalDivision :String=intent.extras?.getString("division").orEmpty()
        resultadosDivision.text="$totalDivision"


    }








}