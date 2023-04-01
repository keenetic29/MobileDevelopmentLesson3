package com.mirea.andreevai.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public Intent intent;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));
        text = findViewById(R.id.textView);
        text.setText(dateString);
        intent = new Intent(this, SecondActivity.class);
        intent.putExtra("dateText",dateString);
    }

    public void onButtonClick(View view)
    {
        startActivity(intent);
    }
}