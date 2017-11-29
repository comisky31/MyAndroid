package com.example.timwu.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        textView = (TextView)findViewById(R.id.textView);
        checkBox.setOnCheckedChangeListener(checklistener);
        checkBox2.setOnCheckedChangeListener(checklistener);
        checkBox3.setOnCheckedChangeListener(checklistener);
    }

private CheckBox.OnCheckedChangeListener checklistener = new CompoundButton.OnCheckedChangeListener()
{

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b)
    {
        String box1,box2,box3;
        int n = 0;

        if(checkBox.isChecked())
        {
            n++;
        }
        if(checkBox2.isChecked())
        {
            n++;
        }
        if(checkBox3.isChecked())
        {
            n++;
        }

        textView.setText(n + "Box is Selected");

    }
};

}
