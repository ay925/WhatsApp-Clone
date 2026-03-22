package com.visionary.whatsappclone.data

import com.visionary.whatsappclone.R


data class UserContacts(
    val name: String,
    val lastMessage: String,
    val image: Int,
    val time: String
)
val contacts=listOf(
    UserContacts("Amitabh Bachchan","Hi", R.drawable.boy3,"10:11 am"),
    UserContacts("Shraddha Kapoor","Hello", R.drawable.sharadha_kapoor,"11:12 pm"),
    UserContacts("Shah Rukh Khan","see you soon", R.drawable.sharukh_khan,"12:12 am"),
    UserContacts("Alia Bhatt","Hello", R.drawable.girl2,"4:12 am"),
    UserContacts("Salman Khan","nice", R.drawable.salman_khan,"11:12 pm"),
    UserContacts("Aksay kumar","Hi", R.drawable.akshay_kumar,"10:12 am"),
    UserContacts("Hrithik Roshan","Hello", R.drawable.hrithik_roshan,"9:12 pm"),
    UserContacts("Ajay Devgan","nice", R.drawable.ajay_devgn,"9:13 am"),
    UserContacts("Bhuvan Bam","Hi", R.drawable.bhuvan_bam,"10:18 am"),
    UserContacts("Carry Minati","see you soon", R.drawable.carryminati,"9:10 am"),
    UserContacts("Techo bhai","Gta V ki video kab aayegi", R.drawable.techno,"5:55 pm"),
    UserContacts("Ajju bhai","free fire ki video kab aayegi", R.drawable.ajju_bhai,"6:12 am"),
    UserContacts("rashmika mandana","Hi", R.drawable.rashmika,"7:11 pm"),
)

