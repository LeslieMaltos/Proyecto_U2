package com.example.proyectou2_17100246

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            val Usuario = view.findViewById<EditText>(R.id.idUsuario);
            val Password = view.findViewById<EditText>(R.id.idPassword);

            val Usu = Usuario.text.toString();
            val Pass = Password.text.toString();


            if(Usu == "Leslie" && Pass == "123")
            {
                findNavController().navigate(R.id.action_SecondFragment_to_Calcular)
            }
            else {
                val text = "Contraseña o Usuario Incorrectos!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(context, text, duration)
                toast.show()
            }
        }
    }
}