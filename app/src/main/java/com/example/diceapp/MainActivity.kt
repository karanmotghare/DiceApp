package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_dice.setOnClickListener{
            rolled()
        }
    }
    private fun rolled(){

        val dice1Img = when((1..6).random()){
            1->R.drawable.dice1
            2->R.drawable.dice2
            3->R.drawable.dice3
            4->R.drawable.dice4
            5->R.drawable.dice5
            6->R.drawable.dice6
            else ->R.drawable.dice6
        }
        img_dice.setImageResource(dice1Img)
    }
}