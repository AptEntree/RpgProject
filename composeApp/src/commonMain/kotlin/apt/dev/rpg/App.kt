package apt.dev.rpg

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import apt.dev.rpg.ui.menu.MenuScreen
import apt.dev.rpg.utils.NavigationEnum
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import rpgproject.composeapp.generated.resources.Res
import rpgproject.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = NavigationEnum.MENU.name) {
            composable(NavigationEnum.MENU.name) {
                MenuScreen(navController)
            }
        }
    }
}