package com.bwrsks.latihanretrofit

data class PostResponse(
    val id: Int,
    val first_name: String?,
    val last_name: String?,
    val email: String?,
    val phone: String?,
    val organization: String?,
    val designation: String?
)