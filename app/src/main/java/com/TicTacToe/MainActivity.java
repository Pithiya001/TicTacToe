package com.TicTacToe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private ImageView btn1, btn2, btn3, btn4,btn5, btn6,btn7, btn8, btn9;
    private Button btnResetGame;
    private TextView txtScoreX, txtScoreO;
    private byte mBtn1 = 5, mBtn2= 5, mBtn3 = 5, mBtn4 = 5,mBtn5 = 5, mBtn6 = 5,mBtn7 = 5, mBtn8= 5,mBtn9 = 5, i = 0, countX = 0, countO = 0;
    private char mStartGame = 'X';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMapResource();

        btnResetGame.setOnClickListener(v->{
            mResetGame();
        });

        btn1.setOnClickListener(v -> {
            if(mStartGame=='X'){
                btn1.setImageResource(R.drawable.cross);
                mBtn1 = 1; //this button taken by player X
            }
            else{
                btn1.setImageResource(R.drawable.circle);
                mBtn1 = 0; //this button taken by player O
            }
            i++;
            mChoosePlayer();
            mWinningGame();
        });

        btn2.setOnClickListener(v -> {
            if(mStartGame=='X'){
                btn2.setImageResource(R.drawable.cross);
                mBtn2 = 1; //this button taken by player X
            }
            else{
                btn2.setImageResource(R.drawable.circle);
                mBtn2 = 0; //this button taken by player O
            }
            i++;
            mChoosePlayer();
            mWinningGame();
        });

        btn3.setOnClickListener(v -> {
            if(mStartGame=='X'){
                btn3.setImageResource(R.drawable.cross);
                mBtn3 = 1; //this button taken by player X
            }
            else{
                btn3.setImageResource(R.drawable.circle);
                mBtn3 = 0; //this button taken by player O
            }
            i++;
            mChoosePlayer();
            mWinningGame();
        });

        btn4.setOnClickListener(v -> {
            if(mStartGame=='X'){
                btn4.setImageResource(R.drawable.cross);
                mBtn4 = 1; //this button taken by player X
            }
            else{
                btn4.setImageResource(R.drawable.circle);
                mBtn4 = 0; //this button taken by player O
            }
            i++;
            mChoosePlayer();
            mWinningGame();
        });

        btn5.setOnClickListener(v -> {
            if(mStartGame=='X'){
                btn5.setImageResource(R.drawable.cross);
                mBtn5 = 1; //this button taken by player X
            }
            else{
                btn5.setImageResource(R.drawable.circle);
                mBtn5 = 0; //this button taken by player O
            }
            i++;
            mChoosePlayer();
            mWinningGame();
        });

        btn6.setOnClickListener(v -> {
            if(mStartGame=='X'){
                btn6.setImageResource(R.drawable.cross);
                mBtn6 = 1; //this button taken by player X
            }
            else{
                btn6.setImageResource(R.drawable.circle);
                mBtn6 = 0; //this button taken by player O
            }
            i++;
            mChoosePlayer();
            mWinningGame();
        });

        btn7.setOnClickListener(v -> {
            if(mStartGame=='X'){
                btn7.setImageResource(R.drawable.cross);
                mBtn7 = 1; //this button taken by player X
            }
            else{
                btn7.setImageResource(R.drawable.circle);
                mBtn7 = 0; //this button taken by player O
            }
            i++;
            mChoosePlayer();
            mWinningGame();
        });

        btn8.setOnClickListener(v -> {
            if(mStartGame=='X'){
                btn8.setImageResource(R.drawable.cross);
                mBtn8 = 1; //this button taken by player X
            }
            else{
                btn8.setImageResource(R.drawable.circle);
                mBtn8 = 0; //this button taken by player O
            }
            i++;
            mChoosePlayer();
            mWinningGame();
        });

        btn9.setOnClickListener(v -> {
            if(mStartGame=='X'){
                btn9.setImageResource(R.drawable.cross);
                mBtn9 = 1; //this button taken by player X
            }
            else{
                btn9.setImageResource(R.drawable.circle);
                mBtn9 = 0; //this button taken by player O
            }
            i++;
            mChoosePlayer();
            mWinningGame();
        });
    }

    private void mWinningGame() {
        if((mBtn1==1 && mBtn2 == 1 && mBtn3==1) || (mBtn4==1 && mBtn5==1 && mBtn6 == 1) || (mBtn7==1 && mBtn8==1 && mBtn9 == 1) || (mBtn1==1 && mBtn4==1 && mBtn7 == 1) || (mBtn2==1 && mBtn5==1 && mBtn8 == 1)  || (mBtn3==1 && mBtn6==1 && mBtn9 == 1) || (mBtn1==1 && mBtn5==1 && mBtn9 == 1) || (mBtn3==1 && mBtn5==1 && mBtn7 == 1)){
            countX++;
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle("Game Result!");
            adb.setMessage("Player X wins the game Score is " +countX);

            adb.setPositiveButton("Next round", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    mReadyForNextRound();
                }
            });
            adb.setNegativeButton("Reset Game",new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface d,int i){
                    mResetGame();
                }
            });

            AlertDialog ad=adb.create();
            ad.show();
            txtScoreX.setText("Score X: "+countX);
        }
        else if((mBtn1==0 && mBtn2 == 0 && mBtn3==1) || (mBtn4==0 && mBtn5==0 && mBtn6 == 0) || (mBtn7==0 && mBtn8==0 && mBtn9 == 0) || (mBtn1==0 && mBtn4==0 && mBtn7 == 0) || (mBtn2==0 && mBtn5==0 && mBtn8 == 0)  || (mBtn3==0 && mBtn6==0 && mBtn9 == 0) || (mBtn1==0 && mBtn5==0 && mBtn9 == 0) || (mBtn3==0 && mBtn5==0 && mBtn7 == 0)){
            countO++;
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle("Game Result!");
            adb.setMessage("Player O wins the game Score is " +countO);

            adb.setPositiveButton("Next round", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    mReadyForNextRound();
                }
            });
            adb.setNegativeButton("Reset Game",new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface d,int i){
                    mResetGame();
                }
            });
            AlertDialog ad=adb.create();
            ad.show();
            txtScoreO.setText("Score O: "+countO);
        }
        else if(i>=9){
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle("Game Result!");
            adb.setMessage("Match tie no one wins");

            adb.setPositiveButton("Next round", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    mReadyForNextRound();
                }
            });
            adb.setNegativeButton("Reset Game",new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface d,int i){
                    mResetGame();
                }
            });
            AlertDialog ad=adb.create();
            ad.show();
        }
    }

    private void mChoosePlayer() {
        mStartGame = (mStartGame=='X') ? 'O' : 'X';

        /*if(mStartGame=='X'){
            mStartGame = 'O';
        }
        else{
            mStartGame = 'X';
        }*/
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

    //Resets Game
    private void mResetGame(){
        btn1.setImageDrawable(null);
        btn2.setImageDrawable(null);
        btn3.setImageDrawable(null);
        btn4.setImageDrawable(null);
        btn5.setImageDrawable(null);
        btn6.setImageDrawable(null);
        btn7.setImageDrawable(null);
        btn8.setImageDrawable(null);
        btn9.setImageDrawable(null);

        mBtn1 = 5;
        mBtn2 = 5;
        mBtn3 = 5;
        mBtn4 = 5;
        mBtn5 = 5;
        mBtn6 = 5;
        mBtn7 = 5;
        mBtn8 = 5;
        mBtn9 = 5;

        countO = 0;
        countX = 0;

        txtScoreX.setText("Score X: 0");
        txtScoreO.setText("Score O: 0");

        mStartGame = 'X';

        i = 0;
    }

    private void mReadyForNextRound(){
        btn1.setImageDrawable(null);
        btn2.setImageDrawable(null);
        btn3.setImageDrawable(null);
        btn4.setImageDrawable(null);
        btn5.setImageDrawable(null);
        btn6.setImageDrawable(null);
        btn7.setImageDrawable(null);
        btn8.setImageDrawable(null);
        btn9.setImageDrawable(null);

        mBtn1 = 5;
        mBtn2 = 5;
        mBtn3 = 5;
        mBtn4 = 5;
        mBtn5 = 5;
        mBtn6 = 5;
        mBtn7 = 5;
        mBtn8 = 5;
        mBtn9 = 5;

        i = 0;
    }
}