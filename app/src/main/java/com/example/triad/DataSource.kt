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
                    "https://github.com/continuousflavor/TRIAD/blob/master/lords_of_waterdeep.png",
                    "5 Stars"

                )
            )
            list.add(
                GameList(
                    "Imperial Assault",
                    "Board Game",
                    "https://github.com/continuousflavor/TRIAD/blob/master/imperial_assault.png",
                    "4.5 Stars"

                )
            )
            list.add(
                GameList(
                    "Runebound",
                    "Board Game",
                    "https://github.com/continuousflavor/TRIAD/blob/master/runebound.png",
                    "4.5 Stars"

                )
            )
            return list
        }
    }
}
