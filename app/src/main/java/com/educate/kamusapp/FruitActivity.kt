package com.educate.kamusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class FruitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)

//        val fruits = arrayOf(
//            "Apple",
//            "Avocado",
//            "Banana",
//            "Grape",
//            "Lemon",
//            "Orange",
//            "Pear",
//            "Pineapple",
//            "Strawberry",
//            "Watermelon"
//        )

//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits)

        val fruits = arrayListOf(
            Item(R.drawable.fruit_apple, "Apple", "Apel"),
            Item(R.drawable.fruit_avocado, "Avocado", "Alpukat"),
            Item(R.drawable.fruit_banan, "Banana", "Pisang"),
            Item(R.drawable.fruit_grape, "Grape", "Anggur"),
            Item(R.drawable.fruit_lemon, "Lemon", "Lemon"),
            Item(R.drawable.fruit_orange, "Orange", "Jeruk"),
            Item(R.drawable.fruit_pear, "Pear", "Pir"),
            Item(R.drawable.fruit_pineapple, "Pineapple", "Nanas"),
            Item(R.drawable.fruit_strawberry, "Strawberry", "Stroberi"),
            Item(R.drawable.fruit_watermelon, "Watermelon", "Semangka")
        )

        val adapter = ItemAdapter(this, fruits)

        val listView : ListView = findViewById(R.id.fruits_list)
        listView.adapter = adapter
    }
}