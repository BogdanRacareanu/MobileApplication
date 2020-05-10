package com.example.mobileaplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMapsLocation extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps_location);

        SupportMapFragment mapFragmet = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragmet.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng Craiova = new LatLng(44.319748, 23.801912);
        map.addMarker(new MarkerOptions().position(Craiova).title("Craiova"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Craiova));
    }
}
