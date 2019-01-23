package com.example.asus.bloodlocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mdonor, mreciever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdonor=(Button) findViewById(R.id.donor);
        mreciever=(Button) findViewById(R.id.reciever);

        mdonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DonorLoginactivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mreciever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RecieverLoginactivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
