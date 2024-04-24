package com.example.guvenlikaciklari.incelemeler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.guvenlikaciklari.MainActivity
import com.example.guvenlikaciklari.R

class incele1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incele1)

        val anaSayfaButton: Button = findViewById(R.id.anaSayfaButton)

        anaSayfaButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }

        val devamButton: Button = findViewById(R.id.devam1Button)

        devamButton.setOnClickListener{
            val intent = Intent(this, incele2::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }
    }
}