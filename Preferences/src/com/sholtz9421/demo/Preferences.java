package com.sholtz9421.demo;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.util.Log;

public class Preferences extends PreferenceActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// basic initialization; 
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
        
        // log to console;
        Log.v(Model.TAG,"*** Starting App [" + Model.TAG + "]");
    }
}