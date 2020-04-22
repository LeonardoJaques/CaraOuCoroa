package com.jaques.projetos.caraoucoroa

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var buttonPlay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun jogar (v:View) {
        buttonPlay = button_jogar
        buttonPlay.setOnClickListener { view ->

            val numero:Int = Random.nextInt(until = 2)

            val intent = Intent(applicationContext,ResultadoActivity::class.java)
            intent.putExtra("numero",numero)

            buttonPlay.context.startActivity(intent)
        }
    }
}




