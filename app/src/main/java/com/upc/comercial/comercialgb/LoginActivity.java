package com.upc.comercial.comercialgb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onValidarLogin(View v){
        Intent i = new Intent(getApplicationContext(),com.upc.comercial.comercialgb.MenuActivity.class);
        startActivity(i);
    }
}
