package com.aculuis.gradosjimmyparcial.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.aculuis.gradosjimmyparcial.R


class HomeFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val btnCalcular: Button = view.findViewById(R.id.btnCalcular)
        val etIngresoFijo: EditText = view.findViewById(R.id.etIngresoFijo)
        val etGastoFijo: EditText = view.findViewById(R.id.etGastoFijo)
        val etGastoVariable: EditText = view.findViewById(R.id.etGastoVariable)
        val txtResult: TextView = view.findViewById(R.id.tvResult)


        btnCalcular.setOnClickListener {

            val ctIngresoFijo = etIngresoFijo.text.toString().toDouble()
            val ctGastoFijo = etGastoFijo.text.toString().toDouble()
            val ctGastoVariable = etGastoVariable.text.toString().toDouble()

            val resultado = ctIngresoFijo - (ctGastoFijo + ctGastoVariable)

            txtResult.text = "$resultado USD"
        }

        return view
    }
}