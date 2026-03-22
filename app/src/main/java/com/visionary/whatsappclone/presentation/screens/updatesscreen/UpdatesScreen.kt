package com.visionary.whatsappclone.presentation.screens.updatesscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.visionary.whatsappclone.presentation.screens.homescreen.HomeScreenTopBar
import com.visionary.whatsappclone.presentation.ui_components.BottomNavBar

@Preview
@Composable
fun UpdatesScreen() {
    Scaffold(
        topBar = {
            Column {
                UpdatesScreenTopBar()
                HorizontalDivider()
            }
        },
        bottomBar = { BottomNavBar() }
    ) {innerPadding->

    }
}