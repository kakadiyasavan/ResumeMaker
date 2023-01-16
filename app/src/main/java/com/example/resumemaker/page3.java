package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class page3 extends AppCompatActivity {

    TextView surname3,lastname3,birthdate3,email3,lag3,state3,hobbie3,number3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        surname3 = findViewById(R.id.surname3);
        lastname3 = findViewById(R.id.lastname3);
        birthdate3 = findViewById(R.id.birthdate3);
        email3 = findViewById(R.id.email3);
        lag3 = findViewById(R.id.lag3);
        state3 = findViewById(R.id.state3);
        hobbie3 = findViewById(R.id.hobbie3);
        number3 = findViewById(R.id.number3);

        String txt_surname3 = getIntent().getStringExtra("surname");
        String txt_lastname3 = getIntent().getStringExtra("lastname");
        String txt_birthdate3 = getIntent().getStringExtra("birthdate");
        String txt_email3 = getIntent().getStringExtra("email");
        String txt_lag3 = getIntent().getStringExtra("lag");
        String txt_state3 = getIntent().getStringExtra("state");
        String txt_hobbie3 = getIntent().getStringExtra("hobbie");
        String txt_number3 = getIntent().getStringExtra("number");

        surname3.setText(txt_surname3);
        lastname3.setText(txt_lastname3);
        birthdate3.setText(txt_birthdate3);
        email3.setText(txt_email3);
        lag3.setText(txt_lag3);
        state3.setText(txt_state3);
        hobbie3.setText(txt_hobbie3);
        number3.setText(txt_number3);
    }
}