package com.bill.jet.db

import androidx.room.*

@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true)val id :Int,
    @ColumnInfo(name = "user_account") val account: String,
    @ColumnInfo(name = "user_password") val password: String,
    @ColumnInfo(name = "user_email") val email: String,
    @Embedded val address: UserAddress,
    @Ignore val state: Int
)