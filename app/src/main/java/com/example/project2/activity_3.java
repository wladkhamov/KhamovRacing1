package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_3 extends AppCompatActivity {
    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button = (ImageButton) findViewById(R.id.button20);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openActivity3();
            }
        });
    }
    public void openActivity3() {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}