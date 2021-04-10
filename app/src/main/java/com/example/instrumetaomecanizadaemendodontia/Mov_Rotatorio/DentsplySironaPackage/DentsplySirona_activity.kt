package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.DentsplySironaPackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class DentsplySirona_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dentsply_sirona_activity)
    }

    fun PropaterUniver(v: View){
        val inti = Intent(this, ProtaperUniversalActivity::class.java)
        startActivity(inti)
    }

    fun ProtaperNextFun(v: View){
        val inti = Intent(this, ProtaperNextActivity::class.java)
        startActivity(inti)
    }

    fun ProtaperGoldFun(v: View){
        val inti = Intent(this, ProtaperGoldActivity::class.java)
        startActivity(inti)
    }

    fun TruNatomyFun(v: View){
        val inti = Intent(this, TruNatomyActivity::class.java)
        startActivity(inti)
    }

}