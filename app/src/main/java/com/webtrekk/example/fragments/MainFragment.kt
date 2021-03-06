package com.webtrekk.example.fragments

import Actions.ACCESS_CAMERA
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.webtrekk.example.R
import com.webtrekk.example.utils.MappSharedPrefs
import tracking

/**
 * First screen fragment.
 */
class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            tracking(eventName = ACCESS_CAMERA)
            Navigation.findNavController(requireActivity(), R.id.fragment_container).navigate(
                  MainFragmentDirections.actionMainFragmentToPermissionsFragment()
            )
        }

        view.findViewById<Button>(R.id.button2).setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.fragment_container).navigate(
                MainFragmentDirections.actionMainFragmentToSettings()
            )
        }

        return view
    }


}
