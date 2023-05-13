package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListviewArrayActivity extends AppCompatActivity {



    LinearLayout txtcall;
    ListView listView;

    ArrayList<String> obj = new ArrayList<>();
    ArrayList<String> Number = new ArrayList<>();
    ArrayList<Integer> image  = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_array);
        initview();
    }

    private void initview() {

        txtcall=findViewById(R.id.txtcall);
        listView = findViewById(R.id.listView);
        obj.add("Mummmy");
        obj.add("Papa");
        obj.add("Prachi");
        obj.add("Smit");
        obj.add("Kaushik");
        obj.add("Vivek");
        obj.add("Vishwas");
        obj.add("Mihir");
        obj.add("Umesh");
        obj.add("Monanak");
        obj.add("Subham");
        obj.add("Swarup");
        obj.add("Dixit");
        obj.add("Sanjay");
        obj.add("Akashy");
        obj.add("Vensi");
        obj.add("Himanshu");
        obj.add("Shruti");
        obj.add("Khushi");
        obj.add("Meet");

        obj.get(0);
        obj.get(1);
        obj.get(2);
        obj.get(3);
        obj.get(4);
        obj.get(5);
        obj.get(6);
        obj.get(7);
        obj.get(8);
        obj.get(9);
        obj.get(10);
        obj.get(11);
        obj.get(12);
        obj.get(13);
        obj.get(14);
        obj.get(15);
        obj.get(16);
        obj.get(17);
        obj.get(18);
        obj.get(19);


        Number.add("9978197557");
        Number.add("6351591747");
        Number.add("7069962540");
        Number.add("8141247376");
        Number.add("9054264609");
        Number.add("7069033821");
        Number.add("6354296986");
        Number.add("9023345747");
        Number.add("9510789849");
        Number.add("9409857555");
        Number.add("7359298919");
        Number.add("9724476102");
        Number.add("9016185937");
        Number.add("7405487568");
        Number.add("6351965430");
        Number.add("9081044600");
        Number.add("9033699969");
        Number.add("9316871168");
        Number.add("9727421014");
        Number.add("9624355362");



        Number.get(0);
        Number.get(1);
        Number.get(2);
        Number.get(3);
        Number.get(4);
        Number.get(5);
        Number.get(6);
        Number.get(7);
        Number.get(8);
        Number.get(9);
        Number.get(10);
        Number.get(11);
        Number.get(12);
        Number.get(13);
        Number.get(14);
        Number.get(15);
        Number.get(16);
        Number.get(16);
        Number.get(18);
        Number.get(19);


        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);
        image.add(R.drawable.india);


        image.get(0);
        image.get(1);
        image.get(2);
        image.get(3);
        image.get(4);
        image.get(5);
        image.get(6);
        image.get(7);
        image.get(8);
        image.get(9);
        image.get(10);
        image.get(11);
        image.get(12);
        image.get(13);
        image.get(14);
        image.get(15);
        image.get(16);
        image.get(17);
        image.get(18);
        image.get(19);

        ListviewArraylistAdapter adapter = new ListviewArraylistAdapter(ListviewArrayActivity.this,obj,image,Number);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String phone=Number.get(i);
//
//                Toast.makeText(ListviewArrayActivity.this, "number is ==> "+phone, Toast.LENGTH_SHORT).show();

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+phone));//change the number
                startActivity(callIntent);
            }
        });


    }
}