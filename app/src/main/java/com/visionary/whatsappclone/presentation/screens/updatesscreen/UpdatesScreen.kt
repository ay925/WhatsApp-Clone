package com.visionary.whatsappclone.presentation.screens.updatesscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.visionary.whatsappclone.R
import com.visionary.whatsappclone.data.StatusContacts
import com.visionary.whatsappclone.data.channels
import com.visionary.whatsappclone.presentation.ui_components.BottomNavBar
import com.visionary.whatsappclone.ui.theme.WhatsappGreen


@Composable
fun UpdatesScreen(navController: NavController) {
    Scaffold(
        topBar = {
            Column {
                UpdatesScreenTopBar()
                HorizontalDivider()
            }
        },
        bottomBar = { BottomNavBar(navController,"Updates") },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = WhatsappGreen,
                contentColor = Color.White
            ) {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.camera),
                    contentDescription = null
                )
            }
        }
    ) { innerPadding ->
            LazyColumn(modifier = Modifier.padding(15.dp).padding(innerPadding)) {
                item {
                    Text(
                        text = "Status",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold
                        )
                        MyStatusCard()
                        StatusContacts.forEach { staus ->
                            StausCard(staus)

                        }
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Channels",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text("Stay updated on topics that matter to you. Find channels to follow below.")
                    Spacer(modifier = Modifier.height(20.dp))
                    Text("Find Channel to follow")
                    channels.forEach {channel->
                        ChannelCard(channel)

                    }
                    }



            }



    }
}