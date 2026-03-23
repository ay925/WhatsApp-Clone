package com.visionary.whatsappclone.presentation.screens.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
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
import com.visionary.whatsappclone.presentation.navigation.NavRoutes
import com.visionary.whatsappclone.ui.theme.WhatsappGreen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        LaunchedEffect(Unit) {
            delay(1000)
            navController.navigate(NavRoutes.WelcomeScreen){
                popUpTo<NavRoutes.SplashScreen>{
                    inclusive=true
                }
            }
        }
        Image(
            modifier = Modifier
                .size(70.dp)
                .align(Alignment.Center),
            painter = painterResource(R.drawable.whatsapp_icon),
            contentDescription = null,

            )
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "from",
                fontSize = 15.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(2.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(R.drawable.meta),
                    contentDescription = null,
                    tint = WhatsappGreen
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Meta",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = WhatsappGreen
                )
            }
        }
    }
}