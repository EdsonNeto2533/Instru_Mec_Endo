package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.UniversoOdontoPackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class UniversoOdontoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universo_odonto)
    }

    fun Univy3Fun(v: View){
        val inti = Intent(this, Univy3Activity::class.java)
        startActivity(inti)
    }

}