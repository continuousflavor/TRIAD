package com.example.triad

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

@SuppressLint("Registered")
class BoardGameInfo  : AppCompatActivity() {

    private lateinit var gameAdapter: GameItemRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_game_info)

        initRecyclerView()
        addDataSet()

    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        gameAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@BoardGameList)
            val topSpacingItemDecoration = TopSpacingItemDecoration(20)
            addItemDecoration(topSpacingItemDecoration)
            gameAdapter = GameListRecyclerAdapter()
            adapter = gameAdapter

        }
    }
}