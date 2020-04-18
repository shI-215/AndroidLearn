package com.learn.androidlearn.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.learn.androidlearn.R;
import com.learn.androidlearn.adapter.AddressBookAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeChatAddressBookActivity extends AppCompatActivity {

    private ListView list_view;

    private int[] images = {R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello,
            R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello, R.drawable.hello};
    private String[] texts = {"李一", "李明", "李明", "李明", "李明", "李明", "李明", "李一", "李明",
            "李明", "李明", "李明", "李明", "李明"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we_chat_address_book);
        initView();
    }

    private void initView() {
        list_view = (ListView) findViewById(R.id.list_view);

        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < images.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("image", images[i]);
            map.put("text", texts[i]);
            list.add(map);
        }

        AddressBookAdapter addressBookAdapter = new AddressBookAdapter(this, list);
        list_view.setAdapter(addressBookAdapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Map<String, Object> map = (Map<String, Object>) parent.getItemAtPosition(position);
                Toast.makeText(WeChatAddressBookActivity.this, map.get("text").toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
