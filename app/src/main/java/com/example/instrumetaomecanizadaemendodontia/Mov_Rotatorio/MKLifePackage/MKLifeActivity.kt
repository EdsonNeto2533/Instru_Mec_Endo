package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.MKLifePackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class MKLifeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m_k_life)
    }

    fun ProTFun(v: View){
        val inti = Intent(this, ProTActivity::class.java)
        startActivity(inti)
    }

    fun SRFSequencyFun(v: View){
        val inti = Intent(this, SRFSequencyActivity::class.java)
        startActivity(inti)
    }

}