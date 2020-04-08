package com.abdhilabs.footbalschedule.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat

fun ViewGroup.inflate(resource: Int): View =
    LayoutInflater.from(context).inflate(resource, this, false)

fun glideAdapter(context: View, resource: String?, place: ImageView) =
    Glide.with(context)
        .load(resource)
        .into(place)

fun glideActivity(context: Activity, resource: String?, place: ImageView) =
    Glide.with(context)
        .load(resource)
        .into(place)

fun glideFragment(context: Context?, resource: String, place: ImageView) =
    Glide.with(context!!)
        .load(resource)
        .into(place)

fun Any.toast(context: Context?, duration: Int = Toast.LENGTH_SHORT): Toast {
    return Toast.makeText(context, this.toString(), duration).apply { show() }
}

@SuppressLint("SimpleDateFormat")
fun String.toDate(): String? {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    val output = SimpleDateFormat("MMM dd, yyyy")
    val date = dateFormat.parse(this)
    return output.format(date!!)
}