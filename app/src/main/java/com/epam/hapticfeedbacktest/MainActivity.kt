package com.epam.hapticfeedbacktest

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.HapticFeedbackConstants.*
import android.view.MotionEvent
import android.view.MotionEvent.ACTION_DOWN
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun performHapticFeedbackOnTouch(
            feedbackConstantId: Int,
            view: View,
            motionEvent: MotionEvent
        ): Boolean {
            if (motionEvent.action == ACTION_DOWN) {
                return view.performHapticFeedback(feedbackConstantId)
            }
            return false
        }

        findViewById<Button>(R.id.button1).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(CONFIRM, view, motionEvent)
        }

        findViewById<Button>(R.id.button2).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(VIRTUAL_KEY, view, motionEvent)
        }

        findViewById<Button>(R.id.button3).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(KEYBOARD_TAP, view, motionEvent)
        }

        findViewById<Button>(R.id.button4).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(LONG_PRESS, view, motionEvent)
        }

        findViewById<Button>(R.id.button5).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(REJECT, view, motionEvent)
        }

        findViewById<Button>(R.id.button6).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(GESTURE_START, view, motionEvent)
        }

        findViewById<Button>(R.id.button7).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(FLAG_IGNORE_VIEW_SETTING, view, motionEvent)
        }

        findViewById<Button>(R.id.button8).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(GESTURE_END, view, motionEvent)
        }

        findViewById<Button>(R.id.button9).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(CLOCK_TICK, view, motionEvent)
        }

        findViewById<Button>(R.id.button10).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(FLAG_IGNORE_GLOBAL_SETTING, view, motionEvent)
        }

        findViewById<Button>(R.id.button11).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(VIRTUAL_KEY_RELEASE, view, motionEvent)
        }

        findViewById<Button>(R.id.button12).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(TEXT_HANDLE_MOVE, view, motionEvent)
        }

        findViewById<Button>(R.id.button13).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(KEYBOARD_PRESS, view, motionEvent)
        }

        findViewById<Button>(R.id.button14).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(KEYBOARD_RELEASE, view, motionEvent)
        }

        findViewById<Button>(R.id.button15).setOnTouchListener { view, motionEvent ->
            performHapticFeedbackOnTouch(CONTEXT_CLICK, view, motionEvent)
        }

    }
}