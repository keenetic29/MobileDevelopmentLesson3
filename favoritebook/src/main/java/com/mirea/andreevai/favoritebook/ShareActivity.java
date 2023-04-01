package com.mirea.andreevai.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    EditText someText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Мой любимая книга: %s", university));
        }
        someText = findViewById(R.id.editTextTextPersonName);
    }

    public void onButtonClick(View view)
    {
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, someText.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}