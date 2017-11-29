package com.example.timwu.tryfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    private long age;
    private String name;
    //Button button1 = (Button)findViewById(R.id.button1);
    //Button button2 = (Button)findViewById(R.id.button2);
    //PeopleFragment peopleFragment = (PeopleFragment)getFragmentManager().findFragmentById(R.id.fragment);
    PeopleFragment peopleFragment = new PeopleFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);

        FragmentManager fragMgr = getSupportFragmentManager();
        //PeopleFragment peopleFragment = new PeopleFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.activity_main,peopleFragment);
        //fragmentTransaction.add(R.id.activity_main, peopleFragment);



        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                age = 51 ;
                name = "mother";
                peopleFragment.setAge(age);
                peopleFragment.setName(name);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                age = 17 ;
                name = "sister";
                peopleFragment.setAge(age);
                peopleFragment.setName(name);
            }
        });


    }






}
