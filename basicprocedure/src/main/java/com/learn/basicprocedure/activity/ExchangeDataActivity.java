package com.learn.basicprocedure.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.basicprocedure.R;

public class ExchangeDataActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edt_consignee;
    private EditText edt_contact_number;
    private EditText edt_contact_address;
    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_data);
        initView();
    }

    private void initView() {
        edt_consignee = (EditText) findViewById(R.id.edt_consignee);
        edt_contact_number = (EditText) findViewById(R.id.edt_contact_number);
        edt_contact_address = (EditText) findViewById(R.id.edt_contact_address);
        btn_submit = (Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_submit:
                submit();
                break;
        }
    }

    private void submit() {
        // validate
        String consignee = edt_consignee.getText().toString().trim();
        if (TextUtils.isEmpty(consignee)) {
            Toast.makeText(this, "收件人不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String number = edt_contact_number.getText().toString().trim();
        if (TextUtils.isEmpty(number)) {
            Toast.makeText(this, "联系电话不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String address = edt_contact_address.getText().toString().trim();
        if (TextUtils.isEmpty(address)) {
            Toast.makeText(this, "联系地址不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something

        Intent intent = new Intent(ExchangeDataActivity.this, DisplayDataActivity.class);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("consignee", consignee);
        bundle.putCharSequence("number", number);
        bundle.putCharSequence("address", address);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
