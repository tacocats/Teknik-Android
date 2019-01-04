package com.tacocats.teknik

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ViewFlipper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        val viewFlipper : ViewFlipper = main_view_flipper

        when (item.itemId) {
            R.id.navigation_home -> {
                viewFlipper.displayedChild = 0
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_paste -> {
                viewFlipper.displayedChild = 1
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_upload -> {
                viewFlipper.displayedChild = 2
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_url_shortening -> {
                viewFlipper.displayedChild = 3
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
