package com.example.hp.restaux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class reservation extends AppCompatActivity {
    protected Button mybutton;
    protected Button mybutton1;
    String mystring="Réservation valider";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        mybutton=findViewById(R.id.cli);
        mybutton1=findViewById(R.id.click);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),mystring,Toast.LENGTH_LONG).show();
            }
        });
    }
    public void valider(View view) {

        Intent myIntet = new Intent(this,liste_restaux.class);
        startActivity(myIntet);
    }
    public void set(View view) {

        Intent myIntet = new Intent(this,liste_restaux.class);
        startActivity(myIntet);
    }
}
