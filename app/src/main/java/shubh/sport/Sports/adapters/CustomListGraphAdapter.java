package shubh.sport.Sports.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import java.util.ArrayList;

import shubh.sport.R;

public class CustomListGraphAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> graphlist;

    public CustomListGraphAdapter(Context context, ArrayList<String> graphlist){
        this.context=context;
        this.graphlist=graphlist;
    }

    @Override
    public int getCount() {
        return graphlist.size();
    }

    @Override
    public Object getItem(int i) {
        return graphlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.sports_item,null);
        ImageView img= view.findViewById(R.id.graphimg);
        TextView graphname= view.findViewById(R.id.graph);
        String gr=graphlist.get(i);
        switch(gr){
            case "ARCHERY":
                img.setImageResource(R.drawable.archery);
                graphname.setText("ARCHERY");
                break;
            case "ATHLETICS":
                Glide.with(context).load(R.drawable.athletics).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("ATHLETICS");
                break;
            case "BADMINTON":
                Glide.with(context).load(R.drawable.badminton).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("BADMINTON");
                break;
            case "BASKETBALL":
                Glide.with(context).load(R.drawable.basketball).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("BASKETBALL");
                break;
            case "BEACH VOLLEYBALL":
                Glide.with(context).load(R.drawable.beach_volleyball).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("BEACH VOLLEYBALL");
                break;
            case "BOXING":
                Glide.with(context).load(R.drawable.boxing).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("BOXING");
                break;
            case "CANOE SLALOM":
                Glide.with(context).load(R.drawable.canoe_slalom).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("CANOE SLALOM");
                break;
            case "CANOE SPRINT":
                Glide.with(context).load(R.drawable.canoe_sprint).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("CANOE SPRINT");
                break;
            case "CYCLING BMX":
                Glide.with(context).load(R.drawable.cycling_bmx).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("CYCLING BMX");
                break;
            case "MOUNTAIN BIKE":
                Glide.with(context).load(R.drawable.cycling_mountainbike).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("MOUNTAIN BIKE");
                break;
            case "CYCLING ROAD":
                Glide.with(context).load(R.drawable.cycling_road).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("CYCLING ROAD");
                break;
            case "CYCLING TRACK":
                Glide.with(context).load(R.drawable.cycling_track).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("CYCLING TRACK");
                break;
            case "DIVING":
                Glide.with(context).load(R.drawable.diving).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("DIVING");
                break;
            case "EQUESTRIAN/DRESSAGE":
                Glide.with(context).load(R.drawable.equestrain_dressage).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("EQUESTRIAN/DRESSAGE");
                break;
            case "EQUESTRIAN EVENTING":
                Glide.with(context).load(R.drawable.equestrain_eventing).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("EQUESTRIAN EVENTING");
                break;
            case "EQUESTRIAN JUMPING":
                Glide.with(context).load(R.drawable.equestrain_jumping).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("EQUESTRIAN JUMPING");
                break;
            case "FENCING":
                Glide.with(context).load(R.drawable.fencing).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("FENCING");
                break;
            case "FOOTBALL":
                Glide.with(context).load(R.drawable.football).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("FOOTBALL");
                break;
            case "GOLF":
                Glide.with(context).load(R.drawable.golf).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("GOLF");
                break;
            case "GYMNASTICS ARTISTIC":
                Glide.with(context).load(R.drawable.gymnastics).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("GYMNASTICS ARTISTIC");
                break;
            case "GYMNASTICS RHYTHMIC":
                Glide.with(context).load(R.drawable.gymnastics_rythmic).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("GYMNASTICS RHYTHMIC");
                break;
            case "HANDBALL":
                Glide.with(context).load(R.drawable.handball).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("HANDBALL");
                break;
            case "HOCKEY":
                Glide.with(context).load(R.drawable.hockey).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("HOCKEY");
                break;
            case "JUDO":
                Glide.with(context).load(R.drawable.judo).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("JUDO");
                break;
            case "MARATHON SWIMMING":
                Glide.with(context).load(R.drawable.marathon_swimming).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("MARATHON SWIMMING");
                break;
            case "MODERN PENTATHLON":
                Glide.with(context).load(R.drawable.modern_petathlon).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("MODERN PENTATHLON");
                break;
            case "ROWING":
                Glide.with(context).load(R.drawable.rowing).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("ROWING");
                break;
            case "RUGBY":
                Glide.with(context).load(R.drawable.rugby).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("RUGBY");
                break;
            case "SAILING":
                Glide.with(context).load(R.drawable.sailing).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("SAILING");
                break;
            case "SHOOTING":
                Glide.with(context).load(R.drawable.shooting).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("SHOOTING");
                break;
            case "SWIMMING":
                Glide.with(context).load(R.drawable.swimming).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("SWIMMING");
                break;
            case "SYNCHRONISED SWIMMING":
                Glide.with(context).load(R.drawable.synchronized_swimming).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("SYNCHRONISED SWIMMING");
                break;
            case "TABLE TENNIS":
                Glide.with(context).load(R.drawable.table_tennis).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("TABLE TENNIS");
                break;
            case "TAEKWONDO":
                Glide.with(context).load(R.drawable.taekwondo).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("TAEKWONDO");
                break;
            case "TENNIS":
                Glide.with(context).load(R.drawable.tennis).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("TENNIS");
                break;
            case "TRAMPOLINE":
                Glide.with(context).load(R.drawable.trampoline).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("TRAMPOLINE");
                break;
            case "TRIATHLON":
                Glide.with(context).load(R.drawable.triathlon).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("TRIATHLON");
                break;
            case "VOLLEYBALL":
                Glide.with(context).load(R.drawable.volleyball).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("VOLLEYBALL");
                break;
            case "WATER POLO":
                Glide.with(context).load(R.drawable.water_polo).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("WATER POLO");
                break;
            case "WEIGHTLIFTING":
                Glide.with(context).load(R.drawable.weightlifting).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("WEIGHTLIFTING");
                break;
            case "WRESTLING FREESTYLE":
                Glide.with(context).load(R.drawable.wrestling_freestyle).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("WRESTLING FREESTYLE");
                break;
            case "WRESTLING GRECO-ROMAN":
                Glide.with(context).load(R.drawable.wrestling_greco_roman).into(new GlideDrawableImageViewTarget(img));
                graphname.setText("WRESTLING GRECO-ROMAN");
                break;
        }
        return view;
    }
}
