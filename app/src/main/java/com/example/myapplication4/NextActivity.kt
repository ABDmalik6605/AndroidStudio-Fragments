package com.example.myapplication4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val data = intent.getSerializableExtra("data") as? DataClass

        val textView: TextView = findViewById(R.id.textViewData)
        textView.text = data?.data

        val buttonBackToMain: Button = findViewById(R.id.buttonBackToMain)
        buttonBackToMain.setOnClickListener {
            finish()
        }
    }
}
