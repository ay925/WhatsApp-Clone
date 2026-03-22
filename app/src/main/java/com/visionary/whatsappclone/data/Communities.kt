package com.visionary.whatsappclone.data

import com.visionary.whatsappclone.R


data class Community(
    val name: String,
    val member: String,
    val image: Int
)
val communities=listOf(
    Community("Android Developers","8.4m members",R.drawable.android_developers),
    Community("Machine Learning","45k members",R.drawable.machine_learning),
    Community("Web Developers","38k members",R.drawable.web_dev)
)


