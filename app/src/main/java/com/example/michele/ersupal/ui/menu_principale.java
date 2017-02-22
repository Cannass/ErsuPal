package com.example.michele.ersupal.ui;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
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
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.michele.ersupal.R;

public class menu_principale extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ImageButton ameal,umeal;
    private Button vdbottoner,vdbottonec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principale);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

         vdbottoner = (Button) findViewById(R.id.vdstoricor);
        vdbottoner.setPaintFlags(vdbottoner.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
         vdbottonec = (Button) findViewById(R.id.vdstoricoc);
        vdbottonec.setPaintFlags(vdbottoner.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        final Intent am = new Intent(menu_principale.this,add_meal.class);
        final Intent um = new Intent(menu_principale.this,use_meal.class);
        final Intent rica = new Intent(menu_principale.this,StoricoRicariche.class);
        final Intent consu = new Intent(menu_principale.this,StoricoConsumi.class);


        vdbottoner.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(rica);
            }
        });

        vdbottonec.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(consu);
            }
        });
        ameal = (ImageButton) findViewById(R.id.addmeal);
        ameal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(am);
            }
        });

        umeal = (ImageButton) findViewById(R.id.usemeall);
        umeal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(um);
            }
        });

    }


    public void onClick(View v) {

        if(v==vdbottoner){
            Intent loginIntent = new Intent(this, StoricoRicariche.class);
            this.startActivity(loginIntent);
        }

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
        getMenuInflater().inflate(R.menu.menu_principale, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.moduli) {
            Intent menuintent = new Intent(this, Moduli_activity.class);
            this.startActivity(menuintent);
        } else if (id == R.id.news) {
            Intent menuintent = new Intent(this, News_activity.class);
            this.startActivity(menuintent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
