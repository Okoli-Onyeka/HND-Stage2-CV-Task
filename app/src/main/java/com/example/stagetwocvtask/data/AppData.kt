package com.example.stagetwocvtask.data
//initial screen data
data class HomeScreenUiState(
    val listOfDetails: List<Pair<String, String>> = listOf(
        Pair("Name", "Okoli Onyeka Franklin"),
        Pair("Slack Username", "Onyeka Okoli Franklin"),
        Pair("GitHub Handle", "Okoli-Onyeka"),
        Pair("Bio", "Nigerian Student wey dey find money"),
    ),
    var personalProfileText: String = "A motivated mechatronics engineering student seeking a position in automation and control industries to further increase knowledge and contribute to the engineering community. \nI am capable of adapting to latest tech and ready to learn",
    var educationText: String = "⦿ Studied at st Gregorys College Ikoyi \n⦿ Graduate at federal University Of Technology Owerri ",
    var workExperienceText: String = "⦿ 2 yrs at anambra state ministry of works loading and offloading \n⦿ 4 yrs at Candix Engineering wiring and Re-wiring ",
    var hobbiesText: String = "⦿ Thinking \n⦿ Coding \n⦿ Continuous thinking \n⦿ Think More ",
    var refereesText: String = "⦿ Engr Rufus Emeka \n⦿ Prof Dr. Victor Offor \n⦿ Bar Anyaene Kingsely \n⦿ Engr. Ben Benjamin",
)