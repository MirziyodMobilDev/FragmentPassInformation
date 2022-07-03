package com.example.fragmentpassinformation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {

 lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_second, container, false)
        var data = arguments
        if (data!=null){
            root.text1.text = data.get("name").toString()
            root.text2.text = data.get("lastName").toString()
        }

        return root
    }

}