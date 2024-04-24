package com.example.guvenlikaciklari.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RatingBar
import android.widget.TextView
import androidx.core.view.isInvisible
import com.example.guvenlikaciklari.MainActivity
import com.example.guvenlikaciklari.R

class test4 : AppCompatActivity() {

    private var progressStatus = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test4)

        val gelenIntent = intent

        val sonucT:TextView = findViewById(R.id.sonucText)
        val progressBar:ProgressBar = findViewById(R.id.rBar)
        val aBut:Button = findViewById(R.id.anasayfaButto)
        val pText:TextView = findViewById(R.id.pText)
        val progButton:Button = findViewById(R.id.programButton)

        val sayac = gelenIntent.getIntExtra("sayac", 0)
        sonucT.text = sayac.toString()


        // İlerleme çubuğunu güncelleyen fonksiyon
        fun updateProgressBar() {
            progressBar.progress = progressStatus
        }

        // İlerleme çubuğunu belirli bir değere göre artırıp azaltan fonksiyon
        fun updateProgress(value: Int) {
            progressStatus += value
            if (progressStatus < 0) {
                progressStatus = 0
            } else if (progressStatus > 100) {
                progressStatus = 100
            }
            updateProgressBar()
        }

        updateProgress(sayac*15)

        if (sayac in 0..3) {
            // 0-3 arası
            pText.visibility = View.VISIBLE
        } else if (sayac in 4..6) {
            // 4-6 arası
            // Diğer işlemleri buraya ekleyebilirsiniz
            pText.visibility = View.VISIBLE
            pText.text = "Test Sonuçlarınız Ortalamanın Üzerinde Eger Aklınızda ki Soru işaretleri hala devam ediyorsa " +
                    "'Program' butonundan önerdiğimiz Anti-Virüs programını indirerek güvenli bir tarama yapabilirsiniz."
        } else {
            // 7-8 arası (ve diğer durumlar)
            // Diğer işlemleri buraya ekleyebilirsiniz
            pText.visibility = View.VISIBLE
            pText.text = "Test Sonuçlarınız Gayet İyi.."

        }

        aBut.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            // İhtiyaca göre veri ekleyebilirsiniz
            // intent.putExtra("anahtar", deger)

            // Yeni aktiviteyi başlat
            startActivity(intent)
        }

        progButton.setOnClickListener {
            // Yönlendirme yapmak istediğiniz uygulamanın Google Play URL'sini belirleyin
            val appPackageName = "com.antivirus" // Hedef uygulamanın paket adını buraya ekleyin

            // Google Play'e yönlendirmek için Intent oluşturun
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.antivirus"))

            // Eğer Google Play uygulaması yüklü ise Google Play'de aç, yoksa tarayıcıda aç
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.antivirus&hl=tr&gl=US"))
                startActivity(browserIntent)
            }

            // Butona tıklanınca yönlendirmeyi başlat

                startActivity(intent)
            }
        }

    }



