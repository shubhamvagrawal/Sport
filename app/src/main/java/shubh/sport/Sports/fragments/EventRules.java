package shubh.sport.Sports.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import shubh.sport.Sports.EventActivity;
import shubh.sport.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventRules extends Fragment {


    public EventRules() {
        // Required empty public constructor
    }

    private TextView event_rules;
    private EventActivity graphActivity;

    private String graphtitle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.sport_rules, container, false);
        event_rules= (TextView) v.findViewById(R.id.eventrules);
        switch (graphtitle){
            case "ARCHERY":
                String des1=getResources().getString(R.string.s1_rules);
                event_rules.setText(des1);
                break;

            case "ATHLETICS":
                String des2=getResources().getString(R.string.s2_rules);
                event_rules.setText(des2);
                break;

            case "BADMINTON":
                String des3=getResources().getString(R.string.s3_rules);
                event_rules.setText(des3);
                break;

            case "BASKETBALL":
                String des4=getResources().getString(R.string.s4_rules);
                event_rules.setText(des4);
                break;

            case "BEACH VOLLEYBALL":
                String des5=getResources().getString(R.string.s5_rules);
                event_rules.setText(des5);
                break;

            case "BOXING":
                String des6=getResources().getString(R.string.s6_rules);
                event_rules.setText(des6);
                break;

            case "CANOE SLALOM":
                String des7=getResources().getString(R.string.s7_rules);
                event_rules.setText(des7);
                break;

            case "CANOE SPRINT":
                String des8=getResources().getString(R.string.s8_rules);
                event_rules.setText(des8);
                break;

            case "CYCLING BMX":
                String des9=getResources().getString(R.string.s9_rules);
                event_rules.setText(des9);
                break;

            case "CYCLING TRACK":
                String des10=getResources().getString(R.string.s10_rules);
                event_rules.setText(des10);
                break;

            case "MOUNTAIN BIKE":
                String des11=getResources().getString(R.string.s11_rules);
                event_rules.setText(des11);
                break;

            case "CYCLING ROAD":
                String des12=getResources().getString(R.string.s12_rules);
                event_rules.setText(des12);
                break;

            case "DIVING":
                String des13=getResources().getString(R.string.s13_rules);
                event_rules.setText(des13);
                break;

            case "EQUESTRIAN/DRESSAGE":
                String des14=getResources().getString(R.string.s14_rules);
                event_rules.setText(des14);
                break;

            case "EQUESTRIAN EVENTING":
                String des15=getResources().getString(R.string.s15_rules);
                event_rules.setText(des15);
                break;

            case "EQUESTRIAN JUMPING":
                String des16=getResources().getString(R.string.s16_rules);
                event_rules.setText(des16);
                break;

            case "FENCING":
                String des17=getResources().getString(R.string.s17_rules);
                event_rules.setText(des17);
                break;

            case "FOOTBALL":
                String des18=getResources().getString(R.string.s18_rules);
                event_rules.setText(des18);
                break;

            case "GOLF":
                String des19=getResources().getString(R.string.s19_rules);
                event_rules.setText(des19);
                break;

            case "GYMNASTICS ARTISTIC":
                String des20=getResources().getString(R.string.s20_rules);
                event_rules.setText(des20);
                break;

            case "GYMNASTICS RHYTHMIC":
                String des21=getResources().getString(R.string.s21_rules);
                event_rules.setText(des21);
                break;

            case "HANBALL":
                String des22=getResources().getString(R.string.s22_rules);
                event_rules.setText(des22);
                break;

            case "HOCKEY":
                String des23=getResources().getString(R.string.s23_rules);
                event_rules.setText(des23);
                break;

            case "JUDO":
                String des24=getResources().getString(R.string.s24_rules);
                event_rules.setText(des24);
                break;

            case "MARATHON SWIMMING":
                String des25=getResources().getString(R.string.s25_rules);
                event_rules.setText(des25);
                break;

            case "MODERN PENTATHLON":
                String des26=getResources().getString(R.string.s26_rules);
                event_rules.setText(des26);
                break;

            case "ROWING":
                String des27=getResources().getString(R.string.s27_rules);
                event_rules.setText(des27);
                break;

            case "RUGBY":
                String des28=getResources().getString(R.string.s28_rules);
                event_rules.setText(des28);
                break;

            case "SAILING":
                String                        des29=getResources().getString(R.string.s29_rules);
                event_rules.setText(des29);
                break;

            case "SHOOTING":
                String                        des30=getResources().getString(R.string.s30_rules);
                event_rules.setText(des30);
                break;

            case "SWIMMING":
                String                        des31=getResources().getString(R.string.s31_rules);
                event_rules.setText(des31);
                break;

            case "SYNCHRONISED SWIMMING":
                String
                        des32=getResources().getString(R.string.s32_rules);

                event_rules.setText(des32);
                break;
            case "TABLE TANNIS":

                String
                        des33=getResources().getString(R.string.s33_rules);

                event_rules.setText(des33);
                break;
            case "TAEKWONDO":
                String                        des34=getResources().getString(R.string.s34_rules);
                event_rules.setText(des34);
                break;

            case "TENNIS":
                String                        des35=getResources().getString(R.string.s35_rules);
                event_rules.setText(des35);
                break;

            case "TRAMPOLINE":
                String                        des36=getResources().getString(R.string.s36_rules);
                event_rules.setText(des36);
                break;

            case "TRIATHLON":
                String                        des37=getResources().getString(R.string.s37_rules);
                event_rules.setText(des37);
                break;

            case "VOLLEYBALL":
                String                        des38=getResources().getString(R.string.s38_rules);
                event_rules.setText(des38);
                break;

            case "WATER POLO":
                String                        des39=getResources().getString(R.string.s39_rules);
                event_rules.setText(des39);
                break;

            case "WEIGHTLIFTING":
                String                        des40=getResources().getString(R.string.s40_rules);
                event_rules.setText(des40);
                break;

            case "WRESTLING FREESTYLE":
                String                        des41=getResources().getString(R.string.s41_rules);
                event_rules.setText(des41);
                break;

            case "WRESTLING GRECO-ROMAN":
                String des42=getResources().getString(R.string.s42_rules);
                event_rules.setText(des42);
                break;
        }
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            graphActivity= (EventActivity) context;
            graphtitle=graphActivity.getGraphtitle();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
