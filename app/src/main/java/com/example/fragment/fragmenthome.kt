package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class fragmenthome : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        var  view=inflater.inflate(R.layout.fragment_fragmenthome, container, false)

        var text1=view.findViewById<TextView>(R.id.tv1)
        text1.setOnClickListener {
            findNavController().navigate(R.id.action_fragmenthome_to_fragment2)
        }
        return view
    }

}