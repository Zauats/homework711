package com.example.homework711;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void synchronizationClick(View view){
        Intent intent = new Intent(Intent.ACTION_SYNC);
        Date date = new Date();
        int hours = date.getHours();

        // Вывод текущей даты и времени с использованием toString()
        if (hours >= 6 & hours < 14 )
            intent.setData(Uri.parse("http://morning"));
        else if (hours >= 14 & hours < 15 )
            intent.setData(Uri.parse("http://afternoon"));
        else if (hours >= 15 | hours < 6 )
            intent.setData(Uri.parse("http://evening"));


        startActivity(intent);
    }

}
