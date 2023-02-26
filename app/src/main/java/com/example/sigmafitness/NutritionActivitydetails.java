package com.example.sigmafitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NutritionActivitydetails extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_activitydetails);

        textView = findViewById(R.id.txt);
        String dstory = getIntent().getStringExtra("story");
        textView.setText(dstory);
    }
}