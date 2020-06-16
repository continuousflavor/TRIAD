package com.example.triad

import models.GameList

class DataSource {

    companion object{

        fun createDataSet(): ArrayList<GameList>{
            val list = ArrayList<GameList>()
            list.add(
                GameList(
                    "Lords of Waterdeep",
                    "worker placement",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/lords_of_waterdeep.png",
                    "5 stars"

                )
            )
            list.add(
                GameList(
                    "Imperial Assault",
                    "dungeon crawler",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/imperial_assault.png",
                    "4.5 stars"

                )
            )
            list.add(
                GameList(
                    "Runebound",
                    "RPG",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/runebound.png",
                    "4.5 stars"

                )
            )
            list.add(
                GameList(
                    "Mage Knight",
                    "RPG",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/mage_knight.png",
                    "4.5 stars"

                )
            )
            return list
        }
    }
}
