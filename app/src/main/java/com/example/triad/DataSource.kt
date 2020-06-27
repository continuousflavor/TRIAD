package com.example.triad

import models.GameList

class DataSource {

    companion object{

        fun createDataSet(): ArrayList<GameList>{
            val list = ArrayList<GameList>()
            list.add(
                GameList(
                    "Lords of Waterdeep",
                    "Fantasy worker placement",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/lords_of_waterdeep.png",
                    "5/5 stars (378)",
                    "Dungeons and Dragons"

                )
            )
            list.add(
                GameList(
                    "Imperial Assault",
                    "Sci-fi dungeon crawler",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/imperial_assault.png",
                    "4.5/5 stars (98)",
                    "Star Wars"

                )
            )
            list.add(
                GameList(
                    "Runebound",
                    "Fantasy action RPG",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/runebound.png",
                    "4.5/5 stars (184)",
                    "Runebound Universe"

                )
            )
            list.add(
                GameList(
                    "Mage Knight",
                    "Fantasy action RPG",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/mage_knight.png",
                    "4.5/5 stars (32)",
                    "Created by Vlaada Chvatil"

                )
            )
            list.add(
                GameList(
                    "Dominion",
                    "Deck builder",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/dominion.png",
                    "4/5 stars (261)",
                    "Game Info"


                )
            )
            list.add(
                GameList(
                    "7 Wonders",
                    "Deck builder",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/master/seven_wonders.png",
                    "5/5 stars (1003)",
                    "Game Info"

                )
            )
            return list
        }
    }
}
