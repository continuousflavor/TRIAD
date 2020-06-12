package com.example.triad

import models.GameList

class DataSource {

    companion object{

        fun createDataSet(): ArrayList<GameList>{
            val list = ArrayList<GameList>()
            list.add(
                GameList(
                    "Lords of Waterdeep",
                    "Board Game",
                    "IMAGE",
                    "5 Stars"

                )
            )
            list.add(
                GameList(
                    "Imperial Assault",
                    "Board Game",
                    "IMAGE",
                    "4.5 Stars"

                )
            )
            list.add(
                GameList(
                    "The Settlers of Catan",
                    "Board Game",
                    "IMAGE",
                    "4.5 Stars"

                )
            )
            return list
        }
    }
}
]