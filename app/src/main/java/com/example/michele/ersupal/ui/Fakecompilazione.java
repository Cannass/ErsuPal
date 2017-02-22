package com.example.michele.ersupal.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.text.TextWatcher;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.michele.ersupal.R;

public class Fakecompilazione extends AppCompatActivity {
    private TextInputLayout inputLayoutName, inputLayoutEmail, inputLayoutPassword;
    private EditText inputName, inputEmail, inputPassword;
    private Button conf,annu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakecompilazione);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        conf = (Button) findViewById(R.id.bntconf);
        annu = (Button) findViewById(R.id.bntannulla);
        final Intent consu = new Intent(Fakecompilazione.this,Moduli_activity.class);


        conf.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Modulo Compilato!",
                        Toast.LENGTH_SHORT).show();
                startActivity(consu);
            }
        });
        annu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                startActivity(consu);
            }
        });

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Spinner sp2 = (Spinner) findViewById(R.id.borse);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> ad = ArrayAdapter.createFromResource(this,
                R.array.borse_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        sp2.setAdapter(ad);

        //inputLayoutName = (TextInputLayout) findViewById(R.id.input_nome);
        //inputName = (EditText) findViewById(R.id.input_nome);



        /*inputName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(final CharSequence s, final int start, final int count, final int after) {

            }

            @Override
            public void onTextChanged(final CharSequence s, final int start, final int before, final int count) {

            }

            @Override
            public void afterTextChanged(final Editable s) {

            }
        });*/



    }


}
