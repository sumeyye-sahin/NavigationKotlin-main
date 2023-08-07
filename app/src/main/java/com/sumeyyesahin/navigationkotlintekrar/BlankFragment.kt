package com.sumeyyesahin.navigationkotlintekrar

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.sumeyyesahin.navigationkotlintekrar.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {

    private lateinit var auth : FirebaseAuth
    private lateinit var binding: FragmentBlankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(layoutInflater)
        auth= FirebaseAuth.getInstance()

        val name = binding.editText.text.toString()
        val password = binding.editText2.text.toString()

        binding.button.setOnClickListener {
            auth.createUserWithEmailAndPassword(name,password)

        }

        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        val button = view.findViewById<Button>(R.id.button) // button ID'sini kontrol edin
        button.setOnClickListener {
            val action = BlankFragmentDirections.actionBlankFragmentToBlankFragment2("Sahin")
            Navigation.findNavController(it).navigate(action)}


        val singInButton = view.findViewById<Button>(R.id.button4)
            singInButton.setOnClickListener{
                val action2= BlankFragmentDirections.actionBlankFragmentToBlankFragment3()
                Navigation.findNavController(it).navigate(action2)
            }




}}