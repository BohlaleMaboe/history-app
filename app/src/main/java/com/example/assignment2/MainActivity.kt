package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.graphics.component1







class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val EnterAgeEditText= findViewById<EditText>(R.id.editTextText)
        val GenerateHistory= findViewById<Button>(R.id.button)
        val Clear = findViewById<Button>(R.id.Button2)


        val textView= findViewById<TextView>(R.id.textView)
        Clear.setOnClickListener{
            EnterAgeEditText.text.clear()
            textView.text=""
        }




        when  (R.id.editTextText){

        }
        GenerateHistory.setOnClickListener {
            val age = EnterAgeEditText.text.toString().toIntOrNull()

            if ((age!! < 20) || (age > 101)) {
                textView.text = "enter age in the range between 20 and 100"
            }

            when (age) {
                20 -> textView.text =
                    (" You are the same age famous artist Pop Smoke who passed away 19 February 2020")

                60 -> textView.text =
                    ("You are the same age as Adrain Schiller who passed away 04 April 2024")

                45 -> textView.text =
                    ("You are the same age as pop singer usher born 14 October 1978")

                40 -> textView.text =
                    ("You are the same age as famous actor paul walker who passed away 30 November 2013")

                100 -> textView.text =
                    ("You are the same age as Claire Du Brey born 1892 and passed away 1993")

                80 -> textView.text =
                    ("You are the same age as David Soul who passed away 4 January 2024")

                56 -> textView.text =
                    ("You are the same age as famous actor John Ritter who passed away 11 September 2003")

                22 -> textView.text =
                    ("You are the same age as TikTok star Leah Smith who passed away 11 March 2024 ")

                58 -> textView.text =
                    ("You are the same age John Spencer who was born 1946 and passed away 2005")

                30 -> textView.text =
                    ("You are the same age as artist Bob Marley who passed away 1981")

                else -> textView.text = ("Please enter age within the age of 20 and 100")
            }
        }


        }
                }


