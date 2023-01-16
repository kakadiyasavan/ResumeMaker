package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class page extends AppCompatActivity {

    ImageView one,two,three,four,five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(page.this,page1.class);
                String surname = getIntent().getStringExtra("surname");
                String lastname = getIntent().getStringExtra("lastname");
                String birthdate = getIntent().getStringExtra("birthdate");
                String email = getIntent().getStringExtra("email");
                String lag = getIntent().getStringExtra("lag");
                String state = getIntent().getStringExtra("state");
                String hobbie = getIntent().getStringExtra("hobbie");
                String number = getIntent().getStringExtra("number");

                intent.putExtra("surname",surname);
                intent.putExtra("lastname",lastname);
                intent.putExtra("birthdate",birthdate);
                intent.putExtra("email",email);
                intent.putExtra("lag",lag);
                intent.putExtra("state",state);
                intent.putExtra("hobbie",hobbie);
                intent.putExtra("number",number);
                startActivity(intent);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(page.this,page2.class);
                String surname = getIntent().getStringExtra("surname");
                String lastname = getIntent().getStringExtra("lastname");
                String birthdate = getIntent().getStringExtra("birthdate");
                String email = getIntent().getStringExtra("email");
                String lag = getIntent().getStringExtra("lag");
                String state = getIntent().getStringExtra("state");
                String hobbie = getIntent().getStringExtra("hobbie");
                String number = getIntent().getStringExtra("number");

                intent.putExtra("surname",surname);
                intent.putExtra("lastname",lastname);
                intent.putExtra("birthdate",birthdate);
                intent.putExtra("email",email);
                intent.putExtra("lag",lag);
                intent.putExtra("state",state);
                intent.putExtra("hobbie",hobbie);
                intent.putExtra("number",number);
                startActivity(intent);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(page.this,page3.class);
                String surname = getIntent().getStringExtra("surname");
                String lastname = getIntent().getStringExtra("lastname");
                String birthdate = getIntent().getStringExtra("birthdate");
                String email = getIntent().getStringExtra("email");
                String lag = getIntent().getStringExtra("lag");
                String state = getIntent().getStringExtra("state");
                String hobbie = getIntent().getStringExtra("hobbie");
                String number = getIntent().getStringExtra("number");

                intent.putExtra("surname",surname);
                intent.putExtra("lastname",lastname);
                intent.putExtra("birthdate",birthdate);
                intent.putExtra("email",email);
                intent.putExtra("lag",lag);
                intent.putExtra("state",state);
                intent.putExtra("hobbie",hobbie);
                intent.putExtra("number",number);
                startActivity(intent);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(page.this,page4.class);
                String surname = getIntent().getStringExtra("surname");
                String lastname = getIntent().getStringExtra("lastname");
                String birthdate = getIntent().getStringExtra("birthdate");
                String email = getIntent().getStringExtra("email");
                String lag = getIntent().getStringExtra("lag");
                String state = getIntent().getStringExtra("state");
                String hobbie = getIntent().getStringExtra("hobbie");
                String number = getIntent().getStringExtra("number");

                intent.putExtra("surname",surname);
                intent.putExtra("lastname",lastname);
                intent.putExtra("birthdate",birthdate);
                intent.putExtra("email",email);
                intent.putExtra("lag",lag);
                intent.putExtra("state",state);
                intent.putExtra("hobbie",hobbie);
                intent.putExtra("number",number);
                startActivity(intent);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(page.this,Page5.class);
                String surname = getIntent().getStringExtra("surname");
                String lastname = getIntent().getStringExtra("lastname");
                String birthdate = getIntent().getStringExtra("birthdate");
                String email = getIntent().getStringExtra("email");
                String lag = getIntent().getStringExtra("lag");
                String state = getIntent().getStringExtra("state");
                String hobbie = getIntent().getStringExtra("hobbie");
                String number = getIntent().getStringExtra("number");

                intent.putExtra("surname",surname);
                intent.putExtra("lastname",lastname);
                intent.putExtra("birthdate",birthdate);
                intent.putExtra("email",email);
                intent.putExtra("lag",lag);
                intent.putExtra("state",state);
                intent.putExtra("hobbie",hobbie);
                intent.putExtra("number",number);
                startActivity(intent);
            }
        });
    }
}