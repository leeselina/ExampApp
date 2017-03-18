package com.example.sungeun.examapp.exam_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sungeun.examapp.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        // View
        mListView = (ListView) findViewById(R.id.list);

        // Data
        List<String> data = new ArrayList<>();
        for ( int i=0 ; i<100; i++){
            data.add("data" + i);
        }

        // Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data);

        mListView.setAdapter(adapter);

        //클릭 이벤트
        mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(ListViewActivity.this, "position: "+ i , Toast.LENGTH_SHORT).show();

    }
}
