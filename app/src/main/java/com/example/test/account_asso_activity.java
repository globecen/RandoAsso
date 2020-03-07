package com.example.test;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class account_asso_activity extends AppCompatActivity {

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_asso_activity);
    }

    public void Valider (View view) {
        startActivity(new Intent(this, account_assomenber_activity.class));
    }

}
