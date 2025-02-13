package com.fated.timetracker.model.activity


import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ActivityDao {
    @Query("SELECT * FROM activities")
    fun getAllActivities(): LiveData<List<Activity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(activity: Activity)

    @Update
    suspend fun update(activity: Activity)

    @Delete
    suspend fun delete(activity: Activity)
}