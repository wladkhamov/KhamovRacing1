package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_4 extends AppCompatActivity {
    private ImageButton button;
    private ImageButton button2;
    private ImageButton button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        button = (ImageButton) findViewById(R.id.haus);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        button2 = (ImageButton) findViewById(R.id.camera);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button4 = (ImageButton) findViewById(R.id.imageButton5);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this, activity_3.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this, activity_2.class);
        startActivity(intent);
    }
}