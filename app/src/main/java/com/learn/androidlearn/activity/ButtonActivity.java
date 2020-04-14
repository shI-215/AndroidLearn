package com.learn.androidlearn.activity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.R;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        initView();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
    }

    private void initView() {
        start = (ImageButton) findViewById(R.id.start);

        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                Toast.makeText(ButtonActivity.this, "Hello", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
