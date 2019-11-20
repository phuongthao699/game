package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class mua_Credit extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    ImageButton btnShowAlert;

    Button dong;

    @SuppressLint("WrongViewCast")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowAlert = (ImageButton) findViewById(R.id.ic_goi100Credit);
        dong=(Button) findViewById(R.id.dong);

        ContronButton();

    }

    private void ContronButton() {

        dong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mua_Credit.this, android.R.style.Widget_Material_Light);
                builder.setTitle("Trần Dần Chọn A nhé :)))))");
                builder.setIcon(android.R.drawable.alert_dark_frame);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }


                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }


                });
                builder.show();
            }
        });
    }





    public void trangchu(View view) {
        Log.d(LOG_TAG,"Đăng ký");
        Intent intent= new Intent(this,imGame.class);
        startActivity(intent);
    }
}

