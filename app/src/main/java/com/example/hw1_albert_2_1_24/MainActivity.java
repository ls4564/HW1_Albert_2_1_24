package com.example.hw1_albert_2_1_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView img;
    Random rand = new Random();
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        img = findViewById(R.id.img);
    }

    public void lol(View view) {
        num = rand.nextInt(3)+1;
        btn.setText("Random num is: "+num);
        if(num == 1)
        {
            img.setImageResource(R.drawable.img_albert_2_1_24);
        }
        if(num == 2)
        {
            img.setImageResource(R.drawable.img2_albert_2_1_24);
        }
        if(num == 3)
        {
            img.setImageResource(R.drawable.img3_albert_2_1_24);
        }
    }
}