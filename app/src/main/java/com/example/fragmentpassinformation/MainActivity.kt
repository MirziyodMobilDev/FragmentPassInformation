package com.example.fragmentpassinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var firstFragment: FirstFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var firstFragment = FirstFragment()
        supportFragmentManager.beginTransaction().add(R.id.conteiner,firstFragment).commit()
    }
}