package com.example.swapactiviywindow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btn: Button = findViewById(R.id.button)
        val btn1: Button = findViewById(R.id.button2)
        val btn2: Button = findViewById(R.id.button3)
        val name: EditText = findViewById(R.id.editTextText2)
        val name1: EditText = findViewById(R.id.editTextText2)

        btn.setOnClickListener{
            val intent = Intent(this@MainActivity, AboutActivity::class.java)

            startActivity(intent)
        }

        btn1.setOnClickListener{
            val intent1 = Intent(this@MainActivity, SecondActivity::class.java)
            intent1.putExtra("username", name.text.toString())
            intent1.putExtra("gift", name1.text.toString())
            startActivity(intent1)
        }
        btn2.setOnClickListener{
            val intent2 = Intent(this@MainActivity, ThreeActivity::class.java)

            startActivity(intent2)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}