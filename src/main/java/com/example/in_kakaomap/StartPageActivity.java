package com.example.in_kakaomap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import net.daum.mf.map.api.MapView;

public class StartPageActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);

        button= (Button) findViewById(R.id.startbtn);

        button.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View view) {
                  startActivity(new Intent(getApplicationContext(), MainActivity.class));
              }
            });
        getSupportActionBar().hide();
    }
}