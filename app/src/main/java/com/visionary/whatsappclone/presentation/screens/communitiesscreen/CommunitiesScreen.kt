package com.visionary.whatsappclone.presentation.screens.communitiesscreen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.visionary.whatsappclone.data.communities
import com.visionary.whatsappclone.presentation.ui_components.BottomNavBar
import com.visionary.whatsappclone.ui.theme.WhatsappGreen

@Preview
@Composable
fun CommunitiesScreen() {
    Scaffold(
        topBar = {CommunitiesScreenTopBar()},
        bottomBar = { BottomNavBar() }
    ) {innerPadding->
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .padding(innerPadding)) {
            item {
                Spacer(modifier = Modifier.height(20.dp))
                Button(modifier = Modifier.fillMaxWidth(), onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = WhatsappGreen
                    )) {
                    Text("Start a new Communities")
                }
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = "Your Communities",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))

                communities.forEach { community->
                    CommunityCard(community)

                }
            }
        }
    }
}