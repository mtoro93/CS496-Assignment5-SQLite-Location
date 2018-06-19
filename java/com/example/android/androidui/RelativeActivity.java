package com.example.android.androidui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RelativeActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private NumberAdapter mNumberAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        mRecyclerView = (RecyclerView) findViewById(R.id.relative_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        mNumberAdapter = new NumberAdapter();
        String numbers [] = new String[10];
        for (int i = 0; i < 10; i++)
            numbers[i] = Integer.toString(i);

        mNumberAdapter.setNumberData(numbers);
        mRecyclerView.setAdapter(mNumberAdapter);
    }
}
