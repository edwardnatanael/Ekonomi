package com.example.latihanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_cal.setOnClickListener {
            val intent = Intent(this, CalActivity::class.java)
            startActivity(intent)
        }


        btn_about.setOnClickListener {
            val namaku = "Bagus & Danny"
            val email = "bagusrr02@gmail.com"
            val phone = "085156051904"

            val about = Intent(this, AboutActivity::class.java)
            about.putExtra("Namaku", namaku)
            about.putExtra("Email", email)
            about.putExtra("Phone", phone)
            startActivity(about)
        }

        btn_form.setOnClickListener {
            val beritaku = "pada tanggal 9 novenmber di kampus Politeknik Harapan Bersama Tegal mengeluarkan surat edaran tentang pencegahan COVID 19. dan surat ini datangnya dadakan seperti tahu bulat, kegiatan di kampus yang sebelumnya sudah mulai praktik di kampus tapi ketika surat edaran keluar di poaksakan untuk melalui daring atau online"

            val berita = Intent(this, Berita2Activity::class.java)
            berita.putExtra("Berita", beritaku)
            startActivity(berita)
        }
    }
}
