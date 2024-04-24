package com.example.guvenlikaciklari.test

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.guvenlikaciklari.R
import com.example.guvenlikaciklari.incelemeler.incele1

class test1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)

        val testButton: Button = findViewById(R.id.testeBaslaBut)

        testButton.setOnClickListener{
            val intent = Intent(this, test3::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }
    }
}