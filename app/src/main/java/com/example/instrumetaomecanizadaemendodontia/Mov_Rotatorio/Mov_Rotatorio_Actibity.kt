package com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.ColtenePackage.ColteneActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.DentsplySironaPackage.DentsplySirona_activity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.EasyPackage.EasyActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.FKGDentairePackage.FKGDentaireActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.MKLifePackage.MKLifeActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.MedinPackage.MedinActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.MicoMegaPackage.MicoMegaActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.SybronendoPackage.SybronendoActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.TDKPackage.TDKActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.UniversoOdontoPackage.UniversoOdontoActivity
import com.example.instrumetaomecanizadaemendodontia.Mov_Rotatorio.VDWPackage.VDWActivity
import com.example.instrumetaomecanizadaemendodontia.R

class Mov_Rotatorio_Actibity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mov__rotatorio__actibity)
    }

    fun dentsplyact(v: View){
        val inti = Intent(this, DentsplySirona_activity::class.java)
        startActivity(inti)
    }

    fun FKGDentaireFun(v: View){
        val inti = Intent(this, FKGDentaireActivity::class.java)
        startActivity(inti)
    }

    fun EasyFun(v: View){
        val inti = Intent(this, EasyActivity::class.java)
        startActivity(inti)
    }

    fun MicoMegaFun(v: View){
        val inti = Intent(this, MicoMegaActivity::class.java)
        startActivity(inti)
    }

    fun ColteneFun(v: View){
        val inti = Intent(this, ColteneActivity::class.java)
        startActivity(inti)
    }

    fun SybronendoFun(v: View){
        val inti = Intent(this, SybronendoActivity::class.java)
        startActivity(inti)
    }

    fun MKLifeFun(v: View){
        val inti = Intent(this, MKLifeActivity::class.java)
        startActivity(inti)
    }

    fun MedinFun(v: View){
        val inti = Intent(this, MedinActivity::class.java)
        startActivity(inti)
    }

    fun VDWFun(v: View){
        val inti = Intent(this, VDWActivity::class.java)
        startActivity(inti)
    }

    fun TDKFun(v: View){
        val inti = Intent(this, TDKActivity::class.java)
        startActivity(inti)
    }

    fun UniversoOdontoFun(v: View){
        val inti = Intent(this, UniversoOdontoActivity::class.java)
        startActivity(inti)
    }








}