package com.example.cpsc411a_recipebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cpsc411a_recipebook.ui.theme.CPSC411A_RecipeBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CPSC411A_RecipeBookTheme {
                val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {
                        composable("home") { MainScreen(navController) }
                        composable("recipes") { RecipeScreen(navController) }
                        composable("details") { RecipeDetScreen(navController)}
                        composable("favorites") { FavScreen(navController) }
            }
        }
    }
}
    data class Recipe(
        val name: String,
        val ingredients: List<String>,
        val steps: List<String>
    )

class FavVM : ViewModel() {
    //  Hardcoded some recipes in
    val recipes = listOf(
        Recipe("Spaghetti", listOf("Noodles", "Tomato Sauce", "Meatballs"), listOf("Boil noodles", "Heat sauce", "Mix and serve")),
        Recipe("Pancakes", listOf("Flour", "Eggs", "Milk", "Butter"), listOf("Mix ingredients", "Pour batter", "Flip and serve")),
        Recipe("Salad", listOf("Lettuce", "Tomatoes", "Cucumbers", "Dressing"), listOf("Chop veggies", "Toss with dressing"))
    )
    var favRecipes = mutableStateOf(listOf<Recipe>())
        private set

    fun addFavR(recipe: String) {
        if (!favRecipes.value.contains(recipe)) {
            favRecipes.value += recipe
        }
    }

    fun delFavR(recipe: String) {
        favRecipes.value -= recipe
    }
}

@Composable
fun MainScreen(navController: NavController){
    Column{
        Text("Welcome to the 411 Recipe book")

        Button(onClick = { navController.navigate("recipes")}){
            Text("Recipes")
        }
        Button(onClick = { navController.navigate("favorites")}){
            Text("Favorite Recipes")
        }
    }
}
    @Composable
fun RecipeScreen(navController: NavController){}
@Composable
fun RecipeDetScreen(navController: NavController){}

@Composable
fun FavScreen(navController: NavController){}