package com.example.ezquiz03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_eight.*

class eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)
        n1.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
        n2.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
        n3.setOnClickListener {
            val intent = Intent(this@eight, nine::class.java)
            intent.putExtra("name", "SuperCom")
            intent.putExtra("name2", "5")
            startActivity(intent)
        }
        n4.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}