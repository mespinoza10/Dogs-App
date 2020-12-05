package com.marin.dogapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.marin.dogapp.R
import com.marin.dogapp.entity.DogEntity
import kotlinx.android.synthetic.main.detalle_dog_fragment.*

class DetalleDogFragment : Fragment() {

    private lateinit var dogEntity: DogEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireArguments().let {
            dogEntity = it.getParcelable("dogEntity")!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detalle_dog_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    fun initView(){
        toolbar.setNavigationIcon(R.drawable.ic_back);
        txtRaza.text = dogEntity.raza
        txtDescipcion.text = dogEntity.descripcion
        txtTamanio.text = dogEntity.tamanio
        txtRangoEdad.text = dogEntity.rangoEdad
        txtEspecialidad.text = dogEntity.especialidad
        imgDog.setImageResource(dogEntity.imagen);
        root.setBackgroundColor(ContextCompat.getColor(requireContext(), dogEntity.background))

        toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
    }
}