package com.development.useapi

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MuseumActivity : AppCompatActivity() {

    private lateinit var scaleUp: Animation
    private lateinit var scaleDown: Animation

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_museum)

        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up)
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down)

        button1 = findViewById(R.id.button1)
        button1.setOnClickListener {

        }
        button1.setOnTouchListener { _, motionEvent ->
            handleButtonAnimation(button1, motionEvent)
            false
        }


    }

    private fun handleButtonAnimation(button: Button, motionEvent: MotionEvent) {
        when (motionEvent.action) {
            MotionEvent.ACTION_DOWN -> button.startAnimation(scaleUp)
            MotionEvent.ACTION_UP -> button.startAnimation(scaleDown)
        }
    }


}
