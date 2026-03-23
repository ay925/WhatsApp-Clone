package com.visionary.whatsappclone.presentation.ui_components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.visionary.whatsappclone.R
import com.visionary.whatsappclone.presentation.navigation.NavRoutes
import com.visionary.whatsappclone.ui.theme.WhatsappGreen

val navItems = listOf(
    NavItem("Chats", R.drawable.message_4475881, NavRoutes.HomeScreen),
    NavItem("Updates", R.drawable.update_icon, NavRoutes.UpdatesScreen),
    NavItem("Communities", R.drawable.communities_icon, NavRoutes.CommunitiesScreen),
    NavItem("Calls", R.drawable.telephone, NavRoutes.CallsScreen)
)

@Composable
fun BottomNavBar(navController: NavController, key: String) {
    NavigationBar(containerColor = MaterialTheme.colorScheme.surface) {
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            navItems.forEach { item ->
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = WhatsappGreen
                    ),
                    selected = item.name == key,
                    onClick = { navController.navigate(item.routes){
                        popUpTo<NavRoutes.HomeScreen>{
                            saveState=true
                        }
                        launchSingleTop=true
                        restoreState=true
                    } },
                    label = {
                        Text(
                            text = item.name,
                            fontWeight = if (item.name == key) FontWeight.Bold else FontWeight.Normal
                        )
                    },
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
    val icon: Int,
    val routes: NavRoutes
)