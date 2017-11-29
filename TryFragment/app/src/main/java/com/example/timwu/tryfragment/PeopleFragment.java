package com.example.timwu.tryfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PeopleFragment extends Fragment
{
    private long age = 0;
    private String name = null;
    private View view;

    public PeopleFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public  void onStart()
    {
        super.onStart();
        View view = getView();
        if (view!=null)
        {
            /*
            TextView age = (TextView)view.findViewById(R.id.age);
            TextView name = (TextView)view.findViewById(R.id.name);

            age.setText(""+ getAge());
            name.setText(getName());
            */
        }
    }


    public void setAge( long age )
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public Long getAge()
    {
        return age;
    }

}
