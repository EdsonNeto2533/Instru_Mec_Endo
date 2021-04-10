package com.example.instrumetaomecanizadaemendodontia.Mov_Reciprocante.Limas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class limasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_limas)
    }
    fun waveFun(v: View){
        val inti = Intent(this, waveActivity::class.java)
        startActivity(inti)
    }
    fun recipBlueFun(v: View){
        val inti = Intent(this, recipBlueActivity::class.java)
        startActivity(inti)
    }
    fun x1BlueFun(v: View){
        val inti = Intent(this, x1BlueActivity::class.java)
        startActivity(inti)
    }
    fun wFileFun(v: View){
        val inti = Intent(this, wFileActivity::class.java)
        startActivity(inti)
    }
    fun proDesignRFun(v: View){
        val inti = Intent(this, proDesignRActivity::class.java)
        startActivity(inti)
    }
    fun uniconeFun(v: View){
        val inti = Intent(this, uniconeActivity::class.java)
        startActivity(inti)
    }
}