package com.marin.dogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = findNavController(R.id.nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                 R.id.nav_welcome_fragment ->  supportActionBar?.hide()
                 R.id.nav_dog_fragment ->  supportActionBar?.hide()
                 R.id.nav_detalle_dog_fragment ->  supportActionBar?.hide()
              /*  R.id.nav_welcome_fragment -> supportActionBar?.hide() // to hide
                else -> supportActionBar?.show() // to show*/

            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}