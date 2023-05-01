package com.micoder.mitoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Short Toast
        Mitoast.st(this, "sample")
        // Long Toast
        Mitoast.lt(this, "sample")

    }
}