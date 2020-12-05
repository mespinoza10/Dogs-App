package com.marin.dogapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.marin.dogapp.R
import com.marin.dogapp.Utilitary
import com.marin.dogapp.entity.DogEntity
import com.marin.dogapp.ui.adapter.DogAdapter
import kotlinx.android.synthetic.main.fragment_dogs.*

class DogsFragment : Fragment(), DogAdapter.OnDogClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dogs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyClerView()
        loadDogs()
    }

    private fun setupRecyClerView() {
        rv_dog.layoutManager = LinearLayoutManager(requireContext())
        // rv_dog.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
    }

    private fun loadDogs() {
        rv_dog.adapter = DogAdapter(requireContext(), Utilitary.getListOfDogs(), this)
    }

    override fun OnDogClick(dogEntity: DogEntity, position: Int) {
        val bundle =  Bundle()
        bundle.putParcelable("dogEntity",dogEntity)
        findNavController().navigate(R.id.nav_detalle_dog_fragment,bundle)
    }
}