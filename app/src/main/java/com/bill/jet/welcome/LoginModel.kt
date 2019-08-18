package com.bill.jet.welcome

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginModel : ViewModel() {
    val mAccountData = MutableLiveData<String>("")
    val mPasswordData = MutableLiveData<String>("")

    fun accountChange(s: CharSequence) {
        mAccountData.value = s.toString()
    }

    fun passwordChange(s: CharSequence) {
        mPasswordData.value = s.toString()
    }

    fun login(): Boolean = mAccountData.value.equals("q") && mPasswordData.value.equals("q")

}