package com.example.exam.DB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao  {

    @Insert
    fun addpro(productEntity: ProductEntity)

    @Update
    fun updatepro(productEntity: ProductEntity)

    @Delete
    fun deletepro(productEntity: ProductEntity)

   @Query("SELECT * FROM product")
   fun getproduct():List<ProductEntity>



}