package com.example.hp.restaux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class sushis extends AppCompatActivity {
    String mystring="Encour de developper";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushis);
        Toast.makeText(getApplicationContext(),mystring,Toast.LENGTH_LONG).show();

    }
}
