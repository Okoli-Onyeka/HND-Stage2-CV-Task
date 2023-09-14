package com.example.stagetwocvtask.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.stagetwocvtask.ui.theme.CvViewModel
import com.example.stagetwocvtask.ui.theme.EditScreen
import com.example.stagetwocvtask.ui.theme.HomeScreen

enum class HomeUiScreen(){
    Home,
    Edit
}

@Composable
fun MainScreen (
    navController: NavHostController = rememberNavController(),
    cvViewModel: CvViewModel = viewModel()
){
    val homeUiScreenUiState = cvViewModel.uiState
    NavHost(
        navController = navController,
        startDestination = HomeUiScreen.Home.name
    ){
        composable(route = HomeUiScreen.Home.name){
            HomeScreen(cvViewModel = cvViewModel, homeScreenUiState = homeUiScreenUiState, navigate = {navController.navigate(HomeUiScreen.Edit.name)})
        }
        composable(route = HomeUiScreen.Edit.name){
            EditScreen(
                homeScreenUiState = homeUiScreenUiState,
                cvViewModel = cvViewModel
            )
        }
    }
}