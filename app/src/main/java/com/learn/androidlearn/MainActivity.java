package com.learn.androidlearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.activity.ButtonActivity;
import com.learn.androidlearn.activity.FriendsCircleActivity;
import com.learn.androidlearn.activity.HimalayaActivity;
import com.learn.androidlearn.activity.LoginActivity;
import com.learn.androidlearn.activity.QQActivity;
import com.learn.androidlearn.activity.QQSpaceActivity;
import com.learn.androidlearn.activity.RabbitActivity;
import com.learn.androidlearn.activity.SoftwareUpdateActivity;
import com.learn.androidlearn.activity.SquareActivity;
import com.learn.androidlearn.activity.WeChatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_mobile_rabbit;
    private Button btn_software_update;
    private Button btn_wechat;
    private Button btn_square;
    private Button btn_himalayas;
    private Button btn_QQ;
    private Button btn_circle_of_friends;
    private Button btn_qq_space;
    private Button btn_login;
    private Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_mobile_rabbit = (Button) findViewById(R.id.btn_mobile_rabbit);

        btn_mobile_rabbit.setOnClickListener(this);
        btn_software_update = (Button) findViewById(R.id.btn_software_update);
        btn_software_update.setOnClickListener(this);
        btn_wechat = (Button) findViewById(R.id.btn_wechat);
        btn_wechat.setOnClickListener(this);
        btn_square = (Button) findViewById(R.id.btn_square);
        btn_square.setOnClickListener(this);
        btn_himalayas = (Button) findViewById(R.id.btn_himalayas);
        btn_himalayas.setOnClickListener(this);
        btn_QQ = (Button) findViewById(R.id.btn_QQ);
        btn_QQ.setOnClickListener(this);
        btn_circle_of_friends = (Button) findViewById(R.id.btn_circle_of_friends);
        btn_circle_of_friends.setOnClickListener(this);
        btn_qq_space = (Button) findViewById(R.id.btn_qq_space);
        btn_qq_space.setOnClickListener(this);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_mobile_rabbit:
                startActivity(new Intent(MainActivity.this, RabbitActivity.class));
                break;
            case R.id.btn_software_update:
                startActivity(new Intent(MainActivity.this, SoftwareUpdateActivity.class));
                break;
            case R.id.btn_wechat:
                startActivity(new Intent(MainActivity.this, WeChatActivity.class));
                break;
            case R.id.btn_square:
                startActivity(new Intent(MainActivity.this, SquareActivity.class));
                break;
            case R.id.btn_himalayas:
                startActivity(new Intent(MainActivity.this, HimalayaActivity.class));
                break;
            case R.id.btn_QQ:
                startActivity(new Intent(MainActivity.this, QQActivity.class));
                break;
            case R.id.btn_circle_of_friends:
                startActivity(new Intent(MainActivity.this, FriendsCircleActivity.class));
                break;
            case R.id.btn_qq_space:
                startActivity(new Intent(MainActivity.this, QQSpaceActivity.class));
                break;
            case R.id.btn_login:
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
            case R.id.btn_start:
                startActivity(new Intent(MainActivity.this, ButtonActivity.class));
                break;
        }
    }
}
