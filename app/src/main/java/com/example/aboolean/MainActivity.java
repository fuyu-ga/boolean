package com.example.aboolean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void method(Boolean question){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Contents",question);
        startActivity(intent);
    }

    public void method2(int ages) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("age",ages);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnyes = findViewById(R.id.btn_yes);
        Button btnno = findViewById(R.id.btn_no);
        Button idontknow =findViewById(R.id.btn_dontknow);
        Button five = findViewById(R.id.age_5);
        Button fifteen = findViewById(R.id.age_15);
        Button nineteen = findViewById(R.id.age_19);
        Button other = findViewById(R.id.btn_other);

        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method(true);
            }
        });

        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method(false);
            }
        });

        idontknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("dknow","20歳を超えたからといって本当の意味で大人になれたとは限らないと考えたのですね。");
                startActivity(intent);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               method2(5);
            }
        });

        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method2(15);
            }
        });

        nineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method2(19);
            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("otherage","あなたに用はありません。お家に帰りなさい。");
                startActivity(intent);
            }
        });
    }

}