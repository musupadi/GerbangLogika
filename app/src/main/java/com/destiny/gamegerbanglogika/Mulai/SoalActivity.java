package com.destiny.gamegerbanglogika.Mulai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel1;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel2;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel3;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel4;
import com.destiny.gamegerbanglogika.Model.Dificulty.Easy.EasyModel5;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class SoalActivity extends AppCompatActivity {
    Button Jawaban1,Jawaban2,Jawaban3,Submit;
    ImageView Gambar;
    private ArrayList<DataModel> pList = new ArrayList<>();
    String Jawaban = "0";
    String Kategori,Random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        Intent data = getIntent();
        String No = data.getStringExtra("NO");
        final String Score = data.getStringExtra("SCORE");
        final String Kategori = data.getStringExtra("KATEGORI");
        final String Random = data.getStringExtra("RAND");
        final int no = Integer.parseInt(No);
        Jawaban1 = findViewById(R.id.btnJawaban1);
        Jawaban2 = findViewById(R.id.btnJawaban2);
        Jawaban3 = findViewById(R.id.btnJawaban3);
        Submit = findViewById(R.id.btnSubmit);
        Gambar = findViewById(R.id.ivGambar);
        if (Kategori.equals("Easy")){
            if (Random.equals("1")){
                pList.addAll(EasyModel1.getListData());
            }else if (Random.equals("2")){
                pList.addAll(EasyModel2.getListData());
            }else if (Random.equals("3")){
                pList.addAll(EasyModel3.getListData());
            }else if (Random.equals("4")){
                pList.addAll(EasyModel4.getListData());
            }else{
                pList.addAll(EasyModel5.getListData());
            }
        }
        getSupportActionBar().setTitle("No : "+pList.get(no).getNo());
        Jawaban1.setText(pList.get(no).getJawaban1());
        Jawaban2.setText(pList.get(no).getJawaban2());
        Jawaban3.setText(pList.get(no).getJawaban3());
        Gambar.setImageResource(Integer.parseInt(pList.get(no).getGambar()));
        final Handler handler = new Handler();
        Jawaban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one(pList.get(no).getJawaban1());
            }
        });
        Jawaban2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two(pList.get(no).getJawaban2());
            }
        });
        Jawaban3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                three(pList.get(no).getJawaban3());
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Jawaban.equals(pList.get(no).getJawaban())){
                    Gambar.setImageResource(Integer.parseInt(pList.get(no).getGambar2()));
                    Toast.makeText(SoalActivity.this, "Jawaban Benar "+Jawaban, Toast.LENGTH_SHORT).show();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            if (no >= pList.size()-1){
                                Intent goInput = new Intent(SoalActivity.this, ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                goInput.putExtra("KATEGORI",Kategori);
                                startActivity(goInput);
                            }else{
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)+10));
                                goInput.putExtra("KATEGORI",Kategori);
                                goInput.putExtra("RAND",Random);
                                startActivities(new Intent[]{goInput});
                            }
                        }
                    }, 3000); //3000 L
                }else{
                    Toast.makeText(SoalActivity.this, "Jawaban Salah "+Jawaban+" Yang Benar adalah "+pList.get(no).getJawaban(), Toast.LENGTH_SHORT).show();
                    Gambar.setImageResource(Integer.parseInt(pList.get(no).getGambar()));
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            if (no >= pList.size()-1){
                                Intent goInput = new Intent(SoalActivity.this, ScoreActivity.class);
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)));
                                goInput.putExtra("KATEGORI",Kategori);
                                startActivity(goInput);
                            }else{
                                Intent goInput = new Intent(SoalActivity.this, SoalActivity.class);
                                goInput.putExtra("NO",String.valueOf(no+1));
                                goInput.putExtra("SCORE",String.valueOf(Integer.parseInt(Score)));
                                goInput.putExtra("KATEGORI",Kategori);
                                goInput.putExtra("RAND",Random);
                                startActivities(new Intent[]{goInput});
                            }
                        }
                    }, 3000); //3000 L
                }
            }
        });
    }
    private void Default(){
        Jawaban1.setBackgroundResource(R.drawable.button_home_white);
        Jawaban2.setBackgroundResource(R.drawable.button_home_white);
        Jawaban3.setBackgroundResource(R.drawable.button_home_white);
    }
    private void one(String Jaw){
        Default();
        Jawaban1.setBackgroundResource(R.drawable.button_red_rounded);
        Jawaban = Jaw;
    }

    private void two(String Jaw){
        Default();
        Jawaban2.setBackgroundResource(R.drawable.button_red_rounded);
        Jawaban = Jaw;
    }

    private void three(String Jaw){
        Default();
        Jawaban3.setBackgroundResource(R.drawable.button_red_rounded);
        Jawaban = Jaw;
    }
}