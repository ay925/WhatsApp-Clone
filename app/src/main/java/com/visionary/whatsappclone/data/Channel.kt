package com.visionary.whatsappclone.data

import com.visionary.whatsappclone.R


data class Channel(
    val name: String,
    val image: Int,
    val followers: String
)

val channels = listOf(
    Channel(
        name = "Daily Digest India",
        followers = "44k followers",
        image =R.drawable.daily_digest
    ),
    Channel(
        name = "Bollywood Bites",
        followers = "45k followers",
        image =R.drawable.bollywood
    ),
    Channel(
        name = "Gyan Guru",
        followers = "4k followers",
        image =R.drawable.gyan_guru
    ),
    Channel(
        name = "Startup India",
        followers = "500k followers",
        image =R.drawable.startup_india
    ),
)
