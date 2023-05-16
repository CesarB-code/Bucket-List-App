package com.cesarbarrera.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView thingsToDoCard;
    CardView placesToGoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOnClicks();
    }

    public void setOnClicks ()
    {
        thingsToDoCard = findViewById(R.id.card_view_things_to_do);
        placesToGoCard = findViewById(R.id.card_view_places_to_go);

        thingsToDoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thingsActivityIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(thingsActivityIntent);
            }

        });

        placesToGoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placesActivityIntent = new Intent(MainActivity.this, PlacesToGoActivity.class);
                startActivity(placesActivityIntent);
            }
        });
    }

}