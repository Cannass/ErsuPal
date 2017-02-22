package com.example.michele.ersupal.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.michele.ersupal.R;
public class StoricoConsumi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storico_consumi);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
