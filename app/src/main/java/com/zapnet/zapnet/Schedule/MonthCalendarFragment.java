package com.zapnet.zapnet.Schedule;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
//import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;

import com.roomorama.caldroid.CaldroidFragment;
import com.zapnet.zapnet.R;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class MonthCalendarFragment extends Fragment{


    public MonthCalendarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_month_calendar, container, false);
       // showDateDialog();

        return view;
    }



/*
    //Setup and show Date Dialog box
    public void showDateDialog(){
        Calendar max = Calendar.getInstance();
        Calendar min = Calendar.getInstance();
        max.set(max.get(java.util.Calendar.YEAR),11,31);
        Calendar now = Calendar.getInstance();
        DatePickerDialog dpd = DatePickerDialog.newInstance(
                this,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        );
        dpd.setMaxDate(min);
        dpd.setMaxDate(max);
        //dpd.setSelectableDays(setUpCalendar());
        dpd.setTitle("View OR Add Event");
        dpd.show(getFragmentManager(), "Datepickerdialog");

    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String date = year+"-"+(monthOfYear+1)+"-"+dayOfMonth;
    }
    */
}
