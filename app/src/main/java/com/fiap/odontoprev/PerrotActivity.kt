package com.fiap.odontoprev

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PerrotActivity : AppCompatActivity() {
    private lateinit var editText: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perrot_activity)

        val sendButton: ImageButton = findViewById(R.id.send_button)
        editText = findViewById(R.id.edit_text)

        sendButton.setOnClickListener {
            val message = editText.text.toString()
            sendMessage(message)
        }

        val profileView: View = findViewById(R.id.perfil)

        profileView.setOnClickListener {

            val intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
            finish()
        }

        val menuView: View = findViewById(R.id.menu)

        menuView.setOnClickListener {

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun sendMessage(message: String) {
        if (message.isNotEmpty()) {
            Toast.makeText(this, "Mensagem enviada: $message", Toast.LENGTH_SHORT).show()
            editText.text.clear()
        } else {
            Toast.makeText(this, "Digite uma mensagem para enviar.", Toast.LENGTH_SHORT).show()
        }
    }


}
