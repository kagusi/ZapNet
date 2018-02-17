package com.zapnet.zapnet.AddEvent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zapnet.zapnet.R;

public class addEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        addEventFragment frag = new addEventFragment();
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.addEvent_FragLayout, frag)
                .commit();
    }
}
