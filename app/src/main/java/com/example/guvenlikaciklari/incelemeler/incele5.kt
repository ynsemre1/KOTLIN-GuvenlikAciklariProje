package com.example.guvenlikaciklari.incelemeler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.guvenlikaciklari.MainActivity
import com.example.guvenlikaciklari.R

class incele5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incele5)

        val anaSayfa2Button: Button = findViewById(R.id.anaSayfaButton2)

        anaSayfa2Button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }

        val devam2Button: Button = findViewById(R.id.devam2Button)

        devam2Button.setOnClickListener{
            val intent = Intent(this, incele6::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }
    }
}