package com.example.triad

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_board_game_info.*
import kotlinx.android.synthetic.main.layout_game_info_item.*


class BoardGameInfo  : AppCompatActivity() {

    private lateinit var cardView: CardView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // todo: have this load a view with no recycler, just a linearlayout or card view
        setContentView(R.layout.activity_board_game_info)

        cardView = findViewById(R.id.game_info_card_view)!!// todo: you might want to handle this better if the card isn't found



        // find the ID of the item to view
//        val intent = intent
//        val uri = intent.data

        // TODO: fix this so that we don't crash if passed a bad (or no) URI
//        val gameId = uri!!.path!!.toInt()


//        addDataSet(gameId)

    }

    private fun addDataSet(gameId: Int){
        val game = DataSource.gameForId(gameId)!! // todo: handle case where the game is not found
        //todo: set info on card view
    }



}