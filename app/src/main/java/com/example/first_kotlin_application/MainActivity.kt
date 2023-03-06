package com.example.first_kotlin_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    // gradle => يجمع مكونات التطبيق و يحولها ل APK
    // every activity has kotlin file and a xml file for design
    // the build starts from the android mainfist.xml
    // R = res
    // wrap_content => fit content CSS
    // match_parent => width of the screen 100% (width of the parent)
    // relative layout => العناصر تكون مرتبطه ببعض
    // frame layput => like stack

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val newText = resources.getString(R.string.updated_main_btn)
//        val mainBtn = findViewById<Button>(R.id.main_btn) as Button
//        mainBtn.setText(newText)
        val btn:Button = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            val toast: Toast = Toast.makeText(this,"SUCCESS",Toast.LENGTH_SHORT);
            toast.show()
        }
    }
    fun onClickHandler(view: View){
        // u can share the same function and specify the implemintation by the IDs
        if(view.id.toString().equals("sda")){}
        val toast: Toast = Toast.makeText(this,"FROM IMAGE",Toast.LENGTH_SHORT);
        toast.show()
    }
}