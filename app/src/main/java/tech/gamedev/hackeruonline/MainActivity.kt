package tech.gamedev.hackeruonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setupWithNavController(fragment.findNavController())

        fragment.findNavController()
            .addOnDestinationChangedListener { _, destination, _ ->

                when(destination.id) {
                    R.id.homeFragment,
                    R.id.lessonsFragment,
                    R.id.homeworkFragment,
                    R.id.projectsFragment,
                    R.id.settingsFragment -> {
                        bottomNavigation.isVisible = true
                    }
                    else -> bottomNavigation.isVisible = false

                }

            }
    }
}