package com.anwesh.uiprojects.linkedarrowfrombottomview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.arrowfrombottomview.ArrowFromBottomView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ArrowFromBottomView.create(this)
    }
}
