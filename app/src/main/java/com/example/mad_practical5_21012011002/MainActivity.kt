package com.example.mad_practical5_21012011002

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Browse : Button=findViewById(R.id.Button1)
        Browse.setOnClickListener {
            val editBrowser : EditText=findViewById(R.id.editTextBrowse)

            Browser(editBrowser.text.toString())
        }
        val btnCall:Button = findViewById(R.id.btnCall)
        val editCall:EditText=findViewById(R.id.editTextPhone)
        btnCall.setOnClickListener(){
            call(editCall.text.toString())
        }
        val btnCallLog:Button=findViewById(R.id.btnCallLog)
        btnCallLog.setOnClickListener(){
            call(editCall.text.toString())
        }
        val gallery:Button=findViewById(R.id.btnGallery)
        gallery.setOnClickListener(){
            Gallery()
        }
        val Camera:Button=findViewById(R.id.btnCamera)
        Camera.setOnClickListener(){
            Camera()
        }
        val Alarm:Button=findViewById(R.id.btnalarm)
        Alarm.setOnClickListener(){
            Alarm()
        }


    }

    private fun call(toString: String) {

    }

    fun Browser(url : String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }

    fun Call(number: Number){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also { startActivity(it) }

    }
    fun call_log(){
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also { startActivity(it) }
    }
    fun Gallery(){
        Intent(Intent.ACTION_VIEW).setType("image/*").also { startActivity(it) }
    }
    fun Camera(){
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { startActivity(it) }
    }
    fun Alarm(){
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also { startActivity(it) }
    }

}