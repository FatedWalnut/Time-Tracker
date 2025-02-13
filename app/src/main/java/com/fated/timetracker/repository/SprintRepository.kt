package com.fated.timetracker.repository

import androidx.lifecycle.LiveData
import com.fated.timetracker.model.activity.Activity
import com.fated.timetracker.model.activity.ActivityDao
import com.fated.timetracker.model.sprint.Sprint
import com.fated.timetracker.model.sprint.SprintDao

class SprintRepository(private val sprintDao: SprintDao) {
    val allSprints: LiveData<List<Sprint>> = sprintDao.getAllSprints()

    suspend fun insert(sprint: Sprint) {
        sprintDao.insert(sprint)
    }

    suspend fun update(sprint: Sprint) {
        sprintDao.update(sprint)
    }

    suspend fun delete(sprint: Sprint) {
        sprintDao.delete(sprint)
    }
}