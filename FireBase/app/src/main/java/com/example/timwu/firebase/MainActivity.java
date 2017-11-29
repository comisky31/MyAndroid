package com.example.timwu.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.Firebase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity
{

    //FirebaseDatabase fireDB = FirebaseDatabase.getInstance();
    //DatabaseReference myRef = fireDB.getReference("contacts");
    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,android.R.id.text1);

        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_main);
        ListView list = (ListView)findViewById(R.id.listView1);

        list.setAdapter(adapter);

        Firebase myFirebaseRef = new Firebase("https://oo-basketball.firebaseio.com/");
        myFirebaseRef.child("message").setValue("Add database suceess");
        DatabaseReference reference_contacts = FirebaseDatabase.getInstance().getReference("contacts");

        reference_contacts.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                adapter.clear();

                for (DataSnapshot ds : dataSnapshot.getChildren() )
                {
                    adapter.add(ds.child("name").getValue().toString());
                    adapter.add(ds.child("age").getValue().toString());
                    adapter.add("fuck");
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value

            }
        });

    }


}
