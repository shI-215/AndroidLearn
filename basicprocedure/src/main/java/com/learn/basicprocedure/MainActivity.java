package com.learn.basicprocedure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.basicprocedure.activity.ChooseAvatarActivity;
import com.learn.basicprocedure.activity.ExchangeDataActivity;
import com.learn.basicprocedure.activity.InterfaceSwitchingActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_save_content;
    private Button btn_modify_avatar;
    private Button btn_interface_switching;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_save_content = (Button) findViewById(R.id.btn_save_content);

        btn_save_content.setOnClickListener(this);
        btn_modify_avatar = (Button) findViewById(R.id.btn_modify_avatar);
        btn_modify_avatar.setOnClickListener(this);
        btn_interface_switching = (Button) findViewById(R.id.btn_interface_switching);
        btn_interface_switching.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_save_content:
                startActivity(new Intent(MainActivity.this, ExchangeDataActivity.class));
                break;
            case R.id.btn_modify_avatar:
                startActivity(new Intent(MainActivity.this, ChooseAvatarActivity.class));
                break;
            case R.id.btn_interface_switching:
                startActivity(new Intent(MainActivity.this, InterfaceSwitchingActivity.class));
                break;
        }
    }
}
