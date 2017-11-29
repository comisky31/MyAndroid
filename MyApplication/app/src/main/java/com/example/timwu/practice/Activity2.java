package com.example.timwu.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by TimWu on 2017/8/30.
 */

public class Activity2 extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        Log.d("8888","Now in Activity2");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button)findViewById(R.id.button);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("Name");
        int age = bundle.getInt("Age");

        ObjectForIntent object = null;
        object = (ObjectForIntent)getIntent().getSerializableExtra("objectInformation");





        TextView textView = (TextView)findViewById(R.id.textView);
        //textView.setText(name + "/" + age);
        textView.setText(object.getName() + object.getAge());
        button.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                Intent i = new Intent();
                i.setClass(Activity2.this,MainActivity.class);
                startActivity(i);
                Activity2.this.finish();
            }
        });


    }

}



