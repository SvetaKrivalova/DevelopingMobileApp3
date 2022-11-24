package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_start = (findViewById<Button>(R.id.button_start))
        var list = arrayListOf<TextView>()
        list.add(0, findViewById(R.id.textView1))
        list.add(1, findViewById(R.id.textView2))
        list.add(2, findViewById(R.id.textView3))
        list.add(3, findViewById(R.id.textView4))
        list.add(4, findViewById(R.id.textView5))
        list.add(5, findViewById(R.id.textView6))
        list.add(6, findViewById(R.id.textView7))
        list.add(7, findViewById(R.id.textView8))
        list.add(8, findViewById(R.id.textView9))
        val following = 3
        var clickCount = 0
        var text = clickCount + 2

        button_start.setOnClickListener {
            if (clickCount != 2) {
                list[clickCount].setText(" ")
                list[clickCount + following].setText(" ")
                list[clickCount +following * 2 ].setText(" ")

                list[clickCount + 1].setText(text.toString())
                list[clickCount + following + 1].setText(text.toString())
                list[clickCount +following * 2 + 1].setText(text.toString())

                ++clickCount
                ++text
            } else{
                list[clickCount].setText(" ")
                list[clickCount + following].setText(" ")
                list[clickCount +following * 2 ].setText(" ")

                clickCount = 0
                text = 1

                list[clickCount].setText(text.toString())
                list[clickCount + following ].setText(text.toString())
                list[clickCount +following * 2 ].setText(text.toString())

                ++text
            }
        }
    }
}