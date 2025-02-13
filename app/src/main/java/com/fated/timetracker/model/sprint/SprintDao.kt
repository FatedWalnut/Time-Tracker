package com.fated.timetracker.model.sprint

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SprintDao {
    @Query("SELECT * FROM sprints")
    fun getAllSprints(): LiveData<List<Sprint>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(sprint: Sprint)

    @Update
    suspend fun update(sprint: Sprint)

    @Delete
    suspend fun delete(sprint: Sprint)
}