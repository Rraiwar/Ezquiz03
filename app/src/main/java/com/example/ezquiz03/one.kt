package com.example.ezquiz03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_one.*

class one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        o1.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
        o2.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
        o3.setOnClickListener {
            val intent = Intent(this@one, two::class.java)
            intent.putExtra("name", "SuperCom")
            intent.putExtra("name2", "5")
            startActivity(intent)
        }
        o4.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}