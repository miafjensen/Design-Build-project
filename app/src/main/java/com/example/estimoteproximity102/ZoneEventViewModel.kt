package com.example.estimoteproximity102

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

import androidx.lifecycle.ViewModel


import com.estimote.proximity_sdk.api.ProximityZoneContext

private const val TAG = "PROXIMITY"

class ZoneEventViewModel: ViewModel() {

    var zoneContexts by mutableStateOf(setOf<ProximityZoneContext>())

    val tag: String get() {
        if (zoneContexts.count() > 0)
            return zoneContexts.first().tag
        else
            return "No zone"
    }

    fun updateZoneContexts(zoneContexts: Set<ProximityZoneContext>) {
        this.zoneContexts = zoneContexts //as Set<ProximityZoneContext>
        Log.d(TAG, "ZONE CONTEXTS: ${zoneContexts.toString()}")
    }
}
