package com.cesarbarrera.mybucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivity extends AppCompatActivity {


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

        Item[] items = {

                new Item("Japan, Tokyo", "I would like to go to Japan so I can explore Tokyo", R.drawable.takashi_miyazaki_64ajtpezlyc_unsplash),
                new Item("Italy ,Rome", "I would like to go to Italy so I can try the food in Rome and visit historic buildings ", R.drawable.david_kohler_vfrtxgw1vju_unsplash),
                new Item("France, Paris", "I would like to go to France so I can eat the french food in Paris ", R.drawable.earth_dxuxhw3s5ak_unsplash),
                new Item("Spain , Barcelona", "I would like to go to Spain so I can have adventures in Barcelona and discover where my ancestors came from", R.drawable.jonas_hoss_p0r8r5is6aa_unsplash),
                new Item("New Zealand, Hobbiton ", "I would like to go to New Zealand in order to see the areas where The Lord of the Rings  movies were filmed", R.drawable.zac_smith_nuktwyvvs50_unsplash)
        };


        RecyclerView itemList = findViewById(R.id.recycler_view_list);

        ItemAdapter adapter = new ItemAdapter(items);
        itemList.setAdapter(adapter);
    }


}
