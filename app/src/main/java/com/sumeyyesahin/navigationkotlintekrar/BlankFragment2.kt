package com.sumeyyesahin.navigationkotlintekrar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.sumeyyesahin.navigationkotlintekrar.databinding.ActivityMainBinding
import com.sumeyyesahin.navigationkotlintekrar.databinding.FragmentBlank2Binding
import com.sumeyyesahin.navigationkotlintekrar.databinding.FragmentBlankBinding


class BlankFragment2 : Fragment() {

    private lateinit var auth : FirebaseAuth
    private lateinit var binding: FragmentBlank2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        auth= Firebase.auth


    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentBlank2Binding.inflate(layoutInflater)


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)



        val button = view.findViewById<Button>(R.id.button7)
        button.setOnClickListener {
            val action = BlankFragment2Directions.actionBlankFragment2ToBlankFragment()
            Navigation.findNavController(it).navigate(action)



        }
    }

}