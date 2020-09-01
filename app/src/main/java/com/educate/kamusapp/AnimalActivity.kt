package com.educate.kamusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class AnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        val animals = arrayListOf(
            Item(R.drawable.animal_camel, "Camel", "Unta"),
            Item(R.drawable.animal_cat, "Cat", "Kucing"),
            Item(R.drawable.animal_dog, "Dog", "Anjing"),
            Item(R.drawable.animal_donkey, "Donkey", "Keledai"),
            Item(R.drawable.animal_elephant, "Elephant", "Gajah"),
            Item(R.drawable.animal_girrafe, "Giraffe", "Jerapah"),
            Item(R.drawable.animal_horse, "Horse", "Kuda"),
            Item(R.drawable.animal_lion, "Lion", "Singa"),
            Item(R.drawable.animal_tortoise, "Tortoise", "Kura-kura"),
            Item(R.drawable.animal_rhino, "Rhino", "Badak")
        )

        val adapter = ItemAdapter(this, animals)

        val listView : ListView = findViewById(R.id.animal_list)
        listView.adapter = adapter
    }
}