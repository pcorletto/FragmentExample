package com.example.android.fragmentexample.multiplefrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.fragmentexample.R;

/**
 * Created by hernandez on 9/23/2016.
 */
public class MenuFragment extends Fragment {

    Fragment frag;
    private FragmentTransaction fragTransaction;

    public MenuFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_multiple, container, false);

        frag = new KoalaFragment();
        fragTransaction = getFragmentManager().beginTransaction().add(R.id.container, frag);
        fragTransaction.commit();

        Button btnKoala = (Button) view.findViewById(R.id.btnKoala);
        Button btnPenguins = (Button) view.findViewById(R.id.btnPenguins);
        Button btnOther = (Button) view.findViewById(R.id.btnOther);

        btnKoala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frag = new KoalaFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });

        btnPenguins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frag = new PenguinFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });

        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frag = new OtherFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });



        return view;
    }
}
