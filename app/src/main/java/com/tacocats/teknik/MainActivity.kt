package com.tacocats.teknik

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_paste -> {
                message.setText(R.string.title_service_paste)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_upload -> {
                message.setText(R.string.title_service_upload)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_url_shortening -> {
                message.setText(R.string.title_service_url_shortening)
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
