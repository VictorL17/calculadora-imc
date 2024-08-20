package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edittextPeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val edittextAltura = findViewById<TextInputEditText>(R.id.edittext_altura)

        val btn_Calcular = findViewById<Button>(R.id.btn_Calcular)

        btn_Calcular.setOnClickListener {
           val peso = edittextPeso.text
            val altura = edittextAltura.text
           println("Victor acao do botao" + altura)
        }

    }
}