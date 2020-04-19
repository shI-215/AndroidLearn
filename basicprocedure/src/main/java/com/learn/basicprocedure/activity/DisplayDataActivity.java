package com.learn.basicprocedure.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.basicprocedure.R;

public class DisplayDataActivity extends AppCompatActivity {

    private String text;

    private TextView tv_show_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        text = bundle.getString("consignee") + " " + bundle.getString("number") + " " +
                bundle.getString("address");
        initView();
    }

    private void initView() {
        tv_show_text = (TextView) findViewById(R.id.tv_show_text);

        tv_show_text.setText(text);
    }
}
