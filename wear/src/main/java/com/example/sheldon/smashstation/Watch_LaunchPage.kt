package com.example.sheldon.smashstation

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class Watch_LaunchPage : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watch__launch_page)

        // Enables Always-on
        setAmbientEnabled()
    }
}
