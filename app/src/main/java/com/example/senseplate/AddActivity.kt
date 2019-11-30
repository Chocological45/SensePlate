package com.example.senseplate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        val mealText = intent.getStringExtra("MealType")
        val textView = findViewById<TextView>(R.id.mealName)

        textView.text = mealText

        val red = findViewById<Button>(R.id.button_red)
        val yellow = findViewById<Button>(R.id.button_yellow)
        val green = findViewById<Button>(R.id.button_green)

        red.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            intent.putExtra("Color","Red")
            startActivity(intent)
        }
        yellow.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            intent.putExtra("Color","Yellow")
            startActivity(intent)
        }
        green.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            intent.putExtra("Color","Green")
            startActivity(intent)
        }
    }
}