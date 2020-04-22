package com.jaques.projetos.caraoucoroa

import android.app.Activity
import android.app.PendingIntent
import android.content.Intent
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.os.bundleOf
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    private lateinit var imageResultado: ImageView
    private lateinit var buttonVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        imageResultado = imageView_resultado
        buttonVoltar  = button_voltar


        val dados = intent.extras
        val numero: Int = dados?.getInt("numero") ?: 0

        if (numero == 0) {
            imageResultado.setImageResource(R.drawable.moeda_cara)
        } else imageResultado.setImageResource(R.drawable.moeda_coroa)
    }

    fun voltar(v: View): Unit {

        buttonVoltar.setOnClickListener {
            finish()
        }
    }
    
}
