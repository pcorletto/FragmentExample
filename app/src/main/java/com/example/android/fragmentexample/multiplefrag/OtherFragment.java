package com.example.android.fragmentexample.multiplefrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.fragmentexample.R;

/**
 * Created by hernandez on 9/23/2016.
 */
public class OtherFragment extends Fragment{

    public OtherFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_multiple_other, container, false);

        Button btnMultiOther = (Button) rootView.findViewById(R.id.btnMultiOther);

        btnMultiOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "You clicked me other penguin", Toast.LENGTH_LONG).show();
            }

        });

        return rootView;

    }
}
