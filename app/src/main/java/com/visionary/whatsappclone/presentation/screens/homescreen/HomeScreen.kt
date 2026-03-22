package com.visionary.whatsappclone.presentation.screens.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.visionary.whatsappclone.R
import com.visionary.whatsappclone.data.contacts
import com.visionary.whatsappclone.presentation.ui_components.BottomNavBar
import com.visionary.whatsappclone.ui.theme.WhatsappGreen

@Preview
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            Column {
                HomeScreenTopBar()
                HorizontalDivider()
            }
        },
        bottomBar = { BottomNavBar() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = WhatsappGreen,
                contentColor = Color.White
            ) {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.add_chat_icon),
                    contentDescription = null
                )
            }
        }

    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            item {
                contacts.forEach { contact ->
                    ContactsCard(contact)
                }
            }
        }
    }
}