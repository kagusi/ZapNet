package com.zapnet.zapnet.Schedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zapnet.zapnet.R;

import java.util.Date;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Date date = (Date)getIntent().getSerializableExtra("Date");

        EventFragment frag = new EventFragment();
        Bundle bundle = new Bundle();
        bundle.putString("DateString", date.toString());
        frag.setArguments(bundle);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.EventActivity_eventFrag, frag)
                .commit();
    }
}
