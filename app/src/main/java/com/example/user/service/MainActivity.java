package com.example.user.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.security.Provider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        if(button!=null){
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,MyService.class);
                    startService(intent);
                    Toast.makeText(MainActivity.this,"Activate SERVICE",Toast.LENGTH_LONG).show();
                    finish();
                }
            });
        }
    }
}