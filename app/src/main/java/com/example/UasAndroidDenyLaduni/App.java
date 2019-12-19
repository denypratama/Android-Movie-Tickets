package com.example.UasAndroidDenyLaduni;

import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

public class App extends android.app.Application {
    private static SharedPreferences preferences;

    @Override
    public void onCreate() {
        super.onCreate();
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
    }

    public static SharedPreferences getPreferences() {
        return preferences;
    }
}
