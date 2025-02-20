package com.fated.timetracker.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fated.timetracker.model.Activity
import com.fated.timetracker.repository.ActivityRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ActivityRepository) : ViewModel() {


    val allActivities = repository.allActivities

    fun insert(activity: Activity) = viewModelScope.launch {
        repository.insert(activity)
    }

    fun update(activity: Activity) = viewModelScope.launch {
        repository.update(activity)
    }

    fun delete(activity: Activity) = viewModelScope.launch {
        repository.delete(activity)
    }
}