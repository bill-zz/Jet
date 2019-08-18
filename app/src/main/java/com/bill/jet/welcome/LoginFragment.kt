package com.bill.jet.welcome

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bill.jet.databinding.FragmentLoginBinding
import com.bill.jet.home.MainActivity

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentLoginBinding.inflate(inflater, container, false)
        onSubscribeUi(binding)
        return binding.root
    }


    private fun onSubscribeUi(binding: FragmentLoginBinding) {
        val viewModel = ViewModelProviders.of(this).get(LoginModel::class.java)
        binding.loginModel = viewModel
        binding.btLogin.setOnClickListener {
            if (viewModel.login()) {
                startActivity(Intent(requireContext(), MainActivity::class.java))
            } else {
                Toast.makeText(requireContext(), "账号不存在或者密码错误", Toast.LENGTH_SHORT).show()
            }
        }
        viewModel.mAccountData.observe(this, Observer {
            binding.isEnable = viewModel.mAccountData.value!!.isNotEmpty() && viewModel.mPasswordData.value!!.isNotEmpty()
        })
        viewModel.mPasswordData.observe(this, Observer {
            binding.isEnable = viewModel.mAccountData.value!!.isNotEmpty() && viewModel.mPasswordData.value!!.isNotEmpty()
        })

    }
}