package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChonLinhVuc(View view) {
        Log.d(LOG_TAG,"Chọn Lĩnh Vưc");
        Intent intent=new Intent(this,ChonLinhVuc.class);
        startActivity(intent);
    }

    public void BangXepHang(View view) {
        Log.d(LOG_TAG,"Bảng Xếp Hạng");
        Intent intent=new Intent(this,BangXepHang.class);
        startActivity(intent);
    }

    public void MuaCredit(View view) {
        Log.d(LOG_TAG,"Mua Credit");
        Intent intent=new Intent(this,MuaCredit.class);
        startActivity(intent);
    }

    public void QuanLyTaiKhoan(View view) {
        Log.d(LOG_TAG,"Quản Lý Tài Khoản");
        Intent intent=new Intent(this,QuanLyTaiKhoan.class);
        startActivity(intent);
    }

    public void LichSuChoiGame(View view) {
        Log.d(LOG_TAG,"Lịch Sử Chơi Game");
        Intent intent=new Intent(this,LichSuChoi.class);
        startActivity(intent);
    }
}
