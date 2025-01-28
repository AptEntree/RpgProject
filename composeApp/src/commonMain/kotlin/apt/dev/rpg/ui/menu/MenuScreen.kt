package apt.dev.rpg.ui.menu

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import apt.dev.rpg.ui.base.BaseScreen

class MenuScreen(navController: NavController) :
    BaseScreen<MenuEvent, MenuAction, MenuViewModel>(navController = navController) {
    @Composable
    override fun getViewModel(): MenuViewModel = viewModel { MenuViewModel() }

    @Composable
    override fun content() {
        
    }
}