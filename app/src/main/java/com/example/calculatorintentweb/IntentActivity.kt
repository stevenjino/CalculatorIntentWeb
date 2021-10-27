package com.example.calculatorintentweb

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.email
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.sendSMS
import org.jetbrains.anko.share

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        btn_dial.setOnClickListener {
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254790124925"))
        if (ContextCompat.checkSelfPermission(
                this@IntentActivity,
                android.Manifest.permission.CALL_PHONE
        ) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(
                this@IntentActivity,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                1
            )
        }}
        btn_call.setOnClickListener {
            val phone = "+254790124925"
            val intent = Intent(Intent.ACTION_CALL, Uri.fromParts("tel", phone, null))
            startActivity(intent)
        }

        btn_sms.setOnClickListener {
            sendSMS("+254 790 124925", "Hi Developers' Union, I have an inquiry.")
        }
        btn_email.setOnClickListener {
            email("njino.steve7@gmail.com", "Developer Application", "Dear Developers Union, I wish to apply")
        }
        btn_share.setOnClickListener {
            share("Steve", "Info")
        }
        btn_stk.setOnClickListener {
            val simToolKitLaunchIntent = this@IntentActivity.packageManager.getLaunchIntentForPackage("com.android.stk")
            if (simToolKitLaunchIntent !=null){
                startActivity(simToolKitLaunchIntent)
            }
        }
        btn_camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)
        }
    }
}