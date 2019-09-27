package com.example.bluetoothchat.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<D : ViewDataBinding, V : BaseViewModel> : Fragment() {

    lateinit var viewDataBinding: D
    abstract val viewModel: V
    abstract val layoutResourceId: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        viewDataBinding = DataBindingUtil.inflate(inflater, layoutResourceId, container, false)

        return viewDataBinding.root
    }
}