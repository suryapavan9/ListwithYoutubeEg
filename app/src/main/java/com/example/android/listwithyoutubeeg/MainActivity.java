package com.example.android.listwithyoutubeeg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        ListView listView;
        ArrayList<String> arrayList;
        MyAdapter myAdapter;

        String titles[] = {"Dot Net Professional", "Csharp Fresher", "Csharp Professtional", "SQL Fresher", "SQL Experience"};
        String duration[] = {"duration:37 hrs", "duration:48 hrs", "duration:13 hrs", "duration:40 hrs", "duration:30 hrs"};
        String assignment[] = {"assignment:14 hrs", "assignment:18 hrs", "assignment:5 hrs", "assignment:15 hrs", "assignment:16 hrs"};
        String test[] = {"test:22 hrs", "test:29 hrs", "test:12 hrs", "test:21 hrs", "test:12 hrs"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            listView = (ListView) findViewById(R.id.listview1);
            arrayList = new ArrayList<String>();
            myAdapter = new MyAdapter();
            for (int i = 0; i < titles.length; i++) {
                arrayList.add(titles[i] + "\n" + duration[i] + "\n" + assignment[i] + "\n" + test[i]);
            }
            myAdapter = new MyAdapter();
            listView.setAdapter(myAdapter);


            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("whichCourse_pos", position);
                    startActivity(i);
                }
            });
        }

        public class MyAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                return arrayList.size();
            }

            @Override
            public Object getItem(int position) {
                return arrayList.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                //load data from source
//            CourseInfo courseInfo = arrayList.get(position);

                //load single_row.xml and initialize all views
                View v = getLayoutInflater().inflate(R.layout.single_row, null);//we can write listView in place of null, it shows that where we use this View. but if we write listView so row.xml is become twice because we also return View.

                TextView textView = (TextView) v.findViewById(R.id.course);

                //fill data onto all views
                textView.setText(arrayList.get(position));

                //return row.xml
                return v;
            }
        }
}