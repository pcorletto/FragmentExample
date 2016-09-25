package com.example.android.fragmentexample.simplefrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.fragmentexample.R;

public class SimpleFragmentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_fragment);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_simple, container, false);

            Button btnClickMePenguin = (Button) rootView.findViewById(R.id.btnsimpleFragPenguin);

             btnClickMePenguin.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     Toast.makeText(getActivity(), "You clicked me small penguin", Toast.LENGTH_LONG).show();

                 }
             });

            return rootView;
        }
    }
}
