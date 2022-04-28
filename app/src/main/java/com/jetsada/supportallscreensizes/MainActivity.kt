package com.jetsada.supportallscreensizes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Note
           Smallest Screen Width Response Size
           - 320dp: Small to medium phone screen
           - 480dp: Large phone screen
           - 600dp: small tablet screen
           - 720dp: Large tablet screen

           Screen Density
            LDPI สำหรับ Density ประมาณ 120
            MDPI สำหรับ Density ประมาณ 160
            HDPI สำหรับ Density ประมาณ 240
            XHDPI สำหรับ Density ประมาณ 320
            XXHDPI สำหรับ Density ประมาณ 480
            XXXHDPI สำหรับ Density ประมาณ 640
        */


    }
}