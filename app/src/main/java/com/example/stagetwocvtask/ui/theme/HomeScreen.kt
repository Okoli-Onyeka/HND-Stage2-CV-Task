package com.example.stagetwocvtask.ui.theme

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.stagetwocvtask.R
import com.example.stagetwocvtask.data.HomeScreenUiState

val cvHeadStyle: TextStyle = TextStyle(
    color = Color.Red,
    fontSize = 20.sp,
    fontWeight = W400,
    fontStyle = FontStyle.Normal,
    fontFamily = FontFamily.Monospace,
)



@Composable
fun HomeScreen(
    cvViewModel: CvViewModel,
    homeScreenUiState: HomeScreenUiState,
    navigate: () -> Unit
){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        PersonalInfoDetails(listOfDetails = homeScreenUiState.listOfDetails)
        CvCard(
            personalDetailsText = homeScreenUiState.personalProfileText,
            educationText = homeScreenUiState.educationText,
            workExperienceText = homeScreenUiState.workExperienceText,
            hobbiesText = homeScreenUiState.hobbiesText,
            refereesText = homeScreenUiState.refereesText,
            navigate = { navigate() }
        )

        OutlinedButton(
            onClick = { navigate()},
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth())
        {
            Text(text = stringResource(R.string.edit_cv_details))
        }
    }

}

@Composable
fun PersonalInfoDetails(listOfDetails: List<Pair<String, String>>){
    Column(verticalArrangement = Arrangement.Center) {
        listOfDetails.forEach {
            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFCED1D6)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp, vertical = 5.dp)
            ) {
                Text(text = "${it.first}: ${it.second}", modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp))
            }
        }
    }
}
@Composable
fun CvCard (
    personalDetailsText: String,
    educationText: String,
    workExperienceText: String,
    hobbiesText: String,
    refereesText: String,
    navigate:()->Unit
){
    val detailsModifier: Modifier = Modifier
        .padding(start = 10.dp)
        .clickable { navigate() }
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFC1C5CE)),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    ) {
        Text(
            text = stringResource(R.string.cv_details), fontSize = 20.sp, fontWeight = Bold, fontFamily = FontFamily.Cursive, modifier = Modifier.align(alignment = Alignment.CenterHorizontally).padding(5.dp))
        Text(text = stringResource(R.string.personal_profile), style = cvHeadStyle)
        Divider(color = Color.Black, thickness = 4.dp, modifier = Modifier.padding(1.dp))
        Text(text = personalDetailsText, modifier = detailsModifier)
        Text(text = stringResource(R.string.education), style = cvHeadStyle)
        Divider(color = Color.Black, thickness = 4.dp, modifier = Modifier.padding(1.dp))
        Text(text = educationText, modifier = detailsModifier)
        Text(text = stringResource(R.string.work_experience), style = cvHeadStyle)
        Divider(color = Color.Black, thickness = 4.dp, modifier = Modifier.padding(1.dp))
        Text(text = workExperienceText, modifier = detailsModifier)
        Text(text = stringResource(R.string.hobbies_and_interests), style = cvHeadStyle)
        Divider(color = Color.Black, thickness = 4.dp, modifier = Modifier.padding(1.dp))
        Text(text = hobbiesText, modifier = detailsModifier)
        Text(text = stringResource(R.string.referees), style = cvHeadStyle)
        Divider(color = Color.Black, thickness = 4.dp, modifier = Modifier.padding(1.dp))
        Text(text = refereesText, modifier = detailsModifier)
    }
}
