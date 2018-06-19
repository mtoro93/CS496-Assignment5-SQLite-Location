package com.example.android.androidui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class GridActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private NumberAdapter mNumberAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        mRecyclerView = (RecyclerView) findViewById(R.id.grid_recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 5);
        mRecyclerView.setLayoutManager(layoutManager);

        mNumberAdapter = new NumberAdapter();
        String numbers [] = new String[25];
        for (int i = 0; i < 25; i++)
            numbers[i] = Integer.toString(i);

        mNumberAdapter.setNumberData(numbers);
        mRecyclerView.setAdapter(mNumberAdapter);

    }
}
