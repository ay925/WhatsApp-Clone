package com.visionary.whatsappclone.presentation.screens.userregistrationscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.visionary.whatsappclone.presentation.navigation.NavRoutes
import com.visionary.whatsappclone.ui.theme.WhatsappDarkGreen
import com.visionary.whatsappclone.ui.theme.WhatsappGreen

@Composable
fun UserRegistrationScreen(navController: NavController) {
    var dropDownMenuState by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("India") }
    val countries by remember {
        mutableStateOf(
            listOf(
                "Afghanistan",
                "Singapore",
                "Japan",
                "India",
            )
        )
    }
    var countryCode by remember { mutableStateOf("+91") }
    var phoneNumber by remember { mutableStateOf("") }
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize().padding(20.dp).padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Enter Your Number",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = WhatsappDarkGreen
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                buildAnnotatedString {
                    append("Whatsapp will need to verify your phone number.")
                    withStyle(
                        style = SpanStyle(color = WhatsappGreen)
                    ) {
                        append(" What's my number?")
                    }
                },
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.height(20.dp))

            TextButton(
                onClick = { dropDownMenuState = true },
                modifier = Modifier.fillMaxWidth()
            )
            {
                Box(modifier = Modifier.width(200.dp))
                {
                    Text(
                        modifier = Modifier.align(Alignment.Center),
                        text = selectedCountry,
                        color = Color.Black,
                    )
                    Icon(
                        modifier = Modifier.align(Alignment.CenterEnd),
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = null,
                        tint = WhatsappGreen
                    )

                    DropdownMenu(
                        expanded = dropDownMenuState,
                        onDismissRequest = { dropDownMenuState = false }
                    )
                    {
                        countries.forEach { country ->
                            DropdownMenuItem(
                                text = { Text(text = country) },
                                onClick = {
                                    selectedCountry = country
                                    dropDownMenuState = false
                                }
                            )
                        }
                    }
                }
            }
            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 66.dp),
                thickness = 1.dp,
                color = WhatsappGreen
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                TextField(
                    modifier = Modifier.width(60.dp),
                    value = countryCode,
                    onValueChange = { countryCode = it },
                    readOnly = true,
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = WhatsappGreen,
                        focusedIndicatorColor = WhatsappGreen
                    ),
                    textStyle = LocalTextStyle.current.copy(fontSize = 16.sp)
                )
                TextField(
                    value = phoneNumber,
                    onValueChange = { phoneNumber = it },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = WhatsappGreen,
                        focusedIndicatorColor = WhatsappGreen
                    ),
                    placeholder = { Text("Phone number") },
                    textStyle = LocalTextStyle.current.copy(fontSize = 16.sp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Carrier charge may apply",
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = {navController.navigate(NavRoutes.HomeScreen)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = WhatsappGreen
                ),
                shape = RoundedCornerShape(4.dp)
            ) {
                Text("Next")
            }

        }
    }

}
