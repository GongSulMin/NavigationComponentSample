package gong.team.navigationcomponentsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_bottom_main.*

class BottomMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_main)

        bottom_navigation.setupWithNavController(Navigation.findNavController(this ,R.id.bottom_nav_host_fragment))
    }
}