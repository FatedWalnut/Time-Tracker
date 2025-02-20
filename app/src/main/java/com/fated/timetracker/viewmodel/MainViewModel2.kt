package com.fated.timetracker.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel


class MainViewModel2 : ViewModel(){

    var corDeFundo by mutableStateOf(Color.White)
        private set

    fun changeBackgroundColor() {
        corDeFundo = Color.Red

    }



}