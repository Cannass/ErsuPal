package com.example.michele.ersupal.ui;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.michele.ersupal.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private Button login,bntrecupdati,bntregistrati;
    public TextView messageWithLinkTextView;
    private EditText name, password;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;




    //private TextView msg, NameOut, DateOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bntrecupdati=(Button) findViewById(R.id.bntrecupdati);
        bntrecupdati.setOnClickListener(this);
        bntregistrati=(Button) findViewById(R.id.bntregistrati);
        bntregistrati.setOnClickListener(this);
        login = (Button) findViewById(R.id.login_b);
        login.setOnClickListener(this);
        name = (EditText) findViewById(R.id.utente);
        password = (EditText) findViewById(R.id.password);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.getText().clear();
            }
        });

        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password.getText().clear();
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onClick(View v) {


        if (v == login) {
            if (name.getText().toString().isEmpty() && password.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Non hai inserito nulla",
                        Toast.LENGTH_SHORT).show();
            } else if (password.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Non hai inserito una password",
                        Toast.LENGTH_SHORT).show();
            } else if (name.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Non hai inserito un nome utente.",
                        Toast.LENGTH_SHORT).show();
            } else if (name.getText().toString().equals("Cannas") && password.getText().toString().equals("1234")) {
                Toast.makeText(getApplicationContext(), "Sto effettuando il login..",
                        Toast.LENGTH_SHORT).show();
                Intent loginIntent = new Intent(this, menu_principale.class);
                this.startActivity(loginIntent);

            } else {
                Toast.makeText(getApplicationContext(), "Hai inserito i dati sbagliati..Riprova",
                        Toast.LENGTH_SHORT).show();
            }
        }
        if(v == bntrecupdati){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.ersucagliarionline.it/scripts16/vSignup/pwdremind.php"));
            startActivity(intent);
        }
        if(v == bntregistrati){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.ersucagliarionline.it/scripts16/vSignup/signup.php"));
            startActivity(intent);
        }

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Login Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

