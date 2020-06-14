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
                    "https://media.dnd.wizards.com/styles/product_tabletop_left/public/images/product/DnD_LOW.png",
                    "5 Stars"

                )
            )
            list.add(
                GameList(
                    "Imperial Assault",
                    "Board Game",
                    "https://raw.githubusercontent.com/continuousflavor/TRIAD/blob/master/imperial_assault.png?raw=true",
                    "4.5 Stars"

                )
            )
            list.add(
                GameList(
                    "Runebound",
                    "Board Game",
                    "https://github.com/continuousflavor/TRIAD/blob/master/runebound.png?raw=true",
                    "4.5 Stars"

                )
            )
            return list
        }
    }
}
