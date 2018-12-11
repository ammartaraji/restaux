package com.example.hp.restaux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class pizaa extends AppCompatActivity {
    String mystring="Encour de developper";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizaa);
        Toast.makeText(getApplicationContext(),mystring,Toast.LENGTH_LONG).show();
    }
}
