package com.example.votingappnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button Login,Reginstration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Login = findViewById(R.id.LoginButton);
        Reginstration = findViewById(R.id.RegistrationButton);
        editText2 = findViewById(R.id.PassWord);
        editText1 = findViewById(R.id.UserName);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.equals("Admin") && editText2.equals("Admin")) {
                    Intent adminPage = new Intent(MainActivity.this, AdminHomePage.class);
                    startActivity(adminPage);
                }
                else{
                    Intent AfterLogin = new Intent(MainActivity.this,AfterLogin.class);
                    startActivity(AfterLogin);
                    editText1.setError("this field cannot be empty");
                    editText2.setError("this field cannot be empty");
                }


            }
        });

        Reginstration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoToRegistration = new Intent(MainActivity.this,RegistrationPage.class);
                startActivity(GoToRegistration);
            }
        });


    }
}