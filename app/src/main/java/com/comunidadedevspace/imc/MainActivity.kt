package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edittextPeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val edittextAltura = findViewById<TextInputEditText>(R.id.edittext_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_Calcular)

        btnCalcular.setOnClickListener {


           val pesoStr: String = edittextPeso.text.toString()
            val alturaStr: String = edittextAltura.text.toString()

            if(pesoStr == "" || alturaStr == "") {


            Snackbar
                .make(
                edtPeso,
                "Preencha todos os campos",
                 Snackbar.LENGTH_LONG
            )
                .show()

            } else {
            val peso: = pesoStr.toFloat()
            val altura: = alturaStr.toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

           println("Victor acao do botao" + resultado)
        }

    }
}