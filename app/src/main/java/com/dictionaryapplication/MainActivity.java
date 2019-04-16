package com.dictionaryapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final String countries[]={"Nepal","kathmandu","China","beijing","USA","washington","UK","london"};
    private Map<String,String> dictionary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView stCountries =findViewById(R.id.stCountries);
        dictionary =new HashMap<>();
        for(int i=0; 1<countries.length; i+=2){
            dictionary.put(countries[i],countries[i+1]);
        }

        ArrayAdapter countriesAdapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,
                new ArrayList(dictionary.keySet())
        );
      stCountries.setAdapter(countriesAdapter);
stCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        String countries=parent.getItemAtPosition(position).toString();
        String capital=dictionary.get(countries);

        Intent intent=new Intent(MainActivity.this, CapitalActivity.class);
        intent.putExtra("countries",capital);
        startActivity(intent);
    }
});


    }
}
