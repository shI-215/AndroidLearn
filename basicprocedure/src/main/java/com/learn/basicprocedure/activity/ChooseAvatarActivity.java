package com.learn.basicprocedure.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.learn.basicprocedure.R;

public class ChooseAvatarActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_avatar;
    private TextView tv_modify_avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_avatar);
        initView();
    }

    private void initView() {
        iv_avatar = (ImageView) findViewById(R.id.iv_avatar);
        tv_modify_avatar = (TextView) findViewById(R.id.tv_modify_avatar);

        tv_modify_avatar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_modify_avatar:
                Intent intent = new Intent(ChooseAvatarActivity.this, HeadPortraitActivity.class);
                startActivityForResult(intent, 419);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 419 && resultCode == 420) {
            Bundle bundle = data.getExtras();
            int imageId = bundle.getInt("imageId");
            iv_avatar.setImageResource(imageId);
        }
    }
}
