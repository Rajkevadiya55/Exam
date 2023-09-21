package com.example.exam.DB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class ProductEntity(

    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "price") var price: String,
    @ColumnInfo(name = "Dscriptaion") var dscrip: String,
    @ColumnInfo(name = "address") var address: String

) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}
