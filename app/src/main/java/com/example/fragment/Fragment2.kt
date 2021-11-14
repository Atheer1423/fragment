package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
       var  view= inflater.inflate(R.layout.fragment_2, container, false)

        var text2=view.findViewById<TextView>(R.id.tv2)
        text2.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragmenthome)
        }
        return view
    }


}