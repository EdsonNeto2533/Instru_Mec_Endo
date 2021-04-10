package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.FKGDentairePackage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.R

class FKGDentaireActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f_k_g_dentaire)
    }

    fun IraceFun(v: View){
        val inti = Intent(this, IRaceActivity::class.java)
        startActivity(inti)
    }

    fun BioRaceFun(v: View){
        val inti = Intent(this, BioRaceActivity::class.java)
        startActivity(inti)
    }
}