package com.example.stagetwocvtask.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.stagetwocvtask.data.HomeScreenUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CvViewModel : ViewModel(){
    var uiState by mutableStateOf(HomeScreenUiState())
        private set

    fun updateUiState(homeScreenUiState: HomeScreenUiState){
        uiState = homeScreenUiState
    }
}
