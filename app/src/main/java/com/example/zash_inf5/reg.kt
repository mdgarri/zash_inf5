package com.example.zash_inf5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_reg.*

class regis : AppCompatActivity() {
    //some comment
    var count = 9

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        button.setOnClickListener {
            editText1.text.clear()
            count++
            if (count==5){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
