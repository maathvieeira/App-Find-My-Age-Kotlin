package br.com.matheusvieira.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnCalcular(view: View){

        val edtAnoNasc = edtAnoNasc.text.toString()

        if(edtAnoNasc.isEmpty()){
            txtIdade.setText("Você tem que colocar alguma idade!")
        } else {
            calcula(edtAnoNasc)
        }
    }

    fun calcula(edtAnoNasc: String){
        val ano = 2018
        val convIdade = edtAnoNasc.toInt()

        val idade = ano - convIdade


        txtIdade.setText("Sua idade é $idade anos")
    }
}
