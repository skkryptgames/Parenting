package com.example.parenting.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.parenting.adapters.HomeScreenAdapter;
import com.example.parenting.models.HomeScreenModel;
import com.example.parenting.R;

import java.util.ArrayList;

public class HomeScreenActivity extends AppCompatActivity {

    private ImageView coins;
    private TextView count;
    private ImageView boy;
    private RecyclerView recycler_activities;
    private ArrayList<HomeScreenModel> activities = new ArrayList<>();
    private HomeScreenAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        coins = (ImageView) findViewById(R.id.coins);
        count = (TextView) findViewById(R.id.count);
        boy = (ImageView) findViewById(R.id.boy);
        recycler_activities = findViewById(R.id.recycler_activities);
        recycler_activities.setHasFixedSize(true);
        recycler_activities.setLayoutManager(new LinearLayoutManager(this));


       activities.add(new HomeScreenModel(R.drawable.ic_swing, "PLAY"));
       activities.add(new HomeScreenModel(R.drawable.ic_abacus, "LEARN"));
       activities.add(new HomeScreenModel(R.drawable.ic_apple, "EAT"));
       activities.add(new HomeScreenModel(R.drawable.ic_piggy_bank, "SPEND"));

       HomeScreenAdapter mAdapter = new HomeScreenAdapter(this, activities);
       recycler_activities.setAdapter(mAdapter);


    }
}
