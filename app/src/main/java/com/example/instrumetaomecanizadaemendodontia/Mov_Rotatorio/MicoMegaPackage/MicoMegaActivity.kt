package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.MicoMegaPackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class MicoMegaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mico_mega)
    }

    fun RevoSFun(v: View){
        val inti = Intent(this, RevoSActivity::class.java)
        startActivity(inti)
    }

    fun HeroShaperFun(v: View){
        val inti = Intent(this, HeroShaperActivity::class.java)
        startActivity(inti)
    }

    fun OneshapeFun(v: View){
        val inti = Intent(this, OneshapeActivity::class.java)
        startActivity(inti)
    }

    fun ShapeFun(v: View){
        val inti = Intent(this, ShapeActivity::class.java)
        startActivity(inti)
    }
}