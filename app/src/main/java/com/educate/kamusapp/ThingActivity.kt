package com.educate.kamusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ThingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thing)

        val things = arrayListOf(
            Item(R.drawable.things_book, "Book", "Buku"),
            Item(R.drawable.things_calculator, "Calculator", "Kalkulator"),
            Item(R.drawable.things_colored_pencil, "Colored Pencil", "Pensil Warna"),
            Item(R.drawable.things_compass, "Compass", "Jangka"),
            Item(R.drawable.things_computer, "Computer", "Komputer"),
            Item(R.drawable.things_desk, "Desk", "Meja Belajar"),
            Item(R.drawable.things_dictionary, "Dictionary", "Kamus"),
            Item(R.drawable.things_eraser, "Eraser", "Penghapus"),
            Item(R.drawable.things_pencil, "Pencil", "Pensil"),
            Item(R.drawable.things_school_bag, "School Bag", "Tas Sekolah")
        )

        val adapter = ItemAdapter(this, things)

        val listView : ListView = findViewById(R.id.thing_list)
        listView.adapter = adapter
    }
}