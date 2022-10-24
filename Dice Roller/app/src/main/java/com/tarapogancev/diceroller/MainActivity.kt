package com.tarapogancev.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            Toast.makeText(this, "Dice rolled", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val imageView : ImageView = findViewById(R.id.imageView)
        when (diceRoll) {
            1 -> imageView.setImageResource(R.drawable.dice_1)
            2 -> imageView.setImageResource(R.drawable.dice_2)
            3 -> imageView.setImageResource(R.drawable.dice_3)
            4 -> imageView.setImageResource(R.drawable.dice_4)
            5 -> imageView.setImageResource(R.drawable.dice_5)
            else -> imageView.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }

}