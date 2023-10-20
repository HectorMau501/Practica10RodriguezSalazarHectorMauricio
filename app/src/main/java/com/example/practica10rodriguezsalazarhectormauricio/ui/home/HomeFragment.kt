package com.example.practica10rodriguezsalazarhectormauricio.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.practica10rodriguezsalazarhectormauricio.R
import com.example.practica10rodriguezsalazarhectormauricio.WebViewActivity
import com.example.practica10rodriguezsalazarhectormauricio.databinding.FragmentHomeBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_home, container, false)//Importante

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        val btnWeb = view?.findViewById<FloatingActionButton>(R.id.btnWeb)
        btnWeb?.setOnClickListener { v ->
            Web()
        }


        return view //Importante
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun Web(){
        val intent = Intent(requireContext(), WebViewActivity::class.java)
        startActivity(intent)
    }
}//class