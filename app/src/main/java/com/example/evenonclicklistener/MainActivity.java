package com.example.evenonclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.editTextTextLogin);
        edemail=findViewById(R.id.editTextTextPersonName);
        edpassword=findViewById(R.id.editTextTextPassword);
        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();
                Toast t = Toast.makeText(getApplicationContext();
                text:"email anda: "+nama+" dan Password anda: "+password+"", Toast.LENGTH_LONG;
                t.show();
            }
        }
    }
}