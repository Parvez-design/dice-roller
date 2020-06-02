package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.my_button)
        button.setOnClickListener {
            rolldice()
        }
    }

    private fun rolldice() {
        val randomint = Random.nextInt(6) + 1
        val diceimage = findViewById<ImageView>(R.id.image)
        val drawableres = when (randomint) {
            1 -> R.mipmap.dice_1
            2 -> R.mipmap.dice_2
            3 -> R.mipmap.dice_3
            4 -> R.mipmap.dice_4
            5 -> R.mipmap.dice_5
            else -> R.mipmap.dice_6
        }
        diceimage.setImageResource(drawableres)
    }
}
