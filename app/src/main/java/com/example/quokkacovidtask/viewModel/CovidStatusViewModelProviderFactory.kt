package com.example.quokkacovidtask.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CovidStatusViewModelProviderFactory(val covidStatusRepository: CovidStatusRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CovidStatusViewModel(covidStatusRepository) as T
    }
}