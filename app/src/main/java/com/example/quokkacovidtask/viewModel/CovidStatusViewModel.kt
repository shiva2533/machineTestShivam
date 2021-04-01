package com.example.quokkacovidtask.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quokkacovidtask.model.CovidStatusList
import kotlinx.coroutines.launch
import retrofit2.Response

class CovidStatusViewModel(val covidStatusRepository: CovidStatusRepository) : ViewModel() {

    val covidLiveData: MutableLiveData<Response<CovidStatusList>> = MutableLiveData()

    init {
        getCovidStatus("india")
    }

    fun getCovidStatus(country: String) = viewModelScope.launch {
        val response = covidStatusRepository.getCovidStatusByCountry(country)
        covidLiveData.postValue(response)
    }


}