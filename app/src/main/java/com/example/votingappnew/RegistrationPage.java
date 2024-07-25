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

public class RegistrationPage extends AppCompatActivity {

    EditText RegistrationUser,RegistrationPass,RegistrationEmail,RegistrationPhone;
    Button LoginScreenBtn, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration_page);

        RegistrationUser = findViewById(R.id.RegistrationUN);
        RegistrationPass = findViewById(R.id.RegistrationPW);
        RegistrationEmail = findViewById(R.id.RegistrationEmail);
        RegistrationPhone = findViewById(R.id.RegistrationPN);
        LoginScreenBtn = findViewById(R.id.LoginOnRegistration);
        register = findViewById(R.id.Register);

        LoginScreenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginPage = new Intent(RegistrationPage.this,MainActivity.class);
                startActivity(LoginPage);
            }
        });


    }
}