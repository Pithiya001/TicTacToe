package com.TicTacToe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView btn1, btn2, btn3, btn4,btn5, btn6,btn7, btn8, btn9;
    private Button btnResetGame;
    private TextView txtScoreX, txtScoreO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMapResource();
    }

    private void mMapResource(){
        //ImageViews
        btn1 = findViewById(R.id.img_main_btn1);
        btn2 = findViewById(R.id.img_main_btn2);
        btn3 = findViewById(R.id.img_main_btn3);
        btn4 = findViewById(R.id.img_main_btn4);
        btn5 = findViewById(R.id.img_main_btn5);
        btn6 = findViewById(R.id.img_main_btn6);
        btn7 = findViewById(R.id.img_main_btn7);
        btn8 = findViewById(R.id.img_main_btn8);
        btn9 = findViewById(R.id.img_main_btn9);

        //TextViews
        txtScoreX = findViewById(R.id.txt_main_scoreX);
        txtScoreO = findViewById(R.id.txt_main_scoreO);

        //Button
        btnResetGame = findViewById(R.id.btn_main_reset);
    }
}