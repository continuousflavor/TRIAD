package com.example.triad

import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_board_game_list.*

class BoardGameList : AppCompatActivity() {

    private lateinit var gameAdapter: GameListRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_game_list)

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
            val topSpacingItemDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingItemDecoration)
            gameAdapter = GameListRecyclerAdapter()
            adapter = gameAdapter

        }
    }



}
