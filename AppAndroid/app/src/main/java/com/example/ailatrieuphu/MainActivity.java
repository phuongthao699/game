package com.example.ailatrieuphu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    private  Button btnshow;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        };


    public void Login(View view) {
        Log.d(LOG_TAG,"Đăng ký");
        Intent intent= new Intent(this,DangNhap.class);
        startActivity(intent);
    }

    public void inGame(View view) {
        Log.d(LOG_TAG,"Đăng ký");
        Intent intent= new Intent(this,imGame.class);
        startActivity(intent);
    }


    public void hethong(View view) {
        Log.d(LOG_TAG,"Đăng ký");
        Intent intent= new Intent(this,HeThong.class);
        startActivity(intent);
    }

    public void muaCredit(View view) {
        Log.d(LOG_TAG,"Mua Credit");
        Intent intent= new Intent(this,mua_Credit.class);
        startActivity(intent);
    }
}
