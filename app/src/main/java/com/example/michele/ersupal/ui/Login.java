package com.example.michele.ersupal.ui;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.michele.ersupal.R;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private Button login;
    private EditText name, password;

    //private TextView msg, NameOut, DateOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login_b);
        login.setOnClickListener(this);
        name = (EditText) findViewById(R.id.utente);
        password = (EditText) findViewById(R.id.password);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        name.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {name.getText().clear();
            }
        });

        password.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {password.getText().clear();
            }
        });




    }


    @Override
    public void onClick(View v) {


        if (v == login) {
            if (name.getText().toString().isEmpty() && password.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Non hai inserito nulla",
                        Toast.LENGTH_SHORT).show();
            }
            else if (password.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Non hai inserito una password",
                        Toast.LENGTH_SHORT).show();
            }
            else if (name.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Non hai inserito un nome utente.",
                        Toast.LENGTH_SHORT).show();
            }
            else if (name.getText().toString().equals("Cannas") && password.getText().toString().equals("1234")) {
                Toast.makeText(getApplicationContext(), "Sto effettuando il login..",
                        Toast.LENGTH_SHORT).show();
                Intent loginIntent = new Intent(this, menu_principale.class);
                this.startActivity(loginIntent);

            } else {
                Toast.makeText(getApplicationContext(), "Hai inserito i dati sbagliati..Riprova",
                        Toast.LENGTH_SHORT).show();
            }
        }


    }

}

