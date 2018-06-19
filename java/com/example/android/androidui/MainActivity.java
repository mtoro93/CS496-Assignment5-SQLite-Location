package com.example.android.androidui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button horizontalButton = (Button) findViewById(R.id.horizontal_button);
        horizontalButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent horizontalIntent = new Intent(MainActivity.this, HorizontalActivity.class);
                startActivity(horizontalIntent);
            }
        });
        Button gridButton = (Button) findViewById(R.id.grid_button);
        gridButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent gridIntent = new Intent(MainActivity.this, GridActivity.class);
                startActivity(gridIntent);
            }
        });
        Button relativeButton = (Button) findViewById(R.id.relative_button);
        relativeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent relativeIntent = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(relativeIntent);
            }
        });
        Button constraintButton = (Button) findViewById(R.id.constraint_button);
        constraintButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent constraintIntent = new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(constraintIntent);
            }
        });
    }
}
