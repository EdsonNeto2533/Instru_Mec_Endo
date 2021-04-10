package com.example.instrumetaomecanizadaemendodontia.Mov_Reciprocante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.Mov_Reciprocante.Limas.limasActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Reciprocante.Motores.motoresActivity
import com.example.instrumetaomecanizadaemendodontia.R

class MovReciActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mov_reci)
    }
    fun motoresFun(v: View){
        val inti = Intent(this, motoresActivity::class.java)
        startActivity(inti)
    }
    fun limasFun(v: View){
        val inti = Intent(this, limasActivity::class.java)
        startActivity(inti)
    }
}