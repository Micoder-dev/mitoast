package com.micoder.mitoast

import android.content.Context
import android.widget.Toast

class Mitoast {
    companion object {
        fun st(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        fun lt(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}