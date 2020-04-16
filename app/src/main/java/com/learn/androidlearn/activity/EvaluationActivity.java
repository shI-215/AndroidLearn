package com.learn.androidlearn.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.R;

public class EvaluationActivity extends AppCompatActivity implements View.OnClickListener {

    private RatingBar evaluate;
    private Button refer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);
        initView();
    }

    private void initView() {
        evaluate = (RatingBar) findViewById(R.id.evaluate);
        refer = (Button) findViewById(R.id.refer);

        refer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.refer:
                int result = evaluate.getProgress();//获取进度
                float rating = evaluate.getRating();//获取等级
                float step = evaluate.getStepSize();//获取星级
                Toast.makeText(EvaluationActivity.this, "result:" + result + " rating:" + rating + " step:" + step, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
