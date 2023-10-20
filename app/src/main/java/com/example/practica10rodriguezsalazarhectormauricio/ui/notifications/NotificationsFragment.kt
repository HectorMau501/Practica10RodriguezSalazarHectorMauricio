package com.example.practica10rodriguezsalazarhectormauricio.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.practica10rodriguezsalazarhectormauricio.R
import com.example.practica10rodriguezsalazarhectormauricio.databinding.FragmentNotificationsBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var calendario: CalendarView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val view: View = binding.root

        val textView: TextView = binding.textNotifications
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        name = view.findViewById(R.id.editNombre)
        email = view.findViewById(R.id.editNombre)



        val btnAgregar = view?.findViewById<FloatingActionButton>(R.id.btnAgregar)
        btnAgregar?.setOnClickListener { v ->
            agregar()
        }

        return view
    }

    private fun agregar() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}