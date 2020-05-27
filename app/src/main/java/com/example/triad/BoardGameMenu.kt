package com.example.triad;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_board_game_menu.*
import kotlinx.android.synthetic.main.activity_main.*

class BoardGameMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_game_menu)

        // added a button to test
        // and added a new comment
      button2.setOnClickListener{
          val intent = Intent(this,BoardGameList::class.java)
            startActivity(intent)
      }

    }
}
