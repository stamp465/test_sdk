package com.example.stamplib

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

object StampLib {
    fun toNewPage(context: Context) {
        val intent = Intent(context, StampActivity::class.java)
        context.startActivity(intent)
    }
}

class StampActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stamp)
    }
}
