package com.example.c_praktik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kedua.*

class MainActivitykedua : AppCompatActivity() {

    override fun onCreate (savedInstanceState : Bundle?) {


        super.onCreate (savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val bundle:Bundle = intent.extras
        val id = bundle.get("id_vallue")
        val language = bundle.get("language_value")
        Toast.makeText(applicationContext,id.toString()+""+language,Toast.LENGTH_LONG).show()
        btn_back.setOnClickListener() {
            intent = intent (this, MainActivitykedua::class.java)
            startActivity(intent)
        }
    }
}
