package com.endava.lencedu.locationtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TrackDetailsActivity extends AppCompatActivity {


    public void addLocation(View view) {

        Intent intent = new Intent(this, AddLocationActivity.class);
        startActivity(intent);
    }

    public void done(View view) {

        Intent intent = new Intent(this, MyTracksActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_details);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String desc = intent.getStringExtra("description");

        TextView title = (TextView) findViewById(R.id.nameTitle);
        title.setText(name);

        TextView subtitle = (TextView) findViewById(R.id.descSubtitle);
        subtitle.setText(desc);
    }
}
