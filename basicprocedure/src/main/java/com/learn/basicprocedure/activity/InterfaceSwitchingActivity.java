package com.learn.basicprocedure.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.learn.basicprocedure.R;
import com.learn.basicprocedure.fragment.OneFragment;
import com.learn.basicprocedure.fragment.WeChatFragment;

public class InterfaceSwitchingActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_colleague;
    private ImageView iv_travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_switching);
        initView();
    }

    private void initView() {
        iv_colleague = (ImageView) findViewById(R.id.iv_colleague);
        iv_travel = (ImageView) findViewById(R.id.iv_travel);

        iv_colleague.setOnClickListener(this);
        iv_travel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();//开启事物
        Fragment f = null;
        switch (v.getId()) {
            case R.id.iv_colleague:
                f = new WeChatFragment();
                break;
            case R.id.iv_travel:
                f = new OneFragment();
                break;
        }
        ft.replace(R.id.fragment, f);
        ft.commit();
    }
}
