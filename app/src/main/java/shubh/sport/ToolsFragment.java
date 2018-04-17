package shubh.sport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import shubh.sport.BMI.bmi;
import shubh.sport.Golds.HomeScreen;
import shubh.sport.StepsCounter.Steps;

/**
 * Created by $hubh on 2/18/2018.
 */

public class ToolsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View view=inflater.inflate(R.layout.tools, container,false);

        ImageView img1 = view.findViewById(R.id.golds);
        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HomeScreen.class);
                startActivity(intent);
            }
        });


        ImageView img = view.findViewById(R.id.bmi);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),bmi.class);
                startActivity(intent);
            }
        });

        ImageView img2 = view.findViewById(R.id.stepcounter);
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Steps.class);
                startActivity(intent);
            }
        });

        ImageView img3 = view.findViewById(R.id.water);
        img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), shubh.sport.Water.MainWindow.MainActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public static ToolsFragment newInstance(int position) {
        ToolsFragment fragment = new ToolsFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }
}