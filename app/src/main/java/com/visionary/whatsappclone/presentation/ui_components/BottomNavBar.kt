package com.visionary.whatsappclone.presentation.ui_components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.visionary.whatsappclone.R

val navItems=listOf(
    NavItem("Chats",R.drawable.message_4475881),
    NavItem("Updates",R.drawable.update_icon),
    NavItem("Communities",R.drawable.communities_icon),
    NavItem("Calls",R.drawable.telephone)
)
@Preview
@Composable
fun BottomNavBar() {
    NavigationBar(containerColor = MaterialTheme.colorScheme.surface) {
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            navItems.forEach { item ->
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    label = { Text(text = item.name, fontWeight = FontWeight.Bold) },
                    icon = {
                        Icon(
                            modifier = Modifier.size(20.dp),
                            painter = painterResource(item.icon),
                            contentDescription = null
                        )
                    }
                )

            }
        }

    }
}


data class NavItem(
    val name: String,
    val icon: Int
)