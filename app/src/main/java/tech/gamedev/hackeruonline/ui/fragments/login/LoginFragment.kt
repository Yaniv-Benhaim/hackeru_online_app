package tech.gamedev.hackeruonline.ui.fragments.login

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import tech.gamedev.hackeruonline.R
import tech.gamedev.hackeruonline.databinding.FragmentLoginBinding


class LoginFragment : Fragment(R.layout.fragment_login) {

lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        binding.btnLogin.setOnClickListener {
            signIn()
        }
    }


    private fun signIn() {
        findNavController().navigate(R.id.action_global_to_homeFragment)
    }

}