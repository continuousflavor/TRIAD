package com.example.triad

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_board_game_menu.*
import kotlinx.android.synthetic.main.layout_game_list_item.view.*
import models.GameList

class GameListRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<GameList> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return GamesListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_game_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){

            is GamesListViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(gameList: List<GameList>){
        items = gameList
    }

    class GamesListViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val gameImage :ImageView = itemView.game_image
        private val gameTitle :TextView = itemView.game_title
        private val gameType :TextView = itemView.game_type
        private val gameRating :TextView = itemView.game_rating
        private var gameId :Int = 0

        fun bind(gameList: GameList){

            gameTitle.text = gameList.title
            gameType.text = gameList.genre
            gameRating.text = gameList.rating
            gameId = gameList.id

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(gameList.image)
                .into(gameImage)


            }

        init {
            gameImage.setOnClickListener {
                val intent = Intent(gameImage.context, BoardGameInfo::class.java)

                intent.data = Uri.parse("triad:/$gameId")

                gameImage.context.startActivity(intent)
            }

        }

    }





}