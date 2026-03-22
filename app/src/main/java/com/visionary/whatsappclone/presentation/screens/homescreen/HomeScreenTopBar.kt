package com.visionary.whatsappclone.presentation.screens.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.visionary.whatsappclone.R
import com.visionary.whatsappclone.ui.theme.WhatsappGreen

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HomeScreenTopBar() {
    TopAppBar(
        modifier = Modifier.padding(horizontal = 5.dp),
        title = {

            Text(
                text = "WhatsApp",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                color = WhatsappGreen
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.camera),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = {}) {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.search),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = {}) {
                Icon(
                    modifier = Modifier.size(25.dp),
                    painter = painterResource(R.drawable.more),
                    contentDescription = null
                )
            }
        }
    )

}