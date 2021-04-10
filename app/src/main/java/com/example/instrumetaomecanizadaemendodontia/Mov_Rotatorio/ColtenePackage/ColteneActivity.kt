package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.ColtenePackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class ColteneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coltene)
    }

    fun HyflexCMFun(v: View){
        val inti = Intent(this, HyflexCMActivity::class.java)
        startActivity(inti)
    }
}