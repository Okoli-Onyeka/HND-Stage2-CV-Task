package com.example.stagetwocvtask.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.stagetwocvtask.data.HomeScreenUiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditScreen (
    homeScreenUiState: HomeScreenUiState,
    cvViewModel: CvViewModel
){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        Text(text = "Personal Profile", style = cvHeadStyle)
        OutlinedTextField(value = homeScreenUiState.personalProfileText, onValueChange = { cvViewModel.updateUiState(homeScreenUiState.copy(personalProfileText = it)) },
            Modifier
                .fillMaxWidth()
                .padding(10.dp))
        Text(text = "Education", style = cvHeadStyle)
        OutlinedTextField(value = homeScreenUiState.educationText, onValueChange = { cvViewModel.updateUiState(homeScreenUiState.copy(educationText = it)) },
            Modifier
                .fillMaxWidth()
                .padding(10.dp))
        Text(text = "Work Experience", style = cvHeadStyle)
        OutlinedTextField(value = homeScreenUiState.workExperienceText, onValueChange = {cvViewModel.updateUiState(homeScreenUiState.copy(workExperienceText = it))},
            Modifier
                .fillMaxWidth()
                .padding(10.dp))
        Text(text = "Hobbies and Interests", style = cvHeadStyle)
        OutlinedTextField(value = homeScreenUiState.hobbiesText, onValueChange = { cvViewModel.updateUiState(homeScreenUiState.copy(hobbiesText = it))},
            Modifier
                .fillMaxWidth()
                .padding(10.dp))
        Text(text = "Referees", style = cvHeadStyle)
        OutlinedTextField(value = homeScreenUiState.refereesText, onValueChange = {cvViewModel.updateUiState(homeScreenUiState.copy(refereesText = it))},
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp) )
    }
}