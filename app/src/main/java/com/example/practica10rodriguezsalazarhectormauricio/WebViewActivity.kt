package com.example.practica10rodriguezsalazarhectormauricio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.practica10rodriguezsalazarhectormauricio.R

class WebViewActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        //Asociar con componentes grafico
        webView = findViewById(R.id.wvNavegador)
        //Estalecer pagina de inicio
        webView.loadUrl("https://www.liverpool.com.mx/")

    }
}