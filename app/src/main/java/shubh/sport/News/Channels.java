package shubh.sport.News;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import shubh.sport.AndroidDataAdapter;
import shubh.sport.AndroidVersion;
import shubh.sport.Channels.c0;
import shubh.sport.Channels.c1;
import shubh.sport.Channels.c2;
import shubh.sport.Channels.c3;
import shubh.sport.Channels.c4;
import shubh.sport.Channels.c5;
import shubh.sport.Channels.c6;
import shubh.sport.Channels.c7;
import shubh.sport.Channels.c8;
import shubh.sport.R;
import shubh.sport.RecyclerItemClickListener;

public class Channels extends Fragment {

    private final String recyclerViewTitleText[] = {
            "STAR SPORTS INDIA","STAR SPORTS LIVE","DSPORTS",
            "SONY TEN","DD SPORTS","ESPN",
            "FOXSPORTS","TSN","BBC"
    };

    private final int recyclerViewImages[] = {
            R.drawable.c1,R.drawable.c1,R.drawable.dsports,
            R.drawable.sonyten,R.drawable.ddsports,R.drawable.espn,
            R.drawable.foxsports,R.drawable.tsn,R.drawable.bbc,
    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        getActivity().setTitle("Home");
        View view = inflater.inflate(R.layout.grid, container, false);
        RecyclerView mRecyclerView = view.findViewById(R.id.recycler_view);


        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity().getApplicationContext(), 3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<AndroidVersion> av = prepareData();
        AndroidDataAdapter mAdapter = new AndroidDataAdapter(getActivity().getApplicationContext(), av);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity().getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int i) {
                        switch (i) {
                            case 0: { Intent intent = new Intent(getActivity(), c0.class); startActivity(intent); } break;
                            case 1: { Intent intent = new Intent(getActivity(), c1.class); startActivity(intent); } break;
                            case 2: { Intent intent = new Intent(getActivity(), c3.class); startActivity(intent); } break;
                            case 3: { Intent intent = new Intent(getActivity(), c2.class); startActivity(intent); } break;
                            case 4: { Intent intent = new Intent(getActivity(), c4.class); startActivity(intent); } break;
                            case 5: { Intent intent = new Intent(getActivity(), c5.class); startActivity(intent); } break;
                            case 6: { Intent intent = new Intent(getActivity(), c6.class); startActivity(intent); } break;
                            case 7: { Intent intent = new Intent(getActivity(), c7.class); startActivity(intent); } break;
                            case 8: { Intent intent = new Intent(getActivity(), c8.class); startActivity(intent); } break;


                        }
                    }
                })
        );
        return view;
    }


    private ArrayList<AndroidVersion> prepareData() {

        ArrayList<AndroidVersion> av = new ArrayList<>();
        for (int i = 0; i < recyclerViewTitleText.length; i++) {
            AndroidVersion mAndroidVersion = new AndroidVersion();
            mAndroidVersion.setAndroidVersionName(recyclerViewTitleText[i]);
            mAndroidVersion.setrecyclerViewImage(recyclerViewImages[i]);
            av.add(mAndroidVersion);
        }
        return av;
    }

    public static Channels newInstance(int position) {
        Channels fragment = new Channels();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}