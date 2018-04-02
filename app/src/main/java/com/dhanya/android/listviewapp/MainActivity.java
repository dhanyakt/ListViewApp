package com.dhanya.android.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> chochlates = new ArrayList<String>();
        chochlates.add("Dairy Milk");
        chochlates.add("Lindt");
        chochlates.add("TobblerOne");
        chochlates.add("Brookside");
        chochlates.add("Godiva");

        ListView chochlateListView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,chochlates);
        chochlateListView.setAdapter(adapter);
    }
}
