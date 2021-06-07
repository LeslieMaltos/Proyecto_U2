package com.example.proyectou2_17100246

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar


class FragmentCalcular : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calcular, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<RadioButton>(R.id.radDomicilio).setOnClickListener {
            view.findViewById<RadioGroup>(R.id.radioGroup2).visibility = View.VISIBLE;
        }
        view.findViewById<RadioButton>(R.id.btnCalcular).setOnClickListener {
            val Costo : EditText = view.findViewById(R.id.txtCosto)

            if(view.findViewById<RadioButton>(R.id.RadRecoger).isChecked)
            {
                val cos = Costo.text.toString()
                Snackbar.make(view, "Total: " + cos, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
            else
            {
              if(view.findViewById<RadioButton>(R.id.radInfona).isChecked) {
                  val Total : Double = Costo.text.toString().toDouble() + 40

                  Snackbar.make(view, "Total: " + Total.toString(), Snackbar.LENGTH_LONG)
                      .setAction("Action", null).show()
              }
                if(view.findViewById<RadioButton>(R.id.radBenito).isChecked) {
                    val Total : Double = Costo.text.toString().toDouble() + 45

                    Snackbar.make(view, "Total: " + Total.toString(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                }
                if(view.findViewById<RadioButton>(R.id.radCentro).isChecked) {
                    val Total : Double = Costo.text.toString().toDouble() + 50

                    Snackbar.make(view, "Total: " + Total.toString(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                }
                if(view.findViewById<RadioButton>(R.id.radOtro).isChecked) {
                    val Total : Double = Costo.text.toString().toDouble() + 60

                    Snackbar.make(view, "Total: " + Total.toString(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                }
            }
        }
    }
   /* // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calcular, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentCalcular.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentCalcular().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}