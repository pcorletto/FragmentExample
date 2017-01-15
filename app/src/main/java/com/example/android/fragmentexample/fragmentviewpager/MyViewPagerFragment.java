package com.example.android.fragmentexample.fragmentviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.fragmentexample.R;

/**
 * Created by hernandez on 1/15/2017.
 */
public class MyViewPagerFragment extends Fragment {

        private static final String POSITION = "position";
        private static final String IMAGEID = "imageId";

        public MyViewPagerFragment() {

        }

        public static MyViewPagerFragment newInstance (int position, int imageId){

            MyViewPagerFragment myFrag = new MyViewPagerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(POSITION, position);
            bundle.putInt(IMAGEID, imageId);
            myFrag.setArguments(bundle);
            return myFrag;

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_view_pager, container, false);

            int position = getArguments().getInt(POSITION);
            int imageId = getArguments().getInt(IMAGEID);

            TextView tvCardNo = (TextView) rootView.findViewById(R.id.tvCardNo);
            tvCardNo.setText("Card no: " + (position+1));

            ImageView iv =(ImageView) rootView.findViewById(R.id.ivViewPager);
            iv.setImageResource(imageId);

            return rootView;
        }


}
