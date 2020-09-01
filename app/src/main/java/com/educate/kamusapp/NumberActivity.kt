package com.educate.kamusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class NumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        val numbers = arrayListOf(
            Item(R.drawable.number_one, "One", "Satu"),
            Item(R.drawable.number_two, "Two", "Dua"),
            Item(R.drawable.number_three, "Three", "Tiga"),
            Item(R.drawable.number_four, "Four", "Empat"),
            Item(R.drawable.number_five, "Five", "Lima"),
            Item(R.drawable.number_six, "Six", "Enam"),
            Item(R.drawable.number_seven, "Seven", "Tujuh"),
            Item(R.drawable.number_eight, "Eight", "Delapan"),
            Item(R.drawable.number_nine, "Nine", "Sembilan"),
            Item(R.drawable.number_zero, "Zero", "Nol")
        )

        val adapter = ItemAdapter(this, numbers)

        val listView : ListView = findViewById(R.id.number_list)
        listView.adapter = adapter
    }
}