package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resul)
        var   resultados=findViewById<TextView>((R.id.view_suma))
        val toltalSuma :String=intent.extras?.getString("operacion").orEmpty()
        resultados.text="$toltalSuma"
    }
}