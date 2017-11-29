package com.example.timwu.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button2 = null;
    Button button1 = null;
    //BlankFragment mFragment01 = new BlankFragment();
    //BlankFragment2 mFragment02 = new BlankFragment2();
    FragmentManager fragmentMgr = getSupportFragmentManager();
    FragmentTransaction fragmentTrans = fragmentMgr.beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //fragmentMgr.beginTransaction().add(R.id.fragment1, mFragment01);
        //fragmentMgr.beginTransaction().remove(mFragment01);


        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //fragmentMgr.beginTransaction().add(R.id.fragment1, mFragment01).commit();
            }
        });

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });
    }


}
