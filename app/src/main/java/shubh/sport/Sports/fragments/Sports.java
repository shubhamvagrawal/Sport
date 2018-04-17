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


public class Sports extends Fragment {
    public Sports() {
        // Required empty public constructor
    }
    private GridView graphlist;
    private ArrayList<String> graphalgo=new ArrayList<String>();
    private CustomListGraphAdapter adapter;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.sports, container, false);
        graphlist= (GridView) v.findViewById(R.id.list4);
        graphalgo.add(0,"ARCHERY");
        graphalgo.add(1,"ATHLETICS");
        graphalgo.add(2,"BADMINTON");
        graphalgo.add(3,"BASKETBALL");
        graphalgo.add(4,"BEACH VOLLEYBALL");
        graphalgo.add(5,"BOXING");
        graphalgo.add(6,"CANOE SLALOM");
        graphalgo.add(7,"CANOE SPRINT");
        graphalgo.add(8,"CYCLING BMX");
        graphalgo.add(9,"CYCLING TRACK");
        graphalgo.add(10,"MOUNTAIN BIKE");
        graphalgo.add(11,"CYCLING ROAD");
        graphalgo.add(12,"DIVING");
        graphalgo.add(13,"EQUESTRIAN/DRESSAGE");
        graphalgo.add(14,"EQUESTRIAN EVENTING");
        graphalgo.add(15,"EQUESTRIAN JUMPING");
        graphalgo.add(16,"FENCING");
        graphalgo.add(17,"FOOTBALL");
        graphalgo.add(18,"GOLF");
        graphalgo.add(19,"GYMNASTICS ARTISTIC");
        graphalgo.add(20,"GYMNASTICS RHYTHMIC");
        graphalgo.add(21,"HANDBALL");
        graphalgo.add(22,"HOCKEY");
        graphalgo.add(23,"JUDO");
        graphalgo.add(24,"MARATHON SWIMMING");
        graphalgo.add(25,"MODERN PENTATHLON");
        graphalgo.add(26,"ROWING");
        graphalgo.add(27,"RUGBY");
        graphalgo.add(28,"SAILING");
        graphalgo.add(29,"SHOOTING");
        graphalgo.add(30,"SWIMMING");
        graphalgo.add(31,"SYNCHRONISED SWIMMING");
        graphalgo.add(32,"TABLE TENNIS");
        graphalgo.add(33,"TAEKWONDO");
        graphalgo.add(34,"TENNIS");
        graphalgo.add(35,"TRAMPOLINE");
        graphalgo.add(36,"TRIATHLON");
        graphalgo.add(37,"VOLLEYBALL");
        graphalgo.add(38,"WATER POLO");
        graphalgo.add(39,"WEIGHTLIFTING");
        graphalgo.add(40,"WRESTLING FREESTYLE");
        graphalgo.add(41,"WRESTLING GRECO-ROMAN");
        graphalgo.add(42," ");
        graphalgo.add(43," ");
        graphalgo.add(44," ");

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

    public static Sports newInstance(int position) {
        Sports fragment = new Sports();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }

}
