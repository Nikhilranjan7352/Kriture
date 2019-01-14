package com.example.nikhil.kriture;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Level_Selector extends Fragment implements View.OnClickListener {

     TextView lvl1,lvl2,lvl3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_level__selector, container, false);
        lvl1=view.findViewById(R.id.textView2);
        lvl2=view.findViewById(R.id.textView3);
        lvl3=view.findViewById(R.id.textView4);
        lvl1.setOnClickListener(this);
        lvl2.setOnClickListener(this);
        lvl3.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.textView2)
        {
           getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new BlankFragment()).commit();
        }
        else if(view.getId()==R.id.textView3)
        {

        }
        else
        {

        }




    }
}
