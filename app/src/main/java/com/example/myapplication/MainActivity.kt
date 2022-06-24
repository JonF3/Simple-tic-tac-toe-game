package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var kutia1: TextView
    lateinit var kutia2: TextView
    lateinit var kutia3: TextView
    lateinit var kutia4: TextView
    lateinit var kutia5: TextView
    lateinit var kutia6: TextView
    lateinit var kutia7: TextView
    lateinit var kutia8: TextView
    lateinit var kutia9: TextView
    lateinit var finish: TextView


    fun createViews() {
        kutia1 = findViewById(R.id.katrori1)
        kutia2 = findViewById(R.id.katrori2)
        kutia3 = findViewById(R.id.katrori3)
        kutia4 = findViewById(R.id.katrori4)
        kutia5 = findViewById(R.id.katrori5)
        kutia6 = findViewById(R.id.katrori6)
        kutia7 = findViewById(R.id.katrori7)
        kutia8 = findViewById(R.id.katrori8)
        kutia9 = findViewById(R.id.katrori9)
        finish = findViewById(R.id.finish)
    }
    var player = "X"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createViews()
        nextRound()
    }

    fun kuti (kutia: TextView) {
        kutia.setOnClickListener {
            kutia.text= player
            if(player == "O"){
                player = "X"
               kutia.setTextColor(Color.BLUE)

            }
            else{
                player="O"
                kutia.setTextColor(Color.BLACK)
            }
            kutia.setOnClickListener(null)
            finishGame()
        }
    }

    fun nextRound(){
        kuti(kutia1)
        kuti(kutia2)
        kuti(kutia3)
        kuti(kutia4)
        kuti(kutia5)
        kuti(kutia6)
        kuti(kutia7)
        kuti(kutia8)
        kuti(kutia9)
    }
    fun finishGame() {
        if (kutia1.text == kutia2.text && kutia3.text == kutia1.text
            && kutia1.text != "") {

            finish.visibility = View.VISIBLE
            finish.text = "Game Won"

        } else if (kutia4.text == kutia5.text && kutia6.text == kutia4.text
            && kutia4.text != "")
        {
            finish.visibility = View.VISIBLE
            finish.text = "Game Won"

        } else if (kutia7.text == kutia8.text && kutia7.text == kutia9.text
            && kutia7.text != "")
        {
            finish.visibility = View.VISIBLE
            finish.text = "Game Won"

        } else if (kutia1.text == kutia4.text && kutia1.text == kutia7.text
            && kutia1.text != "") {
            finish.visibility = View.VISIBLE
            finish.text = "Game Won"

        } else if (kutia2.text == kutia5.text && kutia2.text == kutia8.text
            && kutia2.text != "") {
            finish.visibility = View.VISIBLE
            finish.text = "Game Won"

        } else if (kutia3.text == kutia6.text && kutia3.text == kutia9.text
            && kutia3.text != "") {
            finish.visibility = View.VISIBLE
            finish.text = "Game Won"

        } else if (kutia1.text == kutia5.text && kutia1.text == kutia9.text
            && kutia1.text != "") {
            finish.visibility = View.VISIBLE
            finish.text = "Game Won"

        } else if (kutia3.text == kutia5.text && kutia3.text == kutia7.text
            && kutia3.text != "") {
            finish.visibility = View.VISIBLE
            finish.text = "Game Won"
        }

        if (kutia1.text !="" && kutia2.text !="" &&kutia3.text !="" && kutia4.text !="" &&kutia5.text !="" && kutia6.text !="" &&kutia7.text !="" && kutia8.text !="" &&kutia9.text !=""){

            if (finish.visibility == View.GONE){
                finish.visibility = View.VISIBLE
                finish.text = "Drav"
            }

        }


        finish.setOnClickListener{
            kutia1.text=""
            kutia2.text=""
            kutia3.text=""
            kutia4.text=""
            kutia5.text=""
            kutia6.text=""
            kutia7.text=""
            kutia8.text=""
            kutia9.text=""
            finish.visibility = View.GONE
            nextRound()

        }

    }

}



