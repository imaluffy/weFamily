package com.example.wefamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener(){

            if(it.itemId==R.id.nav_security) {
                inflateFragment(GuardFragment.newInstance())
            }else if(it.itemId==R.id.nav_home){
                inflateFragment(HomeFragment.newInstance())
            }

            true
        }
    }



    private fun inflateFragment(newInstance: Fragment) {
       val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, newInstance)
        transaction.commit()
    }
}