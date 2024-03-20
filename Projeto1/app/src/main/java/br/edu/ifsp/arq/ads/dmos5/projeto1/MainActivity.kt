package br.edu.ifsp.arq.ads.dmos5.projeto1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var edtText: EditText
    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtText = findViewById(R.id.edt_name)
        btnSend = findViewById(R.id.btn_send)

        btnSend.setOnClickListener(View.OnClickListener {
            val nome: String = edtText.text.toString()
            Toast.makeText(
                this@MainActivity, getString(R.string.message) + " "
                        + nome, Toast.LENGTH_SHORT
            ).show()
        })
    }
}