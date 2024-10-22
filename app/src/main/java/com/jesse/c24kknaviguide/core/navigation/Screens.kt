package com.jesse.c24kknaviguide.core.navigation

import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Details(val data:String)