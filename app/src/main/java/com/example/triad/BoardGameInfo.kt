package com.example.triad

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_board_game_info.*
import kotlinx.android.synthetic.main.layout_game_info_item.*

class IntentParser {
    fun gameIdFromIntent(intent: Intent): Int? {
        // TODO: fix this so that we don't crash if passed a bad (or no) URI
        return intent.data!!.lastPathSegment!!.toInt()
    }
}

class BoardGameInfo  : AppCompatActivity() {

    private lateinit var cardView: CardView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_board_game_info)

        cardView = findViewById(R.id.game_info_card_view)!!// todo: you might want to handle this better if the card isn't found

        val gameId = IntentParser().gameIdFromIntent(intent)
        if (gameId != null) {
            println("Loading info for game $gameId")
            addDataSet(gameId)
        }
        else {
            // todo: add some real error handling and show something useful to the user
            println("Couldn't get a gameID from $intent")
        }

    }


    private fun addDataSet(gameId: Int){
        val game = DataSource.gameForId(gameId)!! // todo: handle case where the game is not found
        println("Loaded info for game $game")
        // todo: set info on card view
    }

}