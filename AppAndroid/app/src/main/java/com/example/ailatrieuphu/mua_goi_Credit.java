package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mua_goi_Credit extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
   // @Override
    ImageButton dong;
    ImageButton goi2;
    ImageButton goi5;
    ImageButton goi10;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mua_goi__credit);


        dong =(ImageButton) findViewById(R.id.ic_goi100Credit);
        goi2 =(ImageButton) findViewById(R.id.ic_goi200Credit);
        goi5 =(ImageButton) findViewById(R.id.ic_goi500Credit);
        goi10 =(ImageButton) findViewById(R.id.ic_goi1000Credit);
        ControlButton();
        ControlButtongoi2();
        ControlButtongoi5();
        ControlButtongoi10();
    }
    public void muaCredit(View view) {
        Log.d(LOG_TAG,"trở về trang chủ");
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    private void ControlButton() {

        dong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mua_goi_Credit.this, android.R.style.Widget_Material_Light);
                builder.setMessage("bạn có muốn mua gói credit 100 này không?");
                builder.setTitle("Gói Credit 100");
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
    private void ControlButtongoi2() {

        goi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mua_goi_Credit.this, android.R.style.Widget_Material_Light);
                builder.setMessage("bạn có muốn mua gói credit 200 này không?");
                builder.setTitle("Gói Credit 200");
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

    private void ControlButtongoi5() {

        goi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mua_goi_Credit.this, android.R.style.Widget_Material_Light);
                builder.setMessage("bạn có muốn mua gói credit 500 này không?");
                builder.setTitle("Gói Credit 500");
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

    private void ControlButtongoi10() {

        goi10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mua_goi_Credit.this, android.R.style.Widget_Material_Light);
                builder.setMessage("bạn có muốn mua gói credit 1000 này không?");
                builder.setTitle("Gói Credit 1000");
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

}
