package com.example.jetpak

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetpak.databinding.FragmentSecretBinding


class SecretFragment  : Fragment(R.layout.fragment_secret){

    private lateinit var binding: FragmentSecretBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecretBinding.bind(view)
        binding.closeBoxButton.setOnClickListener {
            findNavController().popBackStack(R.id.rootFragment, false)

        }
        binding.goBackButton.setOnClickListener {
            findNavController().popBackStack()
        }
    }
    }
