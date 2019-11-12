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
import android.widget.Toast;

public class mua_Credit extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Button btnShowAlert;


    @SuppressLint("WrongViewCast")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowAlert = (Button) findViewById(R.id.ic_goi100Credit);
        btnShowAlert.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                showAlertDialog();

            }
        });
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Gói 100 credit");

        builder.setMessage("Bạn có muốn mua gói này không?");

        builder.setCancelable(true);

        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {

            @Override

            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(mua_Credit.this, "Ban đã đăng xuất thành công!", Toast.LENGTH_SHORT).show();

                dialog.dismiss();

            }

        }).setNegativeButton("Ứ chịu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }

        });
        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }

    public void trangchu(View view) {
        Log.d(LOG_TAG,"Đăng ký");
        Intent intent= new Intent(this,imGame.class);
        startActivity(intent);
    }
}



