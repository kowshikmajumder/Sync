package com.km.dell.sync;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;


public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);





        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = df.format(c.getTime());

        getSupportActionBar().setTitle(formattedDate);


        RecyclerView rv = (RecyclerView)findViewById(R.id.programming);
        rv.setLayoutManager(new LinearLayoutManager(this));
        String[][] l ={{"JAVA","Rollla","Date","99%","0"},{"C","Rolllabf","Dateddd","999%","0"},
                {"R","Rolllddha","Datehh","99%","0"}, {"C++","Rolllasgr","Datesty","99efe%","0"},
                {"Python","Rolllawet","Darwrte","99fe%","0"},{"Javascript","Rollla","Date","99%","0"},
                {"html","Rollla","Date","99%","0"},{"CSS","Rollla","Date","99%","0"},{"php","Rollla","Date","99%","0"},
                {"C#","Rollla","Date","99%","0"}, {"assemble","Rollla","Date","99%","0"},{"go","Rollla","Date","99%","0"},
                {"Kotlin","Rollla","Date","99%","0"}, {"ABC","Rollla","Date","99%","0"},
                {"swift","Rollla","Date","99%","0"}};
        pAdapter adapter =new pAdapter(Activity2.this,l);
        rv.setAdapter(adapter);
        /*final int totalSudents = adapter.totalSudents;
        CheckBox checkBox =(CheckBox)findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(totalSudents);
            }
        });
*/










    }







    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }




/*
    public void changeText(int n){
       TextView totalStudentsTV =(TextView)findViewById(R.id.TotalPresentTV);
       totalStudentsTV.setText("Totol present students ="+n);
    }*/



}


