package com.learn.androidlearn.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.R;

public class LogicalReasoningActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup answer;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logical_reasoning);
        initView();
    }

    private void initView() {
        answer = (RadioGroup) findViewById(R.id.answer);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.submit:
                for (int i = 0; i < answer.getChildCount(); i++) {
                    RadioButton radioButton = (RadioButton) answer.getChildAt(i);
                    if (radioButton.isChecked()) {
                        if (TextUtils.equals(radioButton.getText(), "2")) {
                            Toast.makeText(LogicalReasoningActivity.this, "回答正确", Toast.LENGTH_LONG).show();
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(LogicalReasoningActivity.this);
                            builder.setMessage("回答错误");
                            builder.setPositiveButton("确定", null).show();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
