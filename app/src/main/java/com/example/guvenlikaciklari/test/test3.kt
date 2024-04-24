package com.example.guvenlikaciklari.test

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.example.guvenlikaciklari.R
import com.example.guvenlikaciklari.incelemeler.incele1

class test3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3)

        val cBox1:CheckBox = findViewById(R.id.cBox1)
        val cBox2:CheckBox = findViewById(R.id.cBox2)
        val cBox3:CheckBox = findViewById(R.id.cBox3)
        val cBox4:CheckBox = findViewById(R.id.cBox4)
        val cBox5:CheckBox = findViewById(R.id.cBox5)
        val cBox6:CheckBox = findViewById(R.id.cBox6)
        val cBox7:CheckBox = findViewById(R.id.cBox7)
        val cBox8:CheckBox = findViewById(R.id.cBox8)

        val bitirBut:Button = findViewById(R.id.bitirButton)



        bitirBut.setOnClickListener{
            val intent = Intent(this, test4::class.java)
            var sayac = 9
            if (cBox1.isChecked){
                sayac -= 1
            }
            if (cBox2.isChecked){
                sayac -= 1
            }
            if (cBox3.isChecked){
                sayac -= 1
            }
            if (cBox4.isChecked){
                sayac -= 1
            }
            if (cBox5.isChecked){
                sayac -= 1
            }
            if (cBox6.isChecked){
                sayac -= 1
            }
            if (cBox7.isChecked){
                sayac -= 1
            }
            if (cBox8.isChecked){
                sayac -= 1
            }

            intent.putExtra("sayac", sayac)
            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }
    }
}