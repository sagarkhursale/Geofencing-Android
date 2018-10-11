package com.sagar.geofencing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mAddGeofenceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddGeofenceButton = findViewById(R.id.add_geofences_button);

        //
    }


    public void addGeofencesButtonHandler(View view) {
    }


    // END
}
