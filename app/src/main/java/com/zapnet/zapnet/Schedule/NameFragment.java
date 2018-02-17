package com.zapnet.zapnet.Schedule;


import android.os.Bundle;
import android.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zapnet.zapnet.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NameFragment extends Fragment {

    EditText mNameEditText;
    Button mSubmitButton;

    public NameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_name, container, false);

        mNameEditText = (EditText)view.findViewById(R.id.nameFrag_name);
        mSubmitButton = (Button)view.findViewById(R.id.nameFrag_submitButton);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(mNameEditText.getText().toString().trim()))
                {
                    Toast.makeText(getActivity(), "PLEASE ENTER YOUR Name", Toast.LENGTH_LONG).show();
                }else{
                    String name = mNameEditText.getText().toString().trim();
                }
            }
        });

        return view;
    }

}
