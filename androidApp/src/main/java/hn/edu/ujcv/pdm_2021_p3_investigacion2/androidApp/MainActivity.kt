package hn.edu.ujcv.pdm_2021_p3_investigacion2.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import hn.edu.ujcv.pdm_2021_p3_investigacion2.shared.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    lateinit var numero: EditText
    lateinit var resultado: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero=findViewById(R.id.txvNumero)
        resultado=findViewById(R.id.txvResultado)

    }
    fun factorial(n:Float):Float{
        var dato:Float=1F
        for(i in 1..n.toInt() ) {
            dato*=i

        }
        return dato
    }
    fun calcular(view: View){
        var resultadoF=factorial(numero.text.toString().toFloat())
        resultado.setText(resultadoF.toString())
    }

}




