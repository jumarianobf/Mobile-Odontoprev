package com.fiap.odontoprev

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.cadastro_activity)

        val cadastroButton: Button = findViewById(R.id.textView6)

        cadastroButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val voltarLogin: Button = findViewById(R.id.cadastro)

        voltarLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val emailInput = findViewById<EditText>(R.id.email_input).text.toString()
        val passwordInput = findViewById<EditText>(R.id.password_input).text.toString()

        if (validateLogin(emailInput, passwordInput)) {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            showError("Credenciais inválidas")
        }

    }
    private fun validateLogin(email: String, password: String): Boolean {
        // Substitua pela lógica real de validação
        return email == "u" && password == "1"
    }

    private fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}