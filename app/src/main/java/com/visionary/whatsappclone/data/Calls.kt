package com.visionary.whatsappclone.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import com.visionary.whatsappclone.R


data class FavoritesCalls(
    val name: String,
    val image: Int
)
val favoritesCalls=listOf(
    FavoritesCalls("Bhuvan Bam", R.drawable.bhuvan_bam),
    FavoritesCalls("Carry Minati", R.drawable.carryminati),
    FavoritesCalls("Techno bhai", R.drawable.techno),
    FavoritesCalls("Ajju bhai",R.drawable.ajju_bhai),
)

data class RecentCalls(
    val name: String,
    val image: Int,
    val time: String,
    val methodIcon: Int
)

val recentCalls=listOf(
    RecentCalls("Salman Khan",R.drawable.salman_khan,"Yesterday,11:12 pm", R.drawable.telephone),
    RecentCalls("Aksay kumar",R.drawable.akshay_kumar,"Today,10:12 am",R.drawable.telephone),
    RecentCalls("Hrithik Roshan", R.drawable.hrithik_roshan,"Oct,9:12 pm",R.drawable.telephone),
    RecentCalls("Ajay Devgan",R.drawable.ajay_devgn,"Nov,9:13 am",R.drawable.telephone),
    RecentCalls("Bhuvan Bam", R.drawable.bhuvan_bam,"Dec,10:18 am",R.drawable.telephone),
    RecentCalls("Carry Minati", R.drawable.carryminati,"Jan,9:10 am",R.drawable.telephone),
    RecentCalls("Techno bhai",R.drawable.techno,"Feb,5:55 pm",R.drawable.telephone),
    RecentCalls("Ajju bhai", R.drawable.ajju_bhai,"Mar,6:12 am",R.drawable.telephone),
)