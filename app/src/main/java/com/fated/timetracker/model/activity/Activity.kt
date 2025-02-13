package com.fated.timetracker.model.activity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "activities")
data class Activity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val category: String,
    val tags: List<String>,
    val priority: Int,
    val startDate: Long,
    val endDate: Long,
    val isCompleted: Boolean
)