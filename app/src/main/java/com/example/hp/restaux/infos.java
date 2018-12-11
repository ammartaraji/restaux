package com.example.hp.restaux;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class infos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos);
        final Button loginButton = (Button) findViewById(R.id.click);
    }

    public void click(View view) {

        Intent myIntet = new Intent(this,reservation.class);
        startActivity(myIntet);
    }
}
