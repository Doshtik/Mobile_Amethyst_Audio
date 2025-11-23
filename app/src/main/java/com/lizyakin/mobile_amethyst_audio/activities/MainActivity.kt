package com.lizyakin.mobile_amethyst_audio.activities

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.lizyakin.mobile_amethyst_audio.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        try {
            var navController = findNavController(R.id.nav_host_fragment)
            setupBottomNavigation(navController);
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "Navigation error: ${e.message}", Toast.LENGTH_LONG).show()
        }
    }

    private fun setupBottomNavigation(navController: NavController,) {

        findViewById<ImageButton>(R.id.move_to_my_records).setOnClickListener {
            navController.navigate(R.id.myRecordFragment)
        }

        findViewById<ImageButton>(R.id.move_to_search).setOnClickListener {
            navController.navigate(R.id.searchFragment)
        }

        findViewById<ImageButton>(R.id.move_to_library).setOnClickListener {
            navController.navigate(R.id.onlineUserLibraryFragment)
        }

        findViewById<ImageButton>(R.id.move_to_user_profile).setOnClickListener {
            navController.navigate(R.id.userProfileFragment)
        }
    }
}