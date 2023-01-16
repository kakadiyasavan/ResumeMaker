package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class page4 extends AppCompatActivity {

    TextView surname4,lastname4,birthdate4,email4,lag4,state4,hobbie4,number4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        surname4 = findViewById(R.id.surname4);
        lastname4 = findViewById(R.id.lastname4);
        birthdate4 = findViewById(R.id.birthdate4);
        email4 = findViewById(R.id.email4);
        lag4 = findViewById(R.id.lag4);
        state4 = findViewById(R.id.state4);
        hobbie4 = findViewById(R.id.hobbie4);
        number4 = findViewById(R.id.number4);

        String txt_surname4 = getIntent().getStringExtra("surname");
        String txt_lastname4 = getIntent().getStringExtra("lastname");
        String txt_birthdate4 = getIntent().getStringExtra("birthdate");
        String txt_email4 = getIntent().getStringExtra("email");
        String txt_lag4 = getIntent().getStringExtra("lag");
        String txt_state4 = getIntent().getStringExtra("state");
        String txt_hobbie4 = getIntent().getStringExtra("hobbie");
        String txt_number4 = getIntent().getStringExtra("number");

        surname4.setText(txt_surname4);
        lastname4.setText(txt_lastname4);
        birthdate4.setText(txt_birthdate4);
        email4.setText(txt_email4);
        lag4.setText(txt_lag4);
        state4.setText(txt_state4);
        hobbie4.setText(txt_hobbie4);
        number4.setText(txt_number4);
    }
}