package app.com.caroline.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to textview
        val txt_kotlin : TextView = findViewById(R.id.txt_kotlin) as TextView

        // get reference to button
        val btn_kotlin = findViewById(R.id.btn_kotlin)
        btn_kotlin.setOnClickListener {
            txt_kotlin.text = getString(R.string.kotlin_label)
            Toast.makeText(getApplicationContext(),"Kotlin in progress",Toast.LENGTH_SHORT).show()
        }

    }


}
