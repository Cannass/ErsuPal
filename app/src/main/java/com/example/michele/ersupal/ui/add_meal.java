package com.example.michele.ersupal.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.widget.TextView;

import com.example.michele.ersupal.R;
import com.example.michele.ersupal.ui.CustomListAdapter.CustomListAdapter;


public class add_meal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private static final int MINVALUE = 5;
    private static final int MAXVALUE = 35;
    private CoordinatorLayout coordinatorLayout;
    private Button btnSimpleSnackbar, btnActionCallback, btnCustomView;

    EditText text, tot;
    ImageButton plusButton, minusButton, confirm, delete;
    int valueModel = 5;
    private static final double cost = 2.1;
    private double val;
    private String s;
    Context ctx = null;
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meal);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id
                .coordinatorLayout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        text = (EditText) findViewById(R.id.textpasti);
        tot = (EditText) findViewById(R.id.totale);
        plusButton = (ImageButton) findViewById(R.id.plusButton);
        minusButton = (ImageButton) findViewById(R.id.minusButton);
        confirm = (ImageButton) findViewById(R.id.confirm);
        delete = (ImageButton) findViewById(R.id.cancel);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ctx = getApplication();

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateValue(valueModel + 1);
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateValue(valueModel - 1);
            }
        });
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pagamentoeffettuato(true);
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pagamentoeffettuato(false);
            }
        });


    }


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
        getMenuInflater().inflate(R.menu.add_meal, menu);
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

        if (id == R.id.ahome) {
            Intent addIntent = new Intent(this, menu_principale.class);
            this.startActivity(addIntent);
        } else if (id == R.id.anews) {
            Intent addIntent = new Intent(this, News_activity.class);
            this.startActivity(addIntent);
        } else if (id == R.id.amoduli) {
            Intent addIntent = new Intent(this, Moduli_activity.class);
            this.startActivity(addIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void updateValue(int newValue) {
        newValue = newValue > MAXVALUE ? MAXVALUE : newValue;
        newValue = newValue < MINVALUE ? MINVALUE : newValue;
        // ora siamo sicuri che newValue sia nel range
        if(newValue == 35){
            Toast.makeText(getApplicationContext(), "Numero pasti massimo ricaricabili 35",
                    Toast.LENGTH_SHORT).show();;
        }
        if(newValue == 5){
            Toast.makeText(getApplicationContext(), "Numero minimo pasti ricaribili 5",
                    Toast.LENGTH_SHORT).show();;
        }
        this.valueModel = newValue;
        this.text.setText("" + valueModel);
        val = valueModel * cost;
        s = String.format("%.2f€", val);
        this.tot.setText("" + s);
        //if(this.seekBar.getProgress() != valueModel - MINVALUE) {
        //  this.seekBar.setProgress(valueModel - MINVALUE);
        //}

        // disabilito il click sul bottone della divisione nel caso il valore
        // che si otterrebbe dalla divisione fosse fuori dal range consentito


        // disabilito il click sul bottone della moltiplicazione nel caso il valore
        // che si otterrebbe fosse fuori dal range consentito


    }

    public void pagamentoeffettuato(boolean var) {
        if (var) {
            try {

                Thread.sleep(750);
                Toast.makeText(getApplicationContext(), "Pagamento effettuato!",
                        Toast.LENGTH_SHORT).show();
                Intent loginIntent = new Intent(this, menu_principale.class);
                this.startActivity(loginIntent);
                // Do some stuff
            } catch (Exception e) {
                e.getLocalizedMessage();
            }


        } else {
            Intent loginIntent = new Intent(this, menu_principale.class);
            this.startActivity(loginIntent);
        }

    }

    ;
}

