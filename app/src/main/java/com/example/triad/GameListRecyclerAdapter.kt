package com.example.triad

import android.content.Intent
import android.system.Os.bind
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_board_game_menu.*
import kotlinx.android.synthetic.main.layout_game_list_item.view.*
import models.GameList

class GameListRecyclerAdapter(private var items:MutableList<GameList>, val itemClickListener: AdapterView.OnItemClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

       override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {
        return GamesListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_game_list_item, parent, false)

        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val items = items.get(position)
        holder.bind(items.get(position),itemClickListener)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(gameList: List<GameList>){
        items = gameList as MutableList<GameList>
    }

    class GamesListViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val gameImage :ImageView = itemView.game_image
        private val gameTitle :TextView = itemView.game_title
        private val gameType :TextView = itemView.game_type
        private val gameRating :TextView = itemView.game_rating


        fun bind(gameList: GameList){

            gameTitle.text = gameList.title
            gameType.text = gameList.genre
            gameRating.text = gameList.rating

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

                gameImage.context.startActivity(intent)
            }

        }

    }





}