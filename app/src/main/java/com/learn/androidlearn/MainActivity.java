package com.learn.androidlearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.activity.ButtonActivity;
import com.learn.androidlearn.activity.DisplayImageActivity;
import com.learn.androidlearn.activity.DragBarActivity;
import com.learn.androidlearn.activity.DropDownListActivity;
import com.learn.androidlearn.activity.EvaluationActivity;
import com.learn.androidlearn.activity.FriendsCircleActivity;
import com.learn.androidlearn.activity.HimalayaActivity;
import com.learn.androidlearn.activity.LogicalReasoningActivity;
import com.learn.androidlearn.activity.LoginActivity;
import com.learn.androidlearn.activity.QQActivity;
import com.learn.androidlearn.activity.QQAlbumActivity;
import com.learn.androidlearn.activity.QQSpaceActivity;
import com.learn.androidlearn.activity.RabbitActivity;
import com.learn.androidlearn.activity.SoftwareUpdateActivity;
import com.learn.androidlearn.activity.SquareActivity;
import com.learn.androidlearn.activity.StartInterfaceActivity;
import com.learn.androidlearn.activity.WeChatActivity;
import com.learn.androidlearn.activity.WeChatAddressBookActivity;
import com.learn.androidlearn.activity.WeChatLoginActivity;

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
    private Button btn_logical_reasoning;
    private Button btn_wechat_login;
    private Button btn_start_interface;
    private Button btn_dragBar;
    private Button btn_evaluate;
    private Button btn_image_display;
    private Button btn_qq_album;
    private Button btn_drop_down_list;
    private Button btn_wechat_address_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_mobile_rabbit = (Button) findViewById(R.id.btn_mobile_rabbit);
        btn_software_update = (Button) findViewById(R.id.btn_software_update);
        btn_wechat = (Button) findViewById(R.id.btn_wechat);
        btn_square = (Button) findViewById(R.id.btn_square);
        btn_himalayas = (Button) findViewById(R.id.btn_himalayas);
        btn_QQ = (Button) findViewById(R.id.btn_QQ);
        btn_circle_of_friends = (Button) findViewById(R.id.btn_circle_of_friends);
        btn_qq_space = (Button) findViewById(R.id.btn_qq_space);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_logical_reasoning = (Button) findViewById(R.id.btn_logical_reasoning);
        btn_wechat_login = (Button) findViewById(R.id.btn_wechat_login);
        btn_start_interface = (Button) findViewById(R.id.btn_start_interface);
        btn_dragBar = (Button) findViewById(R.id.btn_dragBar);
        btn_evaluate = (Button) findViewById(R.id.btn_evaluate);
        btn_image_display = (Button) findViewById(R.id.btn_image_display);
        btn_qq_album = (Button) findViewById(R.id.btn_qq_album);
        btn_drop_down_list = (Button) findViewById(R.id.btn_drop_down_list);

        btn_mobile_rabbit.setOnClickListener(this);
        btn_software_update.setOnClickListener(this);
        btn_wechat.setOnClickListener(this);
        btn_square.setOnClickListener(this);
        btn_himalayas.setOnClickListener(this);
        btn_QQ.setOnClickListener(this);
        btn_circle_of_friends.setOnClickListener(this);
        btn_qq_space.setOnClickListener(this);
        btn_login.setOnClickListener(this);
        btn_start.setOnClickListener(this);
        btn_logical_reasoning.setOnClickListener(this);
        btn_wechat_login.setOnClickListener(this);
        btn_start_interface.setOnClickListener(this);
        btn_dragBar.setOnClickListener(this);
        btn_evaluate.setOnClickListener(this);
        btn_image_display.setOnClickListener(this);
        btn_qq_album.setOnClickListener(this);
        btn_drop_down_list.setOnClickListener(this);
        btn_wechat_address_book = (Button) findViewById(R.id.btn_wechat_address_book);
        btn_wechat_address_book.setOnClickListener(this);
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
            case R.id.btn_logical_reasoning:
                startActivity(new Intent(MainActivity.this, LogicalReasoningActivity.class));
                break;
            case R.id.btn_wechat_login:
                startActivity(new Intent(MainActivity.this, WeChatLoginActivity.class));
                break;
            case R.id.btn_start_interface:
                startActivity(new Intent(MainActivity.this, StartInterfaceActivity.class));
                break;
            case R.id.btn_dragBar:
                startActivity(new Intent(MainActivity.this, DragBarActivity.class));
                break;
            case R.id.btn_evaluate:
                startActivity(new Intent(MainActivity.this, EvaluationActivity.class));
                break;
            case R.id.btn_image_display:
                startActivity(new Intent(MainActivity.this, DisplayImageActivity.class));
                break;
            case R.id.btn_qq_album:
                startActivity(new Intent(MainActivity.this, QQAlbumActivity.class));
                break;
            case R.id.btn_drop_down_list:
                startActivity(new Intent(MainActivity.this, DropDownListActivity.class));
                break;
            case R.id.btn_wechat_address_book:
                startActivity(new Intent(MainActivity.this, WeChatAddressBookActivity.class));
                break;
        }
    }
}
