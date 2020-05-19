package com.example.salariomes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalcular.setOnClickListener {
            // Variáveis
            var valorHoraTrabalhada   = txtValorHoraTrabalhada.text.toString().toFloat()
            var qtdDiasTrabalhados      = txtDiasTrabalhados.text.toString().toInt()
            var qtdHorasDias            = txtQtdHorasDias.text.toString().toInt()

            //Variáveis Descontos
            var iss = 0.05
            var fgts = 0.08

            var salarioBruto = qtdHorasDias * qtdDiasTrabalhados * valorHoraTrabalhada
            var descontoIss = salarioBruto * iss
            var descontoFgts = salarioBruto * fgts
            var salarioLiquido = salarioBruto - (descontoIss + descontoFgts)


            lblSalarioBruto.text = "Salario Bruto: ${salarioBruto}"
            lblDescIss.text = "Desc. ISS: ${descontoIss}"
            lblDescFGTS.text = "Desc. FGTS: ${descontoFgts}"
            lblSalarioLiquido.text = "Salario Liquido: ${salarioLiquido}"




        }





    }
}
