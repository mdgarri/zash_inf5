package com.example.zash_inf5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_log.*

class log : AppCompatActivity() {

    companion object {
        @Volatile
        var count1 = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)
        button.setOnClickListener {
            editText1.text.clear()
            Log.d("BOOMBOOM", editText1.text.toString())
            count1++
            textView3.text = "ПОЛЕ ОШИБКИ"
            if (count1 == 3 ) {
                val intent = Intent(this, successful::class.java)
                startActivity(intent)
            }
            if (count1 == 5 ) {
                textView3.text = "Скорость печатания текста не удовлетворила данным пользователя"
                return@setOnClickListener
            }

            if (count1==1)
            {
                textView3.text = "Неверный текст! Попробуйте заного"
                editText1.text.clear()
                return@setOnClickListener
            }
        }
    }
}
