package com.visionary.whatsappclone.presentation.screens.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.visionary.whatsappclone.R
import com.visionary.whatsappclone.ui.theme.WhatsappDarkGreen
import com.visionary.whatsappclone.ui.theme.WhatsappGreen

@Preview(showSystemUi = true)
@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(270.dp).clip(CircleShape),
            painter = painterResource(R.drawable.whatsapp_sticker),
            contentDescription = null
        )
        Text(
            text = "Welcome WhatsApp",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(3.dp))
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle( color = Color.Gray)
                ) {
                    append("Read our")
                }
                withLink(
                    LinkAnnotation.Url(
                        url = "https://developer.android.com/develop/ui/compose/text",
                        styles = TextLinkStyles(
                            style = SpanStyle(
                                color =WhatsappGreen
                            )
                        )
                    )
                ) {
                    append(" Privacy policy")
                }
                withStyle(
                    style = SpanStyle( color = Color.Gray)
                ) {
                    append(" Tap Agree and Continue accept the")
                }
                withLink(
                    LinkAnnotation.Url(
                        url = "https://developer.android.com/jetpack/compose",
                        styles = TextLinkStyles(
                            style = SpanStyle(
                                color =WhatsappGreen
                            )
                        )
                    )
                ) {
                    append(" Terms of Service.")
                }
            },
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            modifier = Modifier.width(300.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = WhatsappDarkGreen
            ),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(
                text = "Agree & Continue",
                fontSize = 16.sp
            )
        }
    }
}