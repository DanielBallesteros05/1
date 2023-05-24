package com.catalogodetienda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.catalogodetienda.databinding.FragmentTiendaBinding
import java.util.*

/**
 * A simple [Fragment] subclass.
 * Use the [TiendaFragment.newInstance] factory method t
 * create an instance of this fragment.
 */

class TiendaDetailFragment: Fragment(){

    private lateinit var binding: FragmentTiendaBinding
    private lateinit var tienda: Tienda
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tienda= Tienda(
             UUID.randomUUID(),
            "Abarrotes Ballesteros",
            "3322554477"
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            FragmentTiendaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}

