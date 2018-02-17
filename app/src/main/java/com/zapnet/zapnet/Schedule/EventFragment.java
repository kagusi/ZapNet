package com.zapnet.zapnet.Schedule;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zapnet.zapnet.Model.Event;
import com.zapnet.zapnet.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {

    private TextView mHeaderTextView;
    private RecyclerView mEvenRecylcerView;
    private EventAdapter mAdapter;
    private List<Event> mEventList = new ArrayList<>(1);


    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event, container, false);

        String date = getArguments().getString("DateString");

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM HH:mm:ss z yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM/DD/yyyy");
        Date convertedDate = new Date();
        try {
            convertedDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Log.d("Calendar", dateFormat2.format(convertedDate));

        mAdapter = new EventAdapter(mEventList);
        mHeaderTextView = (TextView)view.findViewById(R.id.event_Header);
        mHeaderTextView.setText("Event(s) for : "+date.substring(0, 10));
        mEvenRecylcerView = (RecyclerView)view.findViewById(R.id.event_RecylerView);
        mEvenRecylcerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mEvenRecylcerView.setAdapter(mAdapter);

        return view;
    }

    public class EventAdapter extends RecyclerView.Adapter<EventHolder> {

        private List<Event> adapterEvent;

        public EventAdapter(List<Event> events){
            adapterEvent = events;
        }

        @Override
        public EventHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.event_display, parent, false);
            return new EventHolder(view);
        }

        @Override
        public void onBindViewHolder(EventHolder holder, int position) {
            holder.bind(adapterEvent.get(position));
        }

        @Override
        public int getItemCount() {
            return adapterEvent.size();
        }

    }

    public class EventHolder extends RecyclerView.ViewHolder{

        private Event holderEvent;
        private TextView eventTitle;
        private TextView eventTime;
        private TextView eventLocation;
        private TextView evenDescription;
        private ImageView deleteButton;

        public EventHolder(View itemView) {
            super(itemView);

            eventTitle = (TextView)itemView.findViewById(R.id.event_title);
            eventTime = (TextView)itemView.findViewById(R.id.event_Time);
            eventLocation = (TextView)itemView.findViewById(R.id.event_Location);
            evenDescription = (TextView)itemView.findViewById(R.id.event_Description);
            deleteButton = (ImageView)itemView.findViewById(R.id.event_DeleteButton);
            deleteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mEventList.remove(getAdapterPosition());
                    mAdapter.notifyDataSetChanged();
                }
            });
        }

        public void bind(Event event) {
            holderEvent = event;
            //mProfNameDisplay.setText(holdProfessor.getName());

        }
    }

}
