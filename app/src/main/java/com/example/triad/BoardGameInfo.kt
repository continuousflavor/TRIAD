package com.example.triad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class BoardGameInfo  : AppCompatActivity() {

//    private lateinit var gameAdapter: GameItemRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // todo: have this load a view with no recycler, just a linearlayout or card view
        setContentView(R.layout.activity_board_game_info)

//        initRecyclerView()
        // find the ID of the item to view
        val intent = intent
        val uri = intent.data

        // TODO: fix this so that we don't crash if passed a bad (or no) URI
        val gameId = uri!!.path!!.toInt()

        addDataSet(gameId)

    }

    private fun addDataSet(gameId: Int){
        val game = DataSource.gameForId(gameId)

        // todo: set this data on the card to display
//        gameAdapter.submitList(data)
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