package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class DangNhap extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
    }
    public void DangKy(View view) {
        Log.d(LOG_TAG,"Đăng ký");
        Intent intent= new Intent(this,login.class);
        startActivity(intent);
    }
}
