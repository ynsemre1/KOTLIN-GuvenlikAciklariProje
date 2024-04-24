package com.example.guvenlikaciklari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.guvenlikaciklari.incelemeler.incele1
import com.example.guvenlikaciklari.sifre.sifreolustur
import com.example.guvenlikaciklari.test.test1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ornekButton: Button = findViewById(R.id.ornekButton)
        val testButton: Button = findViewById(R.id.testButton)
        val sifreButton: Button = findViewById(R.id.sifreButton)

        ornekButton.setOnClickListener{
            val intent = Intent(this, incele1::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }

        testButton.setOnClickListener{
            val intent = Intent(this, test1::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }

        sifreButton.setOnClickListener{
            val intent = Intent(this, sifreolustur::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }
    }
}