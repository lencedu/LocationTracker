package com.endava.lencedu.locationtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewTrackActivity extends AppCompatActivity {


    public void startTrack(View view) {
        Intent intent = new Intent(this, TrackDetailsActivity.class);

        EditText trackName = (EditText) findViewById(R.id.trackName);
        intent.putExtra("name", trackName.getText().toString());

        EditText trackDescription = (EditText) findViewById(R.id.trackDescription);
        intent.putExtra("description", trackDescription.getText().toString());

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_track);
    }
}
