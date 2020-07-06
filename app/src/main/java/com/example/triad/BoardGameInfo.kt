package com.example.triad

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.request.Request
import com.example.triad.GameListRecyclerAdapter.GamesListViewHolder.Companion.GAME_TITLE_KEY
import kotlinx.android.synthetic.main.activity_board_game_info.*

class BoardGameInfo  : AppCompatActivity() {

    private lateinit var gameAdapter: GameItemRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_game_info)

        fetchJSON()

    }

    private fun fetchJSON() {
        val gameTitle = intent.getIntExtra(GameListRecyclerAdapter.GamesListViewHolder.GAME_TITLE_KEY)


    }



    private fun initRecyclerView(){
        game_item_recycler_view.apply {
            layoutManager = LinearLayoutManager(this@BoardGameInfo)
            val topSpacingItemDecoration = TopSpacingItemDecoration(20)
            addItemDecoration(topSpacingItemDecoration)
            gameAdapter = GameItemRecyclerAdapter()
            adapter = gameAdapter

        }
    }
}

private fun Intent.getIntExtra(gameTitleKey: String) {

}






