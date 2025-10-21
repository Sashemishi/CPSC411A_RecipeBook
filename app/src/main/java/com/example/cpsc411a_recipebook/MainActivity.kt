package com.example.cpsc411a_recipebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
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
                        composable("home") { mainScreen(navController) }
                        composable("recipies") { recipeScreen(navController) }
                        composable("details") { recipeDetScreen(navController)}
                        composable("favorites") { favScreen(navController) }
            }
        }
    }
}

class FavVM : ViewModel() {
    val favRecipies = mutableStateOf(listOf<String>())

    fun addFavR(recipe: String) {
        favRecipes.value = favRecipes.value + recipe
    }

    fun delFavR(recipe: String) {
        favRecipes.value = favRecipes.value - recipe
    }
}

@Composable
fun mainScreen(){

}

@Composable
fun recipeScreen(){

}

@Composable
fun recipeDetScreen(){

}

@Composable
fun favScreen(){

}