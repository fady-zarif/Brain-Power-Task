package com.fady.brain_power_task

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.fady.brain_power_task.model.Athlete

class MainActivityViewModel (
    private val repository: AthleteRepository,
    application: Application
) :
    AndroidViewModel(application) {
    private val showLoadingLiveData = MutableLiveData<Boolean>()
    private var showErrorLiveData = MutableLiveData<String>()
    private var athletesLiveData = MutableLiveData<List<Athlete>>()






    fun getShowLoadingLiveData(): LiveData<Boolean> = showLoadingLiveData
    fun getShowErrorLiveData(): LiveData<String> = showErrorLiveData
    fun getAthletesLiveData(): LiveData<List<Athlete>> = athletesLiveData

}