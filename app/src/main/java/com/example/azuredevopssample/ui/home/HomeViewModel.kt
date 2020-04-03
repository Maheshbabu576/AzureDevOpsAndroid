package com.example.azuredevopssample.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {

        value = "This is home screen test changes 667"

    }
    val text: LiveData<String> = _text
}