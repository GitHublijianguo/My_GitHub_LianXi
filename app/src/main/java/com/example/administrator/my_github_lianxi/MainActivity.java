package com.example.administrator.my_github_lianxi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initAdapter();
    }

    private void initAdapter() {
        MyAdapter adapter = new MyAdapter();
        listview.setAdapter(adapter);


    }

    private void initData() {

        for (int i = 0; i < 10; i++) {

        }
    }

    private void initView() {
        listview = (ListView) findViewById(R.id.listview);
    }
}
