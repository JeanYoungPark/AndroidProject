package com.jean.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //화면을 보여주는 코드
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //버튼을 클릭 액션
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener{

            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)

            //하단에 뜨는 메세지
            //Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

        }
    }
}