package com.lizyakin.mobile_amethyst_audio.fragments

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lizyakin.mobile_amethyst_audio.R
import com.lizyakin.mobile_amethyst_audio.viewmodels.MyRecordViewModel

class MyRecordFragment : Fragment() {

    companion object {
        fun newInstance() = MyRecordFragment()
    }

    private val viewModel: MyRecordViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_my_record, container, false)
    }
}