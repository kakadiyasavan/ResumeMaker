package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Page5 extends AppCompatActivity {

    TextView surname5,lastname5,birthdate5,email5,lag5,state5,hobbie5,number5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        surname5 = findViewById(R.id.surname5);
        lastname5 = findViewById(R.id.lastname5);
        birthdate5 = findViewById(R.id.birthdate5);
        email5 = findViewById(R.id.email5);
        lag5 = findViewById(R.id.lag5);
        state5 = findViewById(R.id.state5);
        hobbie5 = findViewById(R.id.hobbie5);
        number5 = findViewById(R.id.number5);

        String txt_surname5 = getIntent().getStringExtra("surname");
        String txt_lastname5 = getIntent().getStringExtra("lastname");
        String txt_birthdate5 = getIntent().getStringExtra("birthdate");
        String txt_email5 = getIntent().getStringExtra("email");
        String txt_lag5 = getIntent().getStringExtra("lag");
        String txt_state5 = getIntent().getStringExtra("state");
        String txt_hobbie5 = getIntent().getStringExtra("hobbie");
        String txt_number5 = getIntent().getStringExtra("number");

        surname5.setText(txt_surname5);
        lastname5.setText(txt_lastname5);
        birthdate5.setText(txt_birthdate5);
        email5.setText(txt_email5);
        lag5.setText(txt_lag5);
        state5.setText(txt_state5);
        hobbie5.setText(txt_hobbie5);
        number5.setText(txt_number5);
    }
}