package com.educate.kamusapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruitLayout : LinearLayout = findViewById(R.id.fruits_layout)
        val animalLayout : LinearLayout = findViewById(R.id.animals_layout)
        val numberLayout : LinearLayout = findViewById(R.id.numbers_layout)
        val thingLayout : LinearLayout = findViewById(R.id.things_layout)

        fruitLayout.setOnClickListener(this)
        animalLayout.setOnClickListener(this)
        numberLayout.setOnClickListener(this)
        thingLayout.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val intent = when (view?.id) {
            R.id.fruits_layout -> Intent(this@MainActivity, FruitActivity::class.java)
            R.id.animals_layout -> Intent(this@MainActivity, AnimalActivity::class.java)
            R.id.numbers_layout -> Intent(this@MainActivity, NumberActivity::class.java)
            R.id.things_layout -> Intent(this@MainActivity, ThingActivity::class.java)
            else -> Intent()
        }
        startActivity(intent)
    }
}