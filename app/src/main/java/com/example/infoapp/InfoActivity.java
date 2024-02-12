package com.example.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    private ImageView image;
    private TextView info;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        image = findViewById(R.id.book_image);
        info = findViewById(R.id.tv_info);


        id = getIntent().getIntExtra("DATA", -1);

        Log.d("TTT", ""+id);

        switch (id) {
            case 0: {
                image.setImageResource(R.drawable.choliqushi);
                info.setText(R.string.choliqushi_info_txt);
                break;
            }
            case 1: {
                image.setImageResource(R.drawable.katta_oyin);
                info.setText(R.string.katta_oyin_info_txt);
                break;
            }
            case 2: {
                image.setImageResource(R.drawable.diqqat);
                info.setText(R.string.diqqat_info_txt);
                break;
            }
            case 3: {
                image.setImageResource(R.drawable._1984);
                info.setText(R.string._1984_info_txt);
                break;
            }
            case 4: {
                image.setImageResource(R.drawable.molxa);
                info.setText(R.string.molxona_info_txt);
                break;
            }
            case 5: {
                image.setImageResource(R.drawable.atom);
                info.setText(R.string.atom_info_txt);
                break;
            }
            case 6: {
                image.setImageResource(R.drawable.img_otash_kechasi);
                info.setText(R.string.otash_kechasi_info);
                break;
            }
            case 7: {
                image.setImageResource(R.drawable.img_zobit);
                info.setText(R.string.zobit_info_txt);
                break;
            }
            case 8: {
                image.setImageResource(R.drawable.img_zukkolar_valandavurlar);
                info.setText(R.string.zukkolar_va_landavurlar_info);
                break;
            }
            case 9: {
                image.setImageResource(R.drawable.img_0_dan_1_ga);
                info.setText(R.string._0_dan_1_ga_info);
                break;
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}