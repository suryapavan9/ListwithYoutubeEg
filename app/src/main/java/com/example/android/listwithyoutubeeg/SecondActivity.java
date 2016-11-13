package com.example.android.listwithyoutubeeg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    SecondAdapter secondAdapter;
    int courseSelection;

    private String[] full_dot_net = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "C# data types/L_gFuuSp4V0/17:53",
            "C# class/l1C4FZGCab0/10:48",
            "C# class as virtual entity/HSdIq3k51bg/9:15",
            "Objects in c#/SM_QqUdMXY0/22:14",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "C# Arrays/CLnA6OAlNPk/24:50",
            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
            "Arrays Assignment/Zt85ireWQWw/7:49",
            "Loops/u_k75WcEpHM/5:51",
            "for-loop/isSp9xjw0LQ/23:46",
            "C# Strings/MGCZ8AHhwDA/21:02",
            "Constructors/5h8Tu68VXsI/5:08",
            "Problems When Constructor is Not Used/Yij6AUta4yI/19:41",
            "Constructors Example/Gr6qsjTIifA/21:07",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52",
            "Static Variables/zvk_hS4vEOw/9:27",
            "what is the use of properties in c#/UdiU6sp68Tc/16:16",
            "c# properties/5nHmt5Zi7l8/15:03",
            "c# constants/9_fH7R6rPaU/8:57",
            "Constants Part 2/Wn20d0KBk1o/8:22",
            "Read only variables/YfYkswfGo_k/9:27",
            "Params Keyword/wZ_bBpsd10o/16:27",
            "Exceptions/wBxVpzaTXkc/17:16",
            "Exception Handling Part 2/mTF-ct2IkGU/9:25",
            "GC Terminology/eyytXkQqOV0/17:16",
            "Dead objects/YZyKaiM5kuc/8:29",
            "GC Working mechanisam/v-VTR9Xm6Vk/9:51",
            "C# Generics/-xfzPrvKFL0/10:09",
            "C# Generics and Reusability/7g9aPw1kI1o/15:32",
            "C# Delegates/k0evYKS62Tg/7:27",
            "C# Delegates example/Vjc9UHV6tTM/22:38"
    };
    private String[] csharp_freshers_demo_videos = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "C# data types/L_gFuuSp4V0/17:53",
            "C# class/l1C4FZGCab0/10:48",
            "C# class as virtual entity/HSdIq3k51bg/9:15",
            "Objects in c#/SM_QqUdMXY0/22:14",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "C# Arrays/CLnA6OAlNPk/24:50",
            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
            "Arrays Assignment/Zt85ireWQWw/7:49",
            "Loops/u_k75WcEpHM/5:51",
            "for-loop/isSp9xjw0LQ/23:46",
            "C# Strings/MGCZ8AHhwDA/21:02",
            "Constructors/5h8Tu68VXsI/5:08",
            "Problems When Constructor is Not Used/Yij6AUta4yI/19:41",
            "Constructors Example/Gr6qsjTIifA/21:07",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52"
    };

    private String[] csharp_exp_demo_videos = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52",
            "Static Variables/zvk_hS4vEOw/9:27",
            "what is the use of properties in c#/UdiU6sp68Tc/16:16",
            "c# properties/5nHmt5Zi7l8/15:03",
            "c# constants/9_fH7R6rPaU/8:57",
            "Constants Part 2/Wn20d0KBk1o/8:22",
            "Read only variables/YfYkswfGo_k/9:27",
            "Params Keyword/wZ_bBpsd10o/16:27",
            "Exceptions/wBxVpzaTXkc/17:16",
            "Exception Handling Part 2/mTF-ct2IkGU/9:25",
            "GC Terminology/eyytXkQqOV0/17:16",
            "Dead objects/YZyKaiM5kuc/8:29",
            "GC Working mechanisam/v-VTR9Xm6Vk/9:51",
            "C# Generics/-xfzPrvKFL0/10:09",
            "C# Generics and Reusability/7g9aPw1kI1o/15:32",
            "C# Delegates/k0evYKS62Tg/7:27",
            "C# Delegates example/Vjc9UHV6tTM/22:38"
    };
    private String[] sql_server_freshers_demo_videos = {
            "SQLServer Overview/Kdc84lpF4GM/16:25",
            "Normalization/7Dc7_I48ZTg/14:30",
            "Orderby clause/quuwLXzZl3g/6:59",
            "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
            "Aggregate Functions/2IYykxAXaB8/13:54",
            "Group by clause/qx0j5iWajqg/20:22",
            "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
            "stored procedure/jmZsXlAYe7Y/17:11",
            "User defined functions in sql/8cJFtDESxiQ/9:01",
            "Indexes/hrVpqW_Bh2o/21:09"
    };

    private String[] sql_server_exp_demo_videos = {
            "SQLServer Overview/Kdc84lpF4GM/16:25",
            "Normalization/7Dc7_I48ZTg/14:30",
            "Orderby clause/quuwLXzZl3g/6:59",
            "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
            "Aggregate Functions/2IYykxAXaB8/13:54",
            "Group by clause/qx0j5iWajqg/20:22",
            "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
            "stored procedure/jmZsXlAYe7Y/17:11",
            "User defined functions in sql/8cJFtDESxiQ/9:01",
            "Indexes/hrVpqW_Bh2o/21:19"
    };
    String[][] arr = {full_dot_net,csharp_freshers_demo_videos,csharp_exp_demo_videos,sql_server_freshers_demo_videos,sql_server_exp_demo_videos};
    ArrayList<String> topics_arraylist;
    ArrayList<String> duration_arrayList;
    ArrayList<String> link_arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView = (ListView) findViewById(R.id.listView2);
        arrayList = new ArrayList<String>();
        secondAdapter = new SecondAdapter();
        topics_arraylist = new ArrayList<String>();
        duration_arrayList = new ArrayList<String>();
        link_arrayList = new ArrayList<String>();

        Intent intent = new Intent();
        Bundle b = getIntent().getExtras();
        courseSelection = b.getInt("whichCourse_pos",0);

        int length_course = arr[courseSelection].length;
        String[][] str_1 = new String[length_course][3];
        for(int j=0;j<length_course;j++)
        {
            for (int k=0;k<3;k++)
            {
                String str[] = (arr[courseSelection])[j].split("/");
                str_1[j][k] = str[k];
            }

        }
        for (int k=0;k<length_course;k++)
        {
            topics_arraylist.add(str_1[k][0]);
        }

        for (int k=0;k<length_course;k++)
        {
            link_arrayList.add(str_1[k][1]);
        }

        for (int k=0;k<length_course;k++)
        {
            duration_arrayList.add(str_1[k][2]);
            arrayList.add(arr[courseSelection][k]);
        }

        listView.setAdapter(secondAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                View v = listView.getChildAt(position);
                Button button = (Button) v.findViewById(R.id.csharp_demo_button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(SecondActivity.this,ThirdActivity.class);
                        String link_intent = link_arrayList.get(position);
                        i.putExtra("video_link",link_intent);
                        startActivity(i);
                    }
                });
            }
        });
    }
    public class SecondAdapter extends BaseAdapter {

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


            View v1 = getLayoutInflater().inflate(R.layout.single_row2,null);

            TextView topic = (TextView) v1.findViewById(R.id.csharp_fre_vid_top_text);
            TextView duration = (TextView) v1.findViewById(R.id.csharp_fre_vid_dura_text);
            topic.setText("topics :"+topics_arraylist.get(position));
            duration.setText(" duration:"+duration_arrayList.get(position));

            return v1;
        }
    }

}
