package com.example.slamtek566a;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DASHBOARD1 extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate (R.layout.fragment_d_a_s_h_b_o_a_r_d1, container, false);
        Button next = v.findViewById(R.id.bu1);

        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), Login.class);
                startActivity(intent);

            }

        });



        Button go = v.findViewById(R.id.bu2);

        go.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), Login2.class);
                startActivity(intent);

            }

        });

        return v;



    }
}


//Intent next = new Intent(getActivity(),Login.class);
//                startActivity(next);