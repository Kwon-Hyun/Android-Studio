package com.example.mynavapplication_11week

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mynavapplication_11week.databinding.FragmentResultBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {

    private var mbtiResult: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            mbtiResult = it.getString("MBTI")
        }
    }

    var binding : FragmentResultBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.txtResult?.text = mbtiResult
        binding?.btnReexamine?.setOnClickListener {
            findNavController().navigate(R.id.action_resultFragment_to_examineFragment)
        }
    }
}