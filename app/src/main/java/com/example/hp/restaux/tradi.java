package com.example.hp.restaux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class tradi extends AppCompatActivity {

    String mystring="Encour de developper";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradi);
        Toast.makeText(getApplicationContext(),mystring,Toast.LENGTH_LONG).show();

    }
}
