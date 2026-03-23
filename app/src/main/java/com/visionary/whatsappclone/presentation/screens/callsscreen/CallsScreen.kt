package com.visionary.whatsappclone.presentation.screens.callsscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.visionary.whatsappclone.data.favoritesCalls
import com.visionary.whatsappclone.data.recentCalls
import com.visionary.whatsappclone.presentation.ui_components.BottomNavBar
import com.visionary.whatsappclone.ui.theme.WhatsappGreen

@Composable
fun CallsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            Column{
                CallsScreenTopBar()
                HorizontalDivider()
            }
        },
        bottomBar = { BottomNavBar(navController,"Calls") },
        floatingActionButton = { FloatingActionButton(onClick = {}, containerColor = WhatsappGreen, contentColor = Color.White){
            Icon(painter = painterResource(R.drawable.add_call),contentDescription = null)
        } }
    ) {innerPadding->
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .padding(innerPadding))
        {
            item {
                Text(
                    text = "Favorites",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                LazyRow(modifier = Modifier.fillMaxWidth()) {
                    item {
                        favoritesCalls.forEach { favoritesCall->
                            FavoritesCallsCard(favoritesCall)
                        }
                    }
                }
                Spacer(modifier = Modifier.height(40.dp))
                Button(modifier = Modifier.fillMaxWidth(), onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = WhatsappGreen
                    )) {
                    Text("Start a new Call")
                }
                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Recent Calls",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                recentCalls.forEach { recentCall->
                    RecentCallsCard(recentCall)
                }
            }
        }
    }
}