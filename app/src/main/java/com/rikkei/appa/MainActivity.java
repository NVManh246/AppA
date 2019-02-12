package com.rikkei.appa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tvDemo = findViewById(R.id.text_demo);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(OpenAppReceiver.EXTRA_MESSAGE);
        tvDemo.setText(msg);
    }
}
