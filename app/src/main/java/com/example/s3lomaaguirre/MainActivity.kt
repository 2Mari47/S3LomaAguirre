package com.example.s3lomaaguirre

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvIngreso = findViewById<TextView>(R.id.tvIngreso)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnGenerar = findViewById<Button>(R.id.btnGenerar)
        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)
        val tvMensaje = findViewById<TextView>(R.id.tvMensaje)
        val ivDecorativa = findViewById<ImageView>(R.id.ivDecorativa)

        btnGenerar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            if (nombre.isNotEmpty()) {
                tvTitulo.text = "Feliz Día Mamá $nombre ❤️"
                tvMensaje.text = """
                    Tus palabras son mi brújula,
                    tu cariño mi hogar,
                    y tu ejemplo mi inspiración.

                    No hay mejor maestra de vida que tú, mamá.
                    Por eso y mucho más...

                    ¡Feliz Día!
                """.trimIndent()
                ivDecorativa.visibility = View.VISIBLE

                // Oculta los elementos de ingreso
                tvIngreso.visibility = View.GONE
                etNombre.visibility = View.GONE
                btnGenerar.visibility = View.GONE

                // Muestra los resultados
                tvTitulo.visibility = View.VISIBLE
                tvMensaje.visibility = View.VISIBLE
            } else {
                tvTitulo.text = ""
                tvMensaje.text = "Por favor, escribe tu nombre primero 😊"
                ivDecorativa.visibility = View.GONE
            }
        }
    }
}
