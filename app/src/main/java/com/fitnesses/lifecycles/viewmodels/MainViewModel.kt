package com.fitnesses.lifecycles.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fitnesses.lifecycles.models.DataModel
import com.fitnesses.lifecycles.network.Resource
import com.fitnesses.lifecycles.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (private val repository: MainRepository) : ViewModel() {

    init {
        viewModelScope.launch {
            repository.getData()
        }
    }

    val data: LiveData<Resource<DataModel>>
        get() = repository.data
}