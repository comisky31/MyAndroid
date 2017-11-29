package com.example.timwu.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        Log.d("8888","Now in Activity1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Activity2.class);
                ObjectForIntent object = new ObjectForIntent();

                object.setAge(88);
                object.setName("Papa");

                Bundle bundle = new Bundle();
                bundle.putString("Name","Wu Ting Yu");
                bundle.putInt("Age",18);
                bundle.putSerializable("objectInformation",object);

                intent.putExtras(bundle);

                startActivity(intent);
                MainActivity.this.finish();
            }
        });


    }
}
