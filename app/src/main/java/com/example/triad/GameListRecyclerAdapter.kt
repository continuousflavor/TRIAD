package com.example.triad

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
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
                holder.bind(items.get(position))
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

        val gameImage :ImageView = itemView.game_image
        val gameTitle :TextView = itemView.game_title
        val gameType :TextView = itemView.game_type

        fun bind(gameList: GameList){

            gameTitle.setText(gameList.title)
            gameType.setText(gameList.genre)

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(gameList.image)
                .into(gameImage)
        }

    }


}