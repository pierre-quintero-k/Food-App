package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import com.example.foodapp.databinding.ActivityMain2Binding;
import com.example.foodapp.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
    private ActivityMain3Binding binding;
    private WebView map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        View view= binding.getRoot();
        setContentView(view);
        map= binding.mapZone;
        map.getSettings().setJavaScriptEnabled(true);
        map.loadUrl("https://www.google.com/maps");

        ImageView back = binding.homeBtn;

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}