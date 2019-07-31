package gong.team.navigationcomponentsample.ui

import androidx.navigation.NavController
import androidx.navigation.fragment.DialogFragmentNavigator
import androidx.navigation.fragment.NavHostFragment

class NavHostFragmentEx
    : NavHostFragment(){
    override fun onCreateNavController(navController: NavController) {
        super.onCreateNavController(navController)
        navController.navigatorProvider.addNavigator(
            DialogFragmentNavigator(requireContext() , childFragmentManager)
        )
    }
}