package com.example.mad_practical5_21012011002

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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBrowse:Button = findViewById(R.id.button_browse)
        val editUrl:EditText = findViewById(R.id.editTextText_url)

        val buttonPhone:Button = findViewById(R.id.button2_phone)
        val editPhone:EditText = findViewById(R.id.editTextText7_phNo)

        val buttonCallLog:Button = findViewById(R.id.button_callLog)

        val buttonGallery:Button = findViewById(R.id.button4_gallery)

        val buttonCamera:Button = findViewById(R.id.button5_camera)

        val buttonAlarm:Button = findViewById(R.id.button6_alarm)

        buttonBrowse.setOnClickListener {
            openBrowser(editUrl.text.toString())
        }

        buttonPhone.setOnClickListener {
            makeCall(editPhone.text.toString())
        }

        buttonCallLog.setOnClickListener {
            callLog()
        }

        buttonGallery.setOnClickListener {
            gallery()
        }

        buttonCamera.setOnClickListener {
            camera()
        }

        buttonAlarm.setOnClickListener {
            alarm()
        }

    }

    fun openBrowser(link : String){

        Intent(Intent.ACTION_VIEW , Uri.parse(link)).also { startActivity(it) }
    }

    fun makeCall(phNo : String){

        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$phNo")).also { startActivity(it) }
    }

    fun callLog(){

        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also { startActivity(it) }
    }

    fun gallery(){

        Intent(Intent.ACTION_VIEW).setType("image/*").also { startActivity((it)) }
    }

    fun camera(){

        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { startActivity(it) }
    }

    fun alarm(){

        Intent(AlarmClock.ACTION_SHOW_ALARMS).also { startActivity(it) }
    }
}