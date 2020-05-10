package com.example.mobileaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button CompassButton;
    private Button LocationButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CompassButton = (Button) findViewById(R.id.compasBut);
        CompassButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCompassApp();
            }
        });

        LocationButton = (Button) findViewById(R.id.locateBut);
        LocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocationApp();
            }
        });
    }

    public void openCompassApp(){
        Intent intent = new Intent(this, Compas.class);
        startActivity(intent);
    }

    public void openLocationApp(){
        Intent intent = new Intent(this, GoogleMapsLocation.class);
        startActivity(intent);
    }
}
