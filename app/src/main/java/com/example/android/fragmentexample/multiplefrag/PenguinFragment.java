package com.example.android.fragmentexample.multiplefrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.fragmentexample.R;

/**
 * Created by hernandez on 9/23/2016.
 */
public class PenguinFragment extends Fragment{

    public PenguinFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_multiple_penguin, container, false);

        return rootView;

    }
}
