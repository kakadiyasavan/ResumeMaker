package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    TextView surname2,lastname2,birthdate2,email2,lag2,state2,hobbie2,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        surname2 = findViewById(R.id.surname2);
        lastname2 = findViewById(R.id.lastname2);
        birthdate2 = findViewById(R.id.birthdate2);
        email2 = findViewById(R.id.email2);
        lag2 = findViewById(R.id.lag2);
        state2 = findViewById(R.id.state2);
        hobbie2 = findViewById(R.id.hobbie2);
        number2 = findViewById(R.id.number2);

        String txt_surname2 = getIntent().getStringExtra("surname");
        String txt_lastname2 = getIntent().getStringExtra("lastname");
        String txt_birthdate2 = getIntent().getStringExtra("birthdate");
        String txt_email2 = getIntent().getStringExtra("email");
        String txt_lag2 = getIntent().getStringExtra("lag");
        String txt_state2 = getIntent().getStringExtra("state");
        String txt_hobbie2 = getIntent().getStringExtra("hobbie");
        String txt_number2 = getIntent().getStringExtra("number");

        surname2.setText(txt_surname2);
        lastname2.setText(txt_lastname2);
        birthdate2.setText(txt_birthdate2);
        email2.setText(txt_email2);
        lag2.setText(txt_lag2);
        state2.setText(txt_state2);
        hobbie2.setText(txt_hobbie2);
        number2.setText(txt_number2);
    }
}