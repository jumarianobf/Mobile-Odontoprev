package com.fiap.odontoprev

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_activity)


        val perrotView: View = findViewById(R.id.perrot)

        perrotView.setOnClickListener {

            val intent = Intent(this, PerrotActivity::class.java)
            startActivity(intent)
            finish()
        }

        val profileView: View = findViewById(R.id.perfil)

        profileView.setOnClickListener {

            val intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
