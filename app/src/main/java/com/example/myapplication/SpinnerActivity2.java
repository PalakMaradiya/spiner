package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity2 extends AppCompatActivity
{
    String weekar[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    String colourar[] = {"Yellow","Red","Green","Pink"};
    String monthsar[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    String carar[] = {"TATA","Maruti","Volvo","Hyundai","BMW","Audi","Nissan","Honda"};
    String bikear[] = {"Hero","Honda","Suzuki","Bajaj","Yamaha","Kawasaki"};
    String countryar[] = {"India","Australia","Canada","America","Pakistan","Russia","UK","London"};
    String numberar[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

    ImageView image;

    TextView txtWeekspinner , txtCountry ,txtBike;
    int imgar[] = {R.drawable.india,R.drawable.australia,R.drawable.canada,R.drawable.america,R.drawable.pakistan,R.drawable.russia,R.drawable.uk,R.drawable.russia};
    Spinner Spinner;
    Spinner Spinner2;
    Spinner Spinner3;
    Spinner Spinner4;
    Spinner Spinner5;
    Spinner Spinner6;
    
    ListView List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner2);

        week();
        colour();
        month();
        car();
        bike();
        country();
//        number();
    }




    //    spinner1
    private void week()
    {
        Spinner = findViewById(R.id.Spinner);

        WeekAdapter adapter = new WeekAdapter(weekar,SpinnerActivity2.this);
        Spinner.setAdapter(adapter);

        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    //    spinner2
    private void colour()
    {
        Spinner2 = findViewById(R.id.Spinner2);
        ColourAdapter adapter = new ColourAdapter(colourar,SpinnerActivity2.this);
        Spinner2.setAdapter(adapter);

        Spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    //    spinner3
    private void month() {
        Spinner3 = findViewById(R.id.Spinner3);
        MonthAdapter adapter = new MonthAdapter(monthsar,SpinnerActivity2.this);
        Spinner3.setAdapter(adapter);

        Spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    //    spinner4
    private void car() {
        Spinner4 = findViewById(R.id.Spinner4);
        CarAdapter adapter = new CarAdapter(carar,SpinnerActivity2.this);
        Spinner4.setAdapter(adapter);

        Spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    //    spinner5
    private void bike() {
        Spinner5 = findViewById(R.id.Spinner5);
        BikeAdapter adapter = new BikeAdapter(bikear,SpinnerActivity2.this);
        Spinner5.setAdapter(adapter);

        Spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    //    spinner6
    private void country() {
        Spinner6 = findViewById(R.id.Spinner6);
        txtCountry = findViewById(R.id.txtCountry);
        CountryAdapter adapter = new CountryAdapter(countryar,imgar,SpinnerActivity2.this);
        Spinner6.setAdapter(adapter);

        Spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
        //ListView
//    private void number() {
//        List = findViewById(R.id.List);
//        NumberAdapter adapter = new NumberAdapter(numberar,SpinnerActivity2.this);
//        List.setAdapter(adapter);
//
//        List.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });
//    }


}