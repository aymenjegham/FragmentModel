package com.example.asus.fragmentmodel;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Aymen Jegham on 28/09/2018.
 */

public class Fragment2 extends android.support.v4.app.Fragment{
    private static final String TAG ="Fragment1";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavactiv2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         final View view =inflater.inflate(R.layout.fragment2_layout,container,false);

        btnNavFrag1 =(Button) view.findViewById(R.id.b_go_fg1);
        btnNavFrag2 =(Button) view.findViewById(R.id.b_go_fg_2);
        btnNavFrag3 =(Button) view.findViewById(R.id.b_go_fg_3);
        btnNavactiv2 =(Button) view.findViewById(R.id.b_go_activity);



        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to Fragment 1", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(0);
             }
        });
        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to Fragment 2", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });
        btnNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to Fragment 3", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });
        btnNavactiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to Fragment 1", Toast.LENGTH_SHORT).show();
                //navigate to fragment1
            }
        });


        return view;
    }
}
