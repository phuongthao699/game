package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class login extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void cancel(View view) {
        Log.d(LOG_TAG,"Hủy Bỏ Đăng Ký");
        Intent intent= new Intent(this,DangNhap.class);
        startActivity(intent);
    }

    public void DangNhap(View view) {

    }
}
