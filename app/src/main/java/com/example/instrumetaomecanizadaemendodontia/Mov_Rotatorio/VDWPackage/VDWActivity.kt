package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.VDWPackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class VDWActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v_d_w)
    }

    fun MTWOFun(v: View){
        val inti = Intent(this, MTWOActivity::class.java)
        startActivity(inti)
    }
}