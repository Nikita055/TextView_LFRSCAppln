package com.nikitamandaliya.textviewlfrscappln;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textview_1,textview_2,textview_3,textview_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview_1 = findViewById(R.id.textview_1);
        textview_2 = findViewById(R.id.textview_2);
        textview_3 = findViewById(R.id.textview_3);
        textview_4 = findViewById(R.id.textview_4);

        textview_1.setOnClickListener(this);
        textview_2.setOnClickListener(this);
        textview_3.setOnClickListener(this);
        textview_4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.textview_1:
                Toast.makeText(this,"This is first Text",Toast.LENGTH_SHORT).show();
                break;

            case R.id.textview_2:
                Toast.makeText(this,"This is second Text",Toast.LENGTH_SHORT).show();
                break;

            case R.id.textview_3:
                Toast.makeText(this,"This is Third Text",Toast.LENGTH_SHORT).show();
                break;

            case R.id.textview_4:
                Toast.makeText(this, "This is fourth Text", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}