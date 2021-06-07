package com.example.proyectou2_17100246

import android.os.Bundle
import android.text.Editable
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.*
import androidx.core.text.set
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import android.view.Menu
import android.view.MenuItem

class Prueba : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prueba, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnCal).setOnClickListener {
            val Costo : EditText = view.findViewById<EditText>(R.id.txtCostoC);
            var Cos : Double = Costo.text.toString().toDouble()
            if(view.findViewById<CheckBox>(R.id.chkDom).isChecked)
            {
                Cos = Cos + 40

            }
            if(view.findViewById<CheckBox>(R.id.chkRegalo).isChecked)
            {
                Cos = Cos + 30
            }
            Snackbar.make(view, "Total: " + Cos.toString(), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        view.findViewById<Button>(R.id.btnRegresar).setOnClickListener {
            findNavController().navigate(R.id.action_Prueba_to_Prueba2)
        }
    }
}