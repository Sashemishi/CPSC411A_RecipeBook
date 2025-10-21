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
import androidx.navigation.compose.rememberNavController
import com.example.cpsc411a_recipebook.ui.theme.CPSC411A_RecipeBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CPSC411A_RecipeBookTheme {
                val navController = rememberNavController;
                //  Add more navigation logic here
            }
        }
    }
}

class FavVM : ViewModel() {
    val favRecipies = mutableStateOf<>()

    fun addFavR(){

    }

    fun delFavR(){

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