package com.fiap.odontoprev

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_activity)

        val perrotView: View = findViewById(R.id.perrot)

        perrotView.setOnClickListener {

            val intent = Intent(this, PerrotActivity::class.java)
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
}
