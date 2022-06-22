package com.example.kotlin2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin2.databinding.ActivitySecond2Binding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecond2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecond2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getValue();
    }

    private void getValue() {
        String extraValue;
        Intent intent = getIntent();
        extraValue = intent.getStringExtra("key");
        binding.text.setText(extraValue);
    }
}