package com.example.sigmafitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class NutritionActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        String[] tstory = getResources().getStringArray(R.array.title_array);
        final String[] dstory = getResources().getStringArray(R.array.detailed_story);


        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.row,R.id.rowtxt,tstory);
        listView.setAdapter(adapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String t  = dstory[position];
                Intent intent = new Intent(NutritionActivity.this,NutritionActivitydetails.class);
                intent.putExtra("story",t);
                startActivity(intent);
                finish();

            }
        });

    }
}