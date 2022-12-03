package com.example.pizzaku

object PizzaData {
    private val pizzaNames = arrayOf(
        "Avocadobiltong Pizza",
        "Bagel Pizza",
        "Beeftongue Pizza",
        "Blackcaviar Pizza",
        "Breakfast Pizza",
        "Bresaola Pizza",
        "Californian Pizza",
        "Calzone Pizza",
        "Chicago Pizza",
        "Chickenmasala Pizza",
        "Chorizo Pizza",
        "Crocodile Pizza",
        "Dessert Pizza",
        "Detroit Pizza",
        "Frenchbread Pizza",
        "Frenchlambe Pizza",
        "Harissapi Pizza"
    )

    private val pizzaDetails = arrayOf(
        "Rp 50.000",
        "Rp 40.000",
        "Rp 55.000",
        "Rp 43.000",
        "Rp 30.000",
        "Rp 35.000",
        "Rp 50.000",
        "Rp 57.000",
        "Rp 41.000",
        "Rp 58.000",
        "Rp 56.000",
        "Rp 51.000",
        "Rp 44.000",
        "Rp 59.000",
        "Rp 34.000",
        "Rp 55.000",
        "Rp 57.000"
    )

    private val pizzaImages = arrayOf(
        R.drawable.avocadobiltongpizza,
        R.drawable.bagelpizza,
        R.drawable.beeftonguepizza,
        R.drawable.blackcaviarpizzainrussia,
        R.drawable.breakfastpizza,
        R.drawable.bresaolapizza,
        R.drawable.californianpizza,
        R.drawable.calzone,
        R.drawable.chicagodeepdishpizza,
        R.drawable.chickentikkamasalapizza,
        R.drawable.chorizopizza,
        R.drawable.crocodilepizza,
        R.drawable.dessertpizza,
        R.drawable.detroitpizza,
        R.drawable.frenchbreadpizza,
        R.drawable.frenchtarteflambee,
        R.drawable.harissapizza
    )

    val listData: ArrayList<Pizza>
        get() {
            val list = arrayListOf<Pizza>()
            for (position in pizzaNames.indices) {
                val pizza = Pizza()
                pizza.name = pizzaNames[position]
                pizza.detail = pizzaDetails[position]
                pizza.photo = pizzaImages[position]
                list.add(pizza)
            }
            return list
        }
}