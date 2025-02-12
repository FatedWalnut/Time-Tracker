package com.fated.timetracker.repository

import androidx.lifecycle.LiveData
import com.fated.timetracker.model.Activity
import com.fated.timetracker.model.ActivityDao

class ActivityRepository(private val activityDao: ActivityDao) {
    val allActivities: LiveData<List<Activity>> = activityDao.getAllActivities()

    suspend fun insert(activity: Activity) {
        activityDao.insert(activity)
    }

    suspend fun update(activity: Activity) {
        activityDao.update(activity)
    }

    suspend fun delete(activity: Activity) {
        activityDao.delete(activity)
    }
}