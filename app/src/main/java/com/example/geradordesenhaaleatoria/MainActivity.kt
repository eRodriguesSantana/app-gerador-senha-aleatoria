package com.example.geradordesenhaaleatoria

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.txtFrase
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View) {
        val caracteres = "ABCDEFGHIJKLMNOPQRSTUVYWXZ!@#$%&*_-+=1234567890abcdefghijklmnopqrstuvywxz"
        val random = Random()

        var senhaGerada = ""
        var index = -1
        for (i in 0..15) {
            index = random.nextInt(caracteres.length)
            senhaGerada += caracteres.substring(index, index + 1)
        }

        txtFrase.text = senhaGerada
    }
}


