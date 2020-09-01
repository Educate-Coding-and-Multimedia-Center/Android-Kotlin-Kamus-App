package com.educate.kamusapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ItemAdapter (val context: Context, val data: ArrayList<Item>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.item_list, parent, false)

        val itemImage : ImageView = view.findViewById(R.id.item_image)
        val englishText : TextView = view.findViewById(R.id.english_text)
        val indonesiaText : TextView = view.findViewById(R.id.indonesia_text)

        val item = getItem(position) as Item
        itemImage.setImageResource(item.image)
        englishText.text = item.english
        indonesiaText.text = item.indonesian

        return view
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.size
    }
}