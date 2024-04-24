package com.example.guvenlikaciklari.sifre

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.guvenlikaciklari.MainActivity
import com.example.guvenlikaciklari.R
import com.example.guvenlikaciklari.incelemeler.incele1

class sifreolustur : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sifreolustur)

        val anaSayfaBut:Button = findViewById(R.id.anasayfaButt)
        anaSayfaBut.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }

        val randomPassword = generateRandomPassword(12)

        val sifre: TextView = findViewById(R.id.olusanSifre)
        sifre.text = randomPassword

        val xBut:Button = findViewById(R.id.xBut)
        val instaBut:Button = findViewById(R.id.instaBut)
        val facebookBut:Button = findViewById(R.id.facebookBut)

        xBut.setOnClickListener{
            val intent = Intent(this, sifreolustu2::class.java)
            intent.putExtra("xsifre", randomPassword)
            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }
        instaBut.setOnClickListener{
            val intent = Intent(this, sifreolustu2::class.java)
            intent.putExtra("instasifre", randomPassword)
            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }
        facebookBut.setOnClickListener{
            val intent = Intent(this, sifreolustu2::class.java)
            intent.putExtra("facebooksifre", randomPassword)
            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }

        val kopyalaBut:Button = findViewById(R.id.kopyalaBut)
        kopyalaBut.setOnClickListener {
            val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

            // Kopyalanacak metni bir ClipData nesnesine yerleştir
            val clipData = ClipData.newPlainText("label", randomPassword)

            // Clipboard'e metni yerleştir
            clipboardManager.setPrimaryClip(clipData)

        }


    }

    fun generateRandomPassword(length: Int): String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9') + listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')')

        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}