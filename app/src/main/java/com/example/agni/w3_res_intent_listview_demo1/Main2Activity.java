package com.example.agni.w3_res_intent_listview_demo1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import static Utils.Utils.MSG_KEY_INTENT;

public class Main2Activity extends AppCompatActivity {
    private Button btn1;
    private EditText editText1;
    private ListView listView;
    private String[] myItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=(ListView)findViewById(R.id.list_view_ma1)
        btn1=(Button)findViewById(R.id.btn);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()){
           @Override
           public void onItemClick(AdapterView<?>, View view, int pstn, long l)  {
                listView.setBackgroundColor(Color.LTGRAY);
                Intent exIntent = new Intent(MainActivity.this,Main2Activity.class);
                exIntent.putExtra(MSG_KEY_INTENT,"Age is"+myItems[pstn]);
                startActivity(exIntent);
            }
        };
    }
}
