package gong.team.navigationcomponentsample.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import gong.team.navigationcomponentsample.R
import gong.team.navigationcomponentsample.data.Person
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment
    : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main , container , false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_to_detail.setOnClickListener {
            Person("gong", "서울")

//                        var bundle = bundleOf("name" to "gong")
//                        findNavController().navigate(R.id.action_main_fragment_to_detail_fragment , bundle)

            val directions = MainFragmentDirections.actionMainFragmentToDetailFragment()
            directions.name = "gong"
            findNavController().navigate(directions)
//            findNavController().navigate(R.id.action_main_fragment_to_detail_fragment)


////            findNavController().navigate(R.id.action_main_fragment_to_detail_fragment)

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