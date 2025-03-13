package com.example.android_homework.tasknavigationforgithw.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_homework.tasknavigationforgithw.R

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bF1 = view.findViewById<Button>(R.id.buttonF1)
        val bF2 = view.findViewById<Button>(R.id.buttonF2)
        bF1.setOnClickListener {}
        bF2.setOnClickListener {}
    }

}
