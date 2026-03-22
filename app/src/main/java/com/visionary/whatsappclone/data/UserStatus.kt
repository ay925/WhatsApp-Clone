package com.visionary.whatsappclone.data

import com.visionary.whatsappclone.R

data class UserStatus(
    val name: String,
    val image: Int,
    val time: String
)
val StatusContacts=listOf(
    UserStatus("Bhuvan Bam", R.drawable.bhuvan_bam,"10 minutes ago"),
    UserStatus("Carry Minati", R.drawable.carryminati,"1 minutes ago"),
    UserStatus("Techno bhai", R.drawable.techno,"40 minutes ago"),
    UserStatus("Ajju bhai", R.drawable.ajju_bhai,"1 hour ago")
)