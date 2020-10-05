package com.example.recycleviewwords;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.assignment4.R;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private final LinkedList<String> descList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWordList.addLast("Khoresh Bademjan");
        mWordList.addLast("Piñon");
        mWordList.addLast("Tofu With Soy-Butter Corn");
        mWordList.addLast("Chicken Tomato Pulao");
        mWordList.addLast("Aloo Paratha");
        mWordList.addLast("Peras con Alguashte");


        descList.addLast("This Persian stew of tomatoes and spiced eggplant is typically made with lamb or beef, but it’s faster and just as savory without meat. If you’re using dried limes, puncture them with a knife to further release their unique tangy and musky flavor into the stew. Lime juice isn’t a perfect substitute, but it adds a hit of much-needed, brightening acidity.");
        descList.addLast("This cheesy layered casserole is often compared to lasagna, but the flavors couldn’t be more different. Ground beef is simmered with soffritto and tomato, then studded with raisins and olives to make a picadillo. Layered with mozzarella and fried sweet plantains and baked, it makes the ultimate sweet- and-savory mash-up. ");
        descList.addLast("The combination of corn, soy, and butter is as delicious as it is classic. As Hiroko Shimbo writes in her book *Hiroko’s American Kitchen*, corn and butter are a common pair in Hokkaido, the northernmost island of Japan, where both are produced.");
        descList.addLast("A classic yakhni pulao is meticulously prepared by simmering basmati rice in an aromatic chicken, lamb, or goat broth. In this version, chicken thighs are simmered in a spiced tomato base along with rice and whole spices like cinnamon and bay leaf. ");
        descList.addLast("If making bread has long intimidated you, start here. Parathas come in many shapes, textures, and flavors across Asia—they are perfect for dipping into dals and stews or eating alongside assorted condiments. ");
        descList.addLast("In the fall, crisp peak-season pears or apples are an undeniably delicious way to enjoy this refreshing fruit salad with a nutty Salvadoran seasoning.");
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mWordList, descList);
      // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
      // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}