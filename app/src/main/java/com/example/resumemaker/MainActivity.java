package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText surname,lastname,birthdate,email,lag,state,hobbie,number;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        surname = findViewById(R.id.surname);
        lastname = findViewById(R.id.lastname);
        birthdate = findViewById(R.id.birthdate);
        email = findViewById(R.id.email);
        lag = findViewById(R.id.lag);
        state = findViewById(R.id.state);
        hobbie = findViewById(R.id.hobbie);
        number = findViewById(R.id.number);

        done = findViewById(R.id.done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,page.class);
                String str1 = surname.getText().toString();
                String str2 = lastname.getText().toString();
                String str3 = birthdate.getText().toString();
                String str4 = email.getText().toString();
                String str5 = lag.getText().toString();
                String str6 = state.getText().toString();
                String str7 = hobbie.getText().toString();
                String str8 = number.getText().toString();

                intent.putExtra("surname",str1);
                intent.putExtra("lastname",str2);
                intent.putExtra("birthdate",str3);
                intent.putExtra("email",str4);
                intent.putExtra("lag",str5);
                intent.putExtra("state",str6);
                intent.putExtra("hobbie",str7);
                intent.putExtra("number",str8);
                startActivity(intent);
            }
        });
    }

}