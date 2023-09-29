package com.barisgungorr.turkcellapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.barisgungorr.Resimler
import com.barisgungorr.ResimlerAdapter
import com.barisgungorr.turkcellapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    val navHostFragment =
        supportFragmentManager.findFragmentById(R.id.NavHostFragment) as NavHostFragment

        NavigationUI.setupWithNavController(binding.bottomNav,navHostFragment.navController)


    }

}