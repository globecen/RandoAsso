package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Valider (View view) {
        startActivity(new Intent(this, randomember_main_activity.class));
    }

    public void CreerCompte (View view) {
        startActivity(new Intent(this, account_assomenber_activity.class));
    }
}
