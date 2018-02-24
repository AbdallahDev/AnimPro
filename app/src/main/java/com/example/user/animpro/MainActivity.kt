package com.example.user.animpro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var am=AnimationUtils.loadAnimation(this,
                R.anim.blink)
        imageView.startAnimation(am)


    }
}
