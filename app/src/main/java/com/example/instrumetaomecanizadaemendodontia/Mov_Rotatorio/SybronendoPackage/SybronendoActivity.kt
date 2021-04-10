package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.SybronendoPackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class SybronendoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sybronendo)
    }

    fun K3XFFun(v: View){
        val inti = Intent(this, K3XFActivity::class.java)
        startActivity(inti)
    }

    fun TFAdaptiveFun(v: View){
        val inti = Intent(this, TFAdaptiveActivity::class.java)
        startActivity(inti)
    }
}