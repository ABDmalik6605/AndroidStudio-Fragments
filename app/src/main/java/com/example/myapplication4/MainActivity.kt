package com.example.myapplication4

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    private lateinit var fragment1: Fragment
    private lateinit var fragment2: Fragment
    private lateinit var fragmentManager: FragmentManager
    private lateinit var buttonShowFragment1: Button
    private lateinit var buttonShowFragment2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initUI()
        setListeners()
    }
    private fun initUI() {
        fragment1 = FirstFragment()
        fragment2 = SecondFragment()
        fragmentManager = supportFragmentManager
        buttonShowFragment1 = findViewById(R.id.buttonShowFragment1)
        buttonShowFragment2 = findViewById(R.id.buttonShowFragment2)
    }
    private fun setListeners() {
        buttonShowFragment1.setOnClickListener { showFragment(fragment1) }
        buttonShowFragment2.setOnClickListener { showFragment(fragment2) }
    }
    private fun showFragment(fragment: Fragment) {
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}
