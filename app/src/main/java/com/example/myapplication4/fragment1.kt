package com.example.myapplication4

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)

        val button = view.findViewById<Button>(R.id.buttonFragment1)
        button.setOnClickListener {
            val data = DataClass("Try,try and try again")
            val intent = Intent(activity, NextActivity::class.java)
            intent.putExtra("data", data)
            startActivity(intent)
        }

        return view
    }
}