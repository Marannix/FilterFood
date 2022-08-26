package com.marannix.filterfood

/**
 * @param name Name of the recipe
 * @param category Represent what type of food (I'd recommend this to be a string to allow multiple categories... example, Beef, Noodle, Spicy etc...
 * @param cuisine Represents the country, region  where the food comes from
 * @param time Time which is represented as a Int which indicates how long it will take for the food to be cooked
 */
data class ExploreRecipe(
    val name: String,
    val category: String,
    val cuisine: String,
    val time: Double
) {
    companion object {
        fun get(): List<ExploreRecipe> {
            return listOf(
                ExploreRecipe(
                    name = "Crispy Beef in Chili Sauce",
                    category = "Beef",
                    cuisine = "Chinese",
                    time = 3.5
                ), ExploreRecipe(
                    name = "Chicken Noodle",
                    category = "Noodle",
                    cuisine = "Chinese",
                    time = 1.2
                ), ExploreRecipe(
                    name = "Peppered Steak",
                    category = "Steak",
                    cuisine = "Jamaican",
                    time = 4.0
                ), ExploreRecipe(
                    name = "Chicken Curry Bento",
                    category = "Chicken",
                    cuisine = "Japanese",
                    time = 1.5
                ), ExploreRecipe(
                    name = "Beef with Mushroom",
                    category = "Beef",
                    cuisine = "Chinese",
                    time = 2.5
                ), ExploreRecipe(
                    name = "Teriyaki Salmon Salad",
                    category = "Salad",
                    cuisine = "Japanese",
                    time = 1.0
                ), ExploreRecipe(
                    name = "Chicken Burrito",
                    category = "Chicken",
                    cuisine = "Mexican",
                    time = 0.5
                ), ExploreRecipe(
                    name = "Asaro Yam Pottage",
                    category = "Yam",
                    cuisine = "Nigerian",
                    time = 5.0
                ), ExploreRecipe(
                    name = "Efo Egusi",
                    category = "Soup",
                    cuisine = "Nigerian",
                    time = 5.0
                ), ExploreRecipe(
                    name = "Chicken Tikka Potato",
                    category = "Chicken",
                    cuisine = "Sir Lankan",
                    time = 1.0
                ), ExploreRecipe(
                    name = "Beef Suya",
                    category = "Beef",
                    cuisine = "Nigerian",
                    time = 1.0
                ), ExploreRecipe(
                    name = "Chicken Kofta Wrap",
                    category = "Panini",
                    cuisine = "Sir Lankan",
                    time = 0.5
                )
            )
        }
    }
}
