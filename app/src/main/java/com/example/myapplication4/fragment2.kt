package com.example.myapplication4

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)

        val button = view.findViewById<Button>(R.id.buttonFragment2)
        button.setOnClickListener {
            val data = DataClass("Give up on your dreams and die")
            val intent = Intent(activity, NextActivity::class.java)
            intent.putExtra("data", data)
            startActivity(intent)
        }

        return view
    }
}