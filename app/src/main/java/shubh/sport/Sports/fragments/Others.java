package shubh.sport.Sports.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import shubh.sport.R;
import shubh.sport.Sports.EventActivity;
import shubh.sport.Sports.adapters.CustomListGraphAdapter;


public class Others extends Fragment {


    public Others() {
        // Required empty public constructor
    }

    private GridView graphlist;
    private ArrayList<String> graphalgo=new ArrayList<String>();
    private CustomListGraphAdapter adapter;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.sports, container, false);
        graphlist= (GridView) v.findViewById(R.id.list4);
        graphalgo.add(0,"CRICKET");

        adapter=new CustomListGraphAdapter(getActivity(),graphalgo);
        graphlist.setAdapter(adapter);
        graphlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getActivity(), EventActivity.class);
                intent.putExtra("graphname",graphalgo.get(i));
                startActivity(intent);
            }
        });
        return v;
    }

    public static Others newInstance(int position) {
        Others fragment = new Others();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}
