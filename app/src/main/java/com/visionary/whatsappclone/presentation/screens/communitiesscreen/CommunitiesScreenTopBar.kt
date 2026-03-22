package com.visionary.whatsappclone.presentation.screens.communitiesscreen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.visionary.whatsappclone.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CommunitiesScreenTopBar() {
    var search by remember { mutableStateOf("") }
    var isSearching by remember { mutableStateOf(false) }
    var expended by remember { mutableStateOf(false) }
    if (!isSearching) {
        TopAppBar(
            modifier = Modifier.padding(horizontal = 5.dp),
            title = {

                Text(
                    text = "Communities",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                )
            },
            actions = {
                Spacer(modifier = Modifier.width(8.dp))
                IconButton(onClick = {isSearching=true}) {
                    Icon(
                        modifier = Modifier.size(25.dp),
                        painter = painterResource(R.drawable.search),
                        contentDescription = null
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                IconButton(onClick = {expended=true}) {
                    Icon(
                        modifier = Modifier.size(25.dp),
                        painter = painterResource(R.drawable.more),
                        contentDescription = null
                    )
                }
                DropdownMenu(expanded = expended, onDismissRequest = {expended=false})
                {
                    listOf("Settings").forEach {
                        DropdownMenuItem(text = {Text(text = it)}, onClick = {
                            expended=false
                        })
                    }
                }
            }
        )
    }else{
        TextField(
            modifier = Modifier.fillMaxWidth().padding(top = 30.dp),
            value = search,
            onValueChange = {search=it},
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedIndicatorColor = Color.Black,
                unfocusedIndicatorColor = Color.Black,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                cursorColor = Color.Black
            ),
            placeholder = {Text("Search")},
            trailingIcon = {
                IconButton(onClick = {isSearching=false}) {
                    Icon(imageVector = Icons.Default.Clear, contentDescription = null)
                }
            },
            singleLine = true
        )
    }
}