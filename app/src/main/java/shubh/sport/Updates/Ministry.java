package shubh.sport.Updates;

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
import shubh.sport.Ministry.NM;
import shubh.sport.Ministry.SAI;
import shubh.sport.Ministry.SM;
import shubh.sport.Ministry.schemes;
import shubh.sport.R;
import shubh.sport.RecyclerItemClickListener;

public class Ministry extends Fragment {

    private final String recyclerViewTitleText[] = {
            "National Ministry of Sports","State Ministry of Sports","Sports Authority of India",
            "Scholarships/Schemes"

    };

    private final int recyclerViewImages[] = {
            R.drawable.gov,R.drawable.gov,R.drawable.gov,
            R.drawable.gov,R.drawable.gov,
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
                            case 0: { Intent intent = new Intent(getActivity(), NM.class); startActivity(intent); } break;
                            case 1: { Intent intent = new Intent(getActivity(), SM.class); startActivity(intent); } break;
                            case 2: { Intent intent = new Intent(getActivity(), SAI.class); startActivity(intent); } break;
                            case 3: { Intent intent = new Intent(getActivity(), schemes.class); startActivity(intent); } break;
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

    public static Ministry newInstance(int position) {
        Ministry fragment = new Ministry();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}