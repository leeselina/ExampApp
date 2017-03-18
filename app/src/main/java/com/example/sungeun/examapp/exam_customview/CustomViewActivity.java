package com.example.sungeun.examapp.exam_customview;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sungeun.examapp.R;

public class CustomViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);

        ListView listview;
        ListViewAdapter adapter;

        //Adapter 생성
        adapter = new ListViewAdapter();

        //리스트 뷰 참조 및 Adapter 달기
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        //첫 번재 아이템 추가
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"Box","Account Box Black 36dp");

        //첫 번재 아이템 추가
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"Circle","Account Circle Black 36dp");

        //첫 번재 아이템 추가
        adapter.addItem(ContextCompat.getDrawable(this, R.mipmap.ic_launcher),"Ind","Assignment Ind Black 36dp");


        // 위에서 생성한 listview에 클릭 이벤트 핸들러 정의.
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position) ;

                String titleStr = item.getTitle() ;
                String descStr = item.getDesc() ;
                Drawable iconDrawable = item.getIcon() ;

                // TODO : use item data.
            }
        }) ;
    }
}
