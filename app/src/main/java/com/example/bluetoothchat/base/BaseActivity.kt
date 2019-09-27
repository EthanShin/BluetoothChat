package com.example.bluetoothchat.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<D : ViewDataBinding, V : BaseViewModel> : AppCompatActivity() {

    lateinit var viewDataBinding: D
    abstract val viewModel: V
    abstract val layoutResourceId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBinding = DataBindingUtil.setContentView(this, layoutResourceId)

        initViewModel()
    }

    abstract fun initViewModel()
}