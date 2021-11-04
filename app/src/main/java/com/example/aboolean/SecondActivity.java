package com.example.aboolean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv = findViewById(R.id.textView);

        Intent i = getIntent();

        //int
        int smallbaby  = i.getIntExtra("age",-1);

        //Sring わからない
        String idontknow = i.getStringExtra("dknow");

        //String その他
        String otherages = i.getStringExtra("otherage");

        //はい、いいえ
        boolean yes = i.getBooleanExtra("Contents",false);



        if(smallbaby != -1) {
            String teenager = String.valueOf(smallbaby);
            tv.setText(teenager);
        } else if (idontknow != null){
            tv.setText(idontknow);
        } else if(otherages != null) {
            tv.setText(otherages);
        } else if(yes) {
            tv.setText("20歳になったら以下のことができます。\n・選挙に参加できます。（18歳から可能）\n・お酒が飲めるようになります。\n・たばこが吸えるようになります。\n・刑事裁判の裁判員に選ばれる可能性があります。\n・競馬、競輪など公営競技の投票券が購入できるようになります。\n・ローン契約や賃貸契約など契約行為に親の同意がいらなくなります。\n・養子を迎えることができます。\n・国民年金への加入義務が発生します。\n・取得できる免許、資格の幅が広がります。\n・親の同意なく結婚できます。");
        } else {
            tv.setText("あなたにできることはそう多くはありません。保護者の方に感謝して、しっかりと大人になる準備をしましょう。");
        }
    }
}
