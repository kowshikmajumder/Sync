package com.km.dell.sync;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);






        RecyclerView rv = (RecyclerView)findViewById(R.id.Courses);
        rv.setLayoutManager(new LinearLayoutManager(this));
        String[][] l ={{"AAAAAAAAAA","1111111"},{"BBBBBBBBBBB","222222222222"},{"CCCCCCCCCCCCCCCCC","33333333333"}};
        rv.setAdapter(new courseAdapter(l));















        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.setting) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.refresh) {
            Toast.makeText(MainActivity.this,
                    "Refresh", Toast.LENGTH_LONG).show();// Handle the camera action
        } else if (id == R.id.SaveN) {
            Toast.makeText(MainActivity.this,
                    "Saved", Toast.LENGTH_LONG).show();
        } else if (id == R.id.ToPdf) {
            Toast.makeText(MainActivity.this,
                    "ToPdf", Toast.LENGTH_LONG).show();
        } else if (id == R.id.setting) {
            Toast.makeText(MainActivity.this,
                    "Setting", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_share) {
            Toast.makeText(MainActivity.this,
                    "Share", Toast.LENGTH_LONG).show();


            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, "This text was send using the Tour share button "
                    +
                    "\nNow we can share our app or location or google map location.\n MAYBE " );
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent, "Send To"));

        }
        else
        {
            Toast.makeText(MainActivity.this,
                    "Not Sure", Toast.LENGTH_LONG).show(); }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void OpenActivityTwoMedoth(){

        Intent intent=new Intent(this,Activity2.class);
        startActivity(intent);
    }




}
