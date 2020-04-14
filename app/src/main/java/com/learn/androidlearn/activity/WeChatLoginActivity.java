package com.learn.androidlearn.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.R;

public class WeChatLoginActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox options1;
    private CheckBox options2;
    private CheckBox options3;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we_chat_login);
        initView();
    }

    private void initView() {
        options1 = (CheckBox) findViewById(R.id.options1);
        options2 = (CheckBox) findViewById(R.id.options2);
        options3 = (CheckBox) findViewById(R.id.options3);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                String checked = "";
                if (options1.isChecked()) {
                    checked = checked + options1.getText();
                }
                if (options2.isChecked()) {
                    checked = checked + options2.getText();
                }
                if (options3.isChecked()) {
                    checked = checked + options3.getText();
                }
                Toast.makeText(WeChatLoginActivity.this, checked, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
