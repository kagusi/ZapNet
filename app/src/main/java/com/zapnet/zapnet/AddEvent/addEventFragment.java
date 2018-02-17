package com.zapnet.zapnet.AddEvent;


import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

import com.zapnet.zapnet.R;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class addEventFragment extends Fragment {

    private EditText mEventTitleEditText;
    private EditText mEventLocationEditText;
    private EditText mEventStartTimeEditText;
    private EditText mEventEndTimeEditText;
    private EditText mEventDateEditText;
    private EditText mEventDescriptionEditText;
    private Button mEventSubmitButton;

    public addEventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_event, container, false);

        mEventTitleEditText = (EditText)view.findViewById(R.id.addEvent_Title);
        mEventLocationEditText = (EditText)view.findViewById(R.id.addEvent_Location);
        mEventStartTimeEditText = (EditText)view.findViewById(R.id.addEvent_StartTime);
        mEventEndTimeEditText = (EditText)view.findViewById(R.id.addEvent_EndTime);
        mEventDateEditText = (EditText)view.findViewById(R.id.addEvent_Date);
        mEventDescriptionEditText = (EditText)view.findViewById(R.id.addEvent_Description);
        mEventSubmitButton = (Button)view.findViewById(R.id.addEvent_submitButton);

        mEventDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mEventSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return view;
    }

    public void showTimePickerDialog(View v) {
        TimePickerFragment newFragment = new TimePickerFragment();
        newFragment.showTimePickerDialog(v);
    }

}
