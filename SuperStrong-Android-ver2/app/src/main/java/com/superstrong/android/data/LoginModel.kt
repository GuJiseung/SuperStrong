package com.superstrong.android.data

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: String,
    @SerializedName("pw")
    val pw: String
)

data class EncryptedData(
    @SerializedName("e2e_req")
    val e2e_req: String
    )