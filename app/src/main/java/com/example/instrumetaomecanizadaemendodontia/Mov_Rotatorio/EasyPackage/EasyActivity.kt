package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.EasyPackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class EasyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easy)
    }

    fun ProDesignSFun(v: View){
        val inti = Intent(this, ProDesignSActivity::class.java)
        startActivity(inti)
    }

    fun FlexGoldFun(v: View){
        val inti = Intent(this, FlexGoldActivity::class.java)
        startActivity(inti)
    }

    fun ProDesignLogicFun(v: View){
        val inti = Intent(this, ProDesignLogicActivity::class.java)
        startActivity(inti)
    }
}