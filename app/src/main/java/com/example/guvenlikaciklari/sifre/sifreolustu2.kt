package com.example.guvenlikaciklari.sifre

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.guvenlikaciklari.MainActivity
import com.example.guvenlikaciklari.R
import com.example.guvenlikaciklari.incelemeler.incele1

class sifreolustu2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sifreolustu2)

        val anaBut:Button = findViewById(R.id.aButt)

        anaBut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }

        val instaSifreTex:TextView = findViewById(R.id.instaSifreTex)
        val xSifreTex:TextView = findViewById(R.id.xSifreTex)
        val facebookSifreTex:TextView = findViewById(R.id.facebookSifreTex)

        val gelenIntent = intent
        val sayac = gelenIntent.getStringExtra("xsifre")
        xSifreTex.text = sayac.toString()

        val sayac1 = gelenIntent.getStringExtra("facebooksifre")
        facebookSifreTex.text = sayac1.toString()

        val sayac2 = gelenIntent.getStringExtra("instasifre")
        instaSifreTex.text = sayac2.toString()

    }
}