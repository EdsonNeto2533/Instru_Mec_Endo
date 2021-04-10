package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.MedinPackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class MedinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medin)
    }

    fun NavigatorEVOFun(v: View){
        val inti = Intent(this, NavigatorEVOActivity::class.java)
        startActivity(inti)
    }

}