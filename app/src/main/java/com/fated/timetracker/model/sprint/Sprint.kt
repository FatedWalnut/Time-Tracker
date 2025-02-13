package com.fated.timetracker.model.sprint

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "sprints")
data class Sprint(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val startDate: Long,
    val endDate: Long,
    val status: Int,
    val description : String

)