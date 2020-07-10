package com.example.triad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_board_game_info.view.*


class BoardGameInfo  : AppCompatActivity() {

    private lateinit var cardView: CardView

//    private lateinit var gameAdapter: GameItemRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // todo: have this load a view with no recycler, just a linearlayout or card view
        setContentView(R.layout.activity_board_game_info)

        cardView = findViewById(R.id.card_view)!!// todo: you might want to handle this better if the card isn't found


//        initRecyclerView()
        // find the ID of the item to view
        val intent = intent
        val uri = intent.data

        // TODO: fix this so that we don't crash if passed a bad (or no) URI
        val gameId = uri!!.path!!.toInt()

        addDataSet(gameId)

    }

    private fun addDataSet(gameId: Int){
        val game = DataSource.gameForId(gameId)!! // todo: handle case where the game is not found
        //todo: set info on card view
    }


//    private fun initRecyclerView(){
//        game_item_recycler_view.apply {
//            layoutManager = LinearLayoutManager(this@BoardGameInfo)
//            val topSpacingItemDecoration = TopSpacingItemDecoration(20)
//            addItemDecoration(topSpacingItemDecoration)
//            gameAdapter = GameItemRecyclerAdapter()
//            adapter = gameAdapter
//
//        }
//    }
}