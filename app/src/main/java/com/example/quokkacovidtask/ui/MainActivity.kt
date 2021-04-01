package com.example.quokkacovidtask.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.quokkacovidtask.R
import com.example.quokkacovidtask.viewModel.CovidStatusRepository
import com.example.quokkacovidtask.viewModel.CovidStatusViewModel
import com.example.quokkacovidtask.viewModel.CovidStatusViewModelProviderFactory

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: CovidStatusViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = CovidStatusRepository()
        val viewModelProviderFactory = CovidStatusViewModelProviderFactory(repository)
        viewModel =
            ViewModelProvider(this, viewModelProviderFactory).get(CovidStatusViewModel::class.java)

        viewModel.covidLiveData.observe(this, Observer {
            if (it.isSuccessful) {
                Toast.makeText(this, it.message(), Toast.LENGTH_LONG)


            } else {
                Toast.makeText(this, it.message(), Toast.LENGTH_LONG)
            }

        })

    }
}