package com.bill.jet.welcome

import android.view.View
import androidx.navigation.Navigation
import com.bill.jet.R

class WelcomModel(val v: View) {


    fun login() {
        Navigation.findNavController(v).navigate(R.id.action_welcomFragment_to_loginFragment)
    }

    fun register() {
        Navigation.findNavController(v).navigate(R.id.action_welcomFragment_to_registerFragment)

    }

}