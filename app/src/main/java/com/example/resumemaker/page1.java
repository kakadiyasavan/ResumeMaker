package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class page1 extends AppCompatActivity {

    TextView surname1,lastname1,birthdate1,email1,lag1,state1,hobbie1,number1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        surname1 = findViewById(R.id.surname1);
        lastname1 = findViewById(R.id.lastname1);
        birthdate1 = findViewById(R.id.birthdate1);
        email1 = findViewById(R.id.email1);
        lag1 = findViewById(R.id.lan1);
        state1 = findViewById(R.id.state1);
        hobbie1 = findViewById(R.id.hobbie1);
        number1 = findViewById(R.id.number1);

        String txt_surname1 = getIntent().getStringExtra("surname");
        String txt_lastname1 = getIntent().getStringExtra("lastname");
        String txt_birthdate1 = getIntent().getStringExtra("birthdate");
        String txt_email1 = getIntent().getStringExtra("email");
        String txt_lag1 = getIntent().getStringExtra("lag");
        String txt_state1 = getIntent().getStringExtra("state");
        String txt_hobbie1 = getIntent().getStringExtra("hobbie");
        String txt_number1 = getIntent().getStringExtra("number");

        surname1.setText(txt_surname1);
        lastname1.setText(txt_lastname1);
        birthdate1.setText(txt_birthdate1);
        email1.setText(txt_email1);
        lag1.setText(txt_lag1);
        state1.setText(txt_state1);
        hobbie1.setText(txt_hobbie1);
        number1.setText(txt_number1);
    }
}