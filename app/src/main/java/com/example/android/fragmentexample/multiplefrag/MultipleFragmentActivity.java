package com.example.android.fragmentexample.multiplefrag;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.example.android.fragmentexample.R;

public class MultipleFragmentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_fragment);

        if(savedInstanceState == null){

            getSupportFragmentManager().beginTransaction().add(R.id.menuContainer,
                    new MenuFragment()).commit();

        }



    }

}
