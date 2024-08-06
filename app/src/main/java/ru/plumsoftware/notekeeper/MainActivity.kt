package ru.plumsoftware.notekeeper

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.androidx.compose.koinViewModel
import ru.plumsoftware.notekeeper.presentation.screens.main.MainScreen
import ru.plumsoftware.notekeeper.presentation.screens.main.MainViewModel
import ru.plumsoftware.notekeeper.presentation.theme.NotekeeperTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotekeeperTheme {
                Scaffold {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Routing.NOTEBOOK_SCREEN
                    ) {
                        composable(route = Routing.NOTEBOOK_SCREEN) {
                            val mainViewModel: MainViewModel = koinViewModel()
                            MainScreen(mainViewModel = mainViewModel)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NotekeeperTheme {
        Greeting("Android")
    }
}