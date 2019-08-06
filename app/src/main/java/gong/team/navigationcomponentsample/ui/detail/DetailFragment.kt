package gong.team.navigationcomponentsample.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import gong.team.navigationcomponentsample.R
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment
    : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail , container , false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_to_main_back_popbackstack.text = arguments?.getString("name")

        arguments?.let {
            btn_to_main_back_popbackstack.text = DetailFragmentArgs.fromBundle(it).name
        }

        btn_to_main_back_navigateup.setOnClickListener {
            // 이전 화면
            findNavController().navigateUp()
//            findNavController().navigate(R.id.action_to_main)
        }

        btn_to_main_back_popbackstack.setOnClickListener {
            findNavController().popBackStack()
        }

        btn_to_specific_destination.setOnClickListener {
            // true 하면 spalsh 화면으로감 ??
            findNavController().popBackStack(R.id.main_fragment , true)
        }
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }

}