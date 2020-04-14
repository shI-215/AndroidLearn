package com.learn.androidlearn.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.R;

public class StartInterfaceActivity extends AppCompatActivity {

    private ProgressBar load;
    private int schedule = 0;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_interface);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        initView();
    }

    private void initView() {
        load = (ProgressBar) findViewById(R.id.load);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    schedule = dowork();
                    Message message = new Message();
                    if (schedule < 100) {
                        message.what = 1;
                        handler.sendMessage(message);
                    } else {
                        message.what = 0;
                        handler.sendMessage(message);
                        break;
                    }
                }
            }
        }).start();

        handler = new Handler() {
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    load.setProgress(schedule);
                } else {
                    Toast.makeText(StartInterfaceActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
                    load.setVisibility(View.GONE);
                }
            }
        };
    }

    private int dowork() {
        schedule += Math.random() * 10;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return schedule;
    }
}
