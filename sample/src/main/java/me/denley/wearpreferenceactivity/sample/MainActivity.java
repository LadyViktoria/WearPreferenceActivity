package me.denley.wearpreferenceactivity.sample;

import android.os.Bundle;

import me.denley.wearpreferenceactivity.preference.WearPreferenceActivity;

public class MainActivity extends WearPreferenceActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }

}
