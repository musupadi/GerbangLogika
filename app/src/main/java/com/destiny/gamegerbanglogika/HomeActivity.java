package com.destiny.gamegerbanglogika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.destiny.gamegerbanglogika.Method.Method;
import com.destiny.gamegerbanglogika.Mulai.StartActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeActivity extends AppCompatActivity {
    LinearLayout Latihan,Mulai;
    ImageView ivHeader;
    TextView tvHeader,tvTgl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ivHeader = findViewById(R.id.ivHeader);
        tvHeader = findViewById(R.id.tvHeader);
        Latihan = findViewById(R.id.linearLatihan);
        Mulai = findViewById(R.id.linearMulai);
        Latihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(HomeActivity.this,LatihanActivity.class);
                startActivity(intent);
            }
        });
        Mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(HomeActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });
    }
}