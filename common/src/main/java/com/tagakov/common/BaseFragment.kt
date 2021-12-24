package com.tagakov.common

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    protected val bind = createBinder()

    override fun onDestroyView() {
        bind.resetViews()
        super.onDestroyView()
    }
}