package com.example.myhistoryapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val search = findViewById<Button>(R.id.button2)
        val textView2 = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editTextNumber1)
        search?.setOnClickListener {

            val inputText = editText.text.toString()
            if (inputText.isNotEmpty() && inputText.all { it.isDigit() }) {
                var inputNumber = inputText.toInt()



                if (inputNumber >= 20 && inputNumber < 100) {

                    if (inputNumber == 95) {
                        textView2.text = "Nelson Mandela passed away when he reached this age"
                    }

                    if (inputNumber == 74) {
                        textView2.text = "British writer Roald Dahl passed away at age 74"
                    }

                    if (inputNumber == 62) {
                        textView2.text = "Martin Luther German monk passed away at age 62"
                    }

                    if (inputNumber == 56) {
                        textView2.text = "Abraham Lincoln Us president  passed away at age 56"
                    }

                    if (inputNumber == 41) {
                        textView2.text = "Harry Clarke Illustrator "
                    }

                    if (inputNumber == 30) {
                        textView2.text = "Amy Winehouse Singer-songwriter"
                    }

                    if (inputNumber == 29) {
                        textView2.text = "Hiram Hank Williams died"
                    }

                    if (inputNumber == 23) {
                        textView2.text =
                            "Alexander IV of Macedon the son of Alexander the Great and Roxana "
                    } else if (inputNumber == 28) {
                        textView2.text = "Shakespeare released his first play (Henry VI, Part 1)"
                    } else if (inputNumber == 21) {
                        textView2.text = "Alexander the Great passed away at age 21"
                    } else if (inputNumber == 77) {
                        textView2.text = "Louis Vuitton Fashion Designer passed away 77"
                    } else if (inputNumber == 45) {
                        textView2.text = "Henry Hudson Explore passed away 45"
                    } else if (inputNumber == 58) {
                        textView2.text = "Marcus Aurelius World Leader passed away at 58"
                    } else if (inputNumber == 66) {
                        textView2.text = "Andrew Johnson US President passed away at 66 "
                    } else if (inputNumber == 76) {
                        textView2.text = "Albert Einstein Physicist passed away at 76 "
                    }


                } else {
                    textView2.text = "Your submission was invalid "
                }

            }

        }

    }
}












































    //Jordan Kafundawetou
//ST10462244