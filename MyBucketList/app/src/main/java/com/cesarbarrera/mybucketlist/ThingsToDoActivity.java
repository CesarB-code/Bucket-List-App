package com.cesarbarrera.mybucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDoActivity extends AppCompatActivity {
    private Item[] items = {

            new Item("Learn to Play Piano", "I would like to one day learn how to play the piano so I can play my favorite songs", R.drawable.jordan_whitfield_bhfe1igcsa8_unsplash),
            new Item("Learn to Draw", "I would like to learn how to draw so I can be able to draw my life as I live it ", R.drawable.sincerely_media_s3tpywnslso_unsplash),
            new Item("Learn to Make Video Games", "I would like to learn how to make video games so I can be able to make people smile and happy", R.drawable.ivan_rudoy_h1czghdhsay_unsplash),
            new Item("Learn Spanish", "I would like to learn how to speak , read and write spanish better so I can be able to talk with my family better and navigate Spain on my own", R.drawable.jon_tyson_8mmtym_3xmy_unsplash),
            new Item("Learn Japanese", "I would like to learn how to speak , read and write japanese so I can be able to visit Japan without needing help to read signs in Japan ", R.drawable.nagara_oyodo_xpo6jjdqday_unsplash)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setUpList();
    }

    public void setUpList() {




        RecyclerView itemList = findViewById(R.id.recycler_view_list);

        ItemAdapter adapter = new ItemAdapter(items);
        itemList.setAdapter(adapter);
    }

}
