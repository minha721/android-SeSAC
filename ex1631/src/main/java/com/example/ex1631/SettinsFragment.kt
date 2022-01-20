package com.example.ex1631

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class SettinsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings, rootKey)
    }
}