package com.example.sigara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mrkt;
    private Button by;
    private Button pr;
    private Button fiyat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrkt = findViewById(R.id.mrkt);
        by = findViewById(R.id.by);
        pr = findViewById(R.id.pr);
        fiyat=findViewById(R.id.fiyat);



        mrkt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // İmaj tıklandığında yapılacak işlemler buraya yazılır
                // Örneğin, yeni bir sayfaya yönlendirme işlemi burada gerçekleştirilebilir

                Intent intent = new Intent(MainActivity.this, mrkt.class);
                startActivity(intent);
            }
        });

        fiyat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // İmaj tıklandığında yapılacak işlemler buraya yazılır
                // Örneğin, yeni bir sayfaya yönlendirme işlemi burada gerçekleştirilebilir

                Intent intent = new Intent(MainActivity.this, fiyat.class);
                startActivity(intent);
            }
        });



        by.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // İmaj tıklandığında yapılacak işlemler buraya yazılır
                // Örneğin, yeni bir sayfaya yönlendirme işlemi burada gerçekleştirilebilir

                Intent intent = new Intent(MainActivity.this, by.class);
                startActivity(intent);
            }
        });

        pr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // İmaj tıklandığında yapılacak işlemler buraya yazılır
                // Örneğin, yeni bir sayfaya yönlendirme işlemi burada gerçekleştirilebilir

                Intent intent = new Intent(MainActivity.this, pr.class);
                startActivity(intent);
            }
        });


    }
}