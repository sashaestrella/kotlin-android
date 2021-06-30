package com.example.myapplication

import android.R
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)

        var cards = ArrayList<Card>()
        cards.add(Card("30-06-2021", "$1000", "1"))
        cards.add(Card("30-06-2021", "$8000", "1"))

        val lv = findViewById(R.id.list) as ListView
        lv.adapter = CardAdapter(getApplicationContext(),cards)
    }
}