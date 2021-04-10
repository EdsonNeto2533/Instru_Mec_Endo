package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.TDKPackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class TDKActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t_d_k)
    }

    fun UFILEFun(v: View){
        val inti = Intent(this, UFILEActivity::class.java)
        startActivity(inti)
    }

    fun XFILEFun(v: View){
        val inti = Intent(this, XFILEActivity::class.java)
        startActivity(inti)
    }

    fun XGrayFun(v: View){
        val inti = Intent(this, XGrayActivity::class.java)
        startActivity(inti)
    }



}