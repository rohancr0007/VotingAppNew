package com.example.votingappnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AfterLogin extends AppCompatActivity {


    RadioGroup radioGroup;

    Button Vote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_after_login);

        radioGroup = findViewById(R.id.RadioGroup);
        Vote = findViewById(R.id.Vote);

        radioGroup.clearCheck();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
            }
        });

        Vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voted = new  Intent(AfterLogin.this,MainActivity.class);
                startActivity(voted);
                finish();
                Toast toast = Toast.makeText(AfterLogin.this,"Vote has been submitted",Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}