package com.example.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, InfoActivity.class);

        findViewById(R.id.cholishu_item).setOnClickListener(v-> {
            intent.putExtra("DATA", 0);

            startActivity(intent);
        });


        findViewById(R.id.katta_oyin_item).setOnClickListener(v-> {
            intent.putExtra("DATA", 1);

            startActivity(intent);
        });


        findViewById(R.id.diqqat_item).setOnClickListener(v-> {
            intent.putExtra("DATA", 2);

            startActivity(intent);
        });



        findViewById(R.id._1984_item).setOnClickListener(v-> {
            intent.putExtra("DATA", 3);

            startActivity(intent);
        });

        findViewById(R.id.molxona_item).setOnClickListener(v-> {
            intent.putExtra("DATA", 4);

            startActivity(intent);
        });


        findViewById(R.id.atom_item).setOnClickListener(v-> {
            intent.putExtra("DATA", 5);

            startActivity(intent);
        });


        findViewById(R.id.otash_item).setOnClickListener( v -> {
            intent.putExtra("DATA", 6);

            startActivity(intent);
        });


        findViewById(R.id.zobit_item).setOnClickListener( v -> {
            intent.putExtra("DATA", 7);

            startActivity(intent);
        });


        findViewById(R.id.zukkolar_item).setOnClickListener( v -> {
            intent.putExtra("DATA", 8);
            startActivity(intent);
        });


        findViewById(R.id._0dan_item).setOnClickListener( v -> {
            intent.putExtra("DATA", 9);
            startActivity(intent);
        });
    }

    private void toaster(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}