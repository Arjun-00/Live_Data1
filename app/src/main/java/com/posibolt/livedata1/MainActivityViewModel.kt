package com.posibolt.livedata1
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var total = MutableLiveData<Int>()

    init {
        total.value = 100
    }

    fun bigTotal(input:Int){
        total.value = (total.value)?.plus(input)
    }
}