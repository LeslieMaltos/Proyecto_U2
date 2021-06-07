package com.example.proyectou2_17100246

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar


class Prueba2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prueba, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnirCos).setOnClickListener {
            findNavController().navigate(R.id.action_Prueba2_to_Prueba)
        }
        view.findViewById<Button>(R.id.btnGaleria).setOnClickListener {
            findNavController().navigate(R.id.action_Prueba2_to_btnGaleria)
        }
    }
}