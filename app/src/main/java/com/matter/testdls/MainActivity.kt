package com.matter.testdls

import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.matter.testlibrary.CustomButton

class MainActivity : AppCompatActivity() {

    private lateinit var btn : CustomButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setText("My Button")
        btn.setBtnBackground(R.color.red)
        btn.setTextSize(32f)

    }
}