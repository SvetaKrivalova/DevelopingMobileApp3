package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_click = (findViewById<Button>(R.id.button_click))
        var progressBar = (findViewById<ProgressBar>(R.id.progressBar))
        var editText = (findViewById<EditText>(R.id.editText))
        var textView = (findViewById<TextView>(R.id.textView))
        var checkBox = (findViewById<CheckBox>(R.id.checkBox))
        button_click.setOnClickListener{
            if (checkBox.isChecked) {
                textView.setText(editText.getText())
                progressBar.incrementProgressBy(10)
            }
        }
    }
}