package com.example.quokkacovidtask.viewModel

import com.example.quokkacovidtask.serverHit.RetrofitInstance

class CovidStatusRepository {

    suspend fun getCovidStatusByCountry(country: String) =
        RetrofitInstance.api.getCovidStatus(country)


}