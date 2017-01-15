package com.example.android.fragmentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.android.fragmentexample.fragmentviewpager.ViewPagerActivity;
import com.example.android.fragmentexample.multiplefrag.MultipleFragmentActivity;
import com.example.android.fragmentexample.simplefrag.SimpleFragmentActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void simple(View v){

        Intent intent = new Intent(getApplicationContext(), SimpleFragmentActivity.class);
        startActivity(intent);

    }

    public void multiple(View v){

        Intent intent = new Intent(getApplicationContext(), MultipleFragmentActivity.class);
        startActivity(intent);

    }

    public void pager(View v){

        Intent intent = new Intent(getApplicationContext(), ViewPagerActivity.class);
        startActivity(intent);

    }


}
