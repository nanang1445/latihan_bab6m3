package com.example.c_praktik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity_main : AppCompatActivity() {
    val id:Int = 10
    val language:String = "kotlin"

    override fun onCreate (savedInstancesState:Bundle?) {
        super fun onCreate (savedInstancesState)
        setContentView(R.layout.activity_main)

        btn_klik.setOnClickListener() {
            intent = intent (this, MainActivity_main::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("language value",language)
            startActivity(intent)
        }
    }
}