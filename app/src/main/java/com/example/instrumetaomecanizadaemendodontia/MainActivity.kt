package com.example.instrumetaomecanizadaemendodontia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.Mov_Reciprocante.MovReciActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.Mov_Rotatorio_Actibity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Mov_Rot_act(v: View){
        val inti = Intent(this@MainActivity, Mov_Rotatorio_Actibity::class.java)
        startActivity(inti)
    }

    fun MovReciFun(v: View){
        val inti = Intent(this@MainActivity, MovReciActivity::class.java)
        startActivity(inti)
    }
}