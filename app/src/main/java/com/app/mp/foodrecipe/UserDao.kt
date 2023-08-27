package com.app.mp.foodrecipe

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM user LIMIT 1")
    suspend fun getUser(): User

    @Insert
    fun insert(user: User)
}
