package com.example.mad_practical5_21012011002

import android.content.Intent
import android.graphics.Camera
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.Browser
import android.widget.Button
import android.widget.EditText
import android.widget.Gallery

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Browse : Button=findViewById(R.id.Button1)
        Browse.setOnClickListener {
            val editBrowser : EditText=findViewById(R.id.editTextBrowse)

            Browser(editBrowser.text.toString())
        }
        val call : Button


    }
    fun Browser(url : String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }

    fun Call(number: Number){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also { startActivity(it) }

    }
    fun call_log(){

    }
    fun Gallery(){

    }
    fun Camera(){

    }
    fun Alarm(){

    }

}