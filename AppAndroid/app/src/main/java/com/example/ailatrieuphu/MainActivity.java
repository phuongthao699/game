package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    ImageButton btnhuongdan;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnhuongdan = (ImageButton) findViewById(R.id.ic_HuongDan);
        ControlHD();
    }

    private void ControlHD() {

        btnhuongdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Widget_Material_Light);
                builder.setTitle("Hướng dẫn");
                builder.setMessage("Người chơi sẽ tham gia trò chơi trả lời câu hỏi với những quy tắc đơn giãn sau:" +
                        "\n\n1. Người chơi sẽ vượt qua những vòng chơi và mỗi vòng sẽ có 1 câu hỏi với 4 đáp án, người chơi phải chọn đáp án đúng nhất để vượt qua các mản chơi để đạt được điểm cao nhất" +
                        "\n\n2. Người chơi sẽ được hệ thống hỗ trợ các chức năng quyển trợ giúp để người chơi dễ dàng vượt qua màn chơi. Lưu ý: đối với mỗi quyền trợ giúp chỉ được sử dụng trong 1 lượt chơi, mỗi lượt chơi có 4 quyền trợ giúp đó là: gọi người thân, hỏi ý kiến khán giả trường quay, 50-50, lượt bình chọn cho các đáp án của khán giả trường quay" +
                        "\n\n3. Điểm tạo nên điểm khác biệt với trò chơi trả lời câu hỏi khác là: ngoài việc trả lời những câu hỏi thú vị của hệ thống đưa ra, người chơi còn phải đối mặt với thời gian chơi tại vòng đó, nếu hết thời gian người chơi sẽ thua và kết thúc lượt chơi" +
                        "\n\n4. Để được lưu điểm của lượt chơi, người chơi cần phải đăng ký tài khoản và đăng nhập trước khi chơi.");

                builder.setIcon(android.R.drawable.alert_dark_frame);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }


                });

                builder.show();
            }
        });
    }


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
        Intent intent= new Intent(this,mua_goi_Credit.class);
        startActivity(intent);
    }
}
