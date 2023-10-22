package com.example.practica10rodriguezsalazarhectormauricio.ui.dashboard

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.os.postDelayed
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.practica10rodriguezsalazarhectormauricio.Producto
import com.example.practica10rodriguezsalazarhectormauricio.R
import com.example.practica10rodriguezsalazarhectormauricio.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    private lateinit var barra: ProgressBar


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val view: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        barra = view.findViewById(R.id.pbCircular)
        barra.max = 300
        barra.progress = 0

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Detalle
        var nombre: String = ""
        var precio: Int = 0
        var intent: Intent

        binding.imagen.setOnClickListener {

            binding.pbCircular.visibility = View.VISIBLE

            val handler = Handler()
            handler.postDelayed({
                nombre = "Herramientas. Llaves para automovil"
                precio = 1000
                intent = Intent(requireContext(), Producto::class.java)
                intent.putExtra("nombre",nombre)
                intent.putExtra("precio",precio)
                intent.putExtra("numImagen",1)
                startActivity(intent)
                binding.pbCircular.visibility = View.GONE
            }, 4000)
        }

        binding.imagen2.setOnClickListener {

            binding.pbCircular.visibility = View.VISIBLE

            val handler2 = Handler()
            handler2.postDelayed({
                nombre = "Tennis Jordan"
                precio = 6500
                intent = Intent(requireContext(), Producto::class.java)
                intent.putExtra("nombre", nombre)
                intent.putExtra("precio", precio)
                intent.putExtra("numImagen", 2)
                startActivity(intent)
                binding.pbCircular.visibility = View.GONE
            },4000)
        }

        binding.imagen3.setOnClickListener {

            binding.pbCircular.visibility = View.VISIBLE

            val handler3 = Handler()
            handler3.postDelayed({
                nombre = "iPhone 12"
                precio = 10000
                intent = Intent(requireContext(), Producto::class.java)
                intent.putExtra("nombre",nombre)
                intent.putExtra("precio",precio)
                intent.putExtra("numImagen",3)
                startActivity(intent)
                binding.pbCircular.visibility = View.GONE

            },4000)
        }

        binding.imagen4.setOnClickListener {
            binding.pbCircular.visibility = View.VISIBLE

            val handler4 = Handler()
            handler4.postDelayed({
                nombre = "Playeras"
                precio = 350
                intent = Intent(requireContext(), Producto::class.java)
                intent.putExtra("nombre",nombre)
                intent.putExtra("precio",precio)
                intent.putExtra("numImagen",4)
                startActivity(intent)
                binding.pbCircular.visibility = View.GONE

            },4000)
        }

        binding.imagen5.setOnClickListener {

            binding.pbCircular.visibility = View.VISIBLE

            val handler5 = Handler()
            handler5.postDelayed({
                nombre = "Sala"
                precio = 20000
                intent = Intent(requireContext(), Producto::class.java)
                intent.putExtra("nombre",nombre)
                intent.putExtra("precio",precio)
                intent.putExtra("numImagen",5)
                startActivity(intent)
                binding.pbCircular.visibility = View.GONE

            },4000)
        }

        binding.imagen6.setOnClickListener {
            binding.pbCircular.visibility = View.VISIBLE

            val handler6 = Handler()
            handler6.postDelayed({
                // Código que se ejecutará después del retraso (5 segundos)
                nombre = "Muñecos de Mario bros"
                precio = 500
                intent = Intent(requireContext(), Producto::class.java)
                intent.putExtra("nombre", nombre)
                intent.putExtra("precio", precio)
                intent.putExtra("numImagen", 6)
                startActivity(intent)
                binding.pbCircular.visibility = View.GONE
            }, 4000)
        }
    }//onCreate
}//class