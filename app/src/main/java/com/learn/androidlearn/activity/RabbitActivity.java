package com.learn.androidlearn.activity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.R;
import com.learn.androidlearn.view.RabbitView;

public class RabbitActivity extends AppCompatActivity {

    private FrameLayout rabbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit);
        initView();
    }

    private void initView() {
        rabbit = (FrameLayout) findViewById(R.id.rabbit);

        final RabbitView rabbitView = new RabbitView(this);

        rabbitView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                rabbitView.X = event.getX();
                rabbitView.Y = event.getY();
                rabbitView.invalidate();
                return true;
            }
        });

        rabbit.addView(rabbitView);
    }
}
