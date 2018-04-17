package shubh.sport.Sports;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import shubh.sport.R;
import shubh.sport.Sports.adapters.EventTabPagerAdapter;

public class EventActivity extends AppCompatActivity {
    private ViewPager mPager4;
    private TabLayout graphtab;
    private static String graphtitle;
    private EventTabPagerAdapter eventTabPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        mPager4= findViewById(R.id.pager3);
        graphtab= findViewById(R.id.tab3);
        Bundle extras=getIntent().getExtras();
        graphtitle=extras.getString("graphname");
        switch (graphtitle) {
            case "ARCHERY":
                Glide.with(this).load(R.drawable.archery_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "ATHLETICS":
                Glide.with(this).load(R.drawable.athletics_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "BADMINTON":
                Glide.with(this).load(R.drawable.badminton_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "BASKETBALL":
                Glide.with(this).load(R.drawable.basketball_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "BEACH VOLLEYBALL":
                Glide.with(this).load(R.drawable.beach_volleyball_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "BOXING":
                Glide.with(this).load(R.drawable.boxing_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "CANOE SLALOM":
                Glide.with(this).load(R.drawable.canoe_slalom_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "CANOE SPRINT":
                Glide.with(this).load(R.drawable.canoe_sprint_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "CYCLING BMX":
                Glide.with(this).load(R.drawable.cycling_bmx_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "CYCLING TRACK":
                Glide.with(this).load(R.drawable.cycling_track_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "MOUNTAIN BIKE":
                Glide.with(this).load(R.drawable.mountainbike_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "CYCLING ROAD":
                Glide.with(this).load(R.drawable.cycling_road_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "DIVING":
                Glide.with(this).load(R.drawable.diving_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "EQUESTRIAN/DRESSAGE":
                Glide.with(this).load(R.drawable.equestrian_dressage_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "EQUESTRIAN EVENTING":
                Glide.with(this).load(R.drawable.equestrian_eventing_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "EQUESTRIAN JUMPING":
                Glide.with(this).load(R.drawable.equestrian_jumpin_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "FENCING":
                Glide.with(this).load(R.drawable.fencing_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "FOOTBALL":
                Glide.with(this).load(R.drawable.football_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "GOLF":
                Glide.with(this).load(R.drawable.golf_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "GYMNASTICS ARTISTIC":
                Glide.with(this).load(R.drawable.gymnastics_artistic_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "GYMNASTICS RHYTHMIC":
                Glide.with(this).load(R.drawable.gymnastics_rythmic_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "HANBALL":
                Glide.with(this).load(R.drawable.handball_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "HOCKEY":
                Glide.with(this).load(R.drawable.hockey_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "JUDO":
                Glide.with(this).load(R.drawable.judo_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "MARATHON SWIMMING":
                Glide.with(this).load(R.drawable.marathon_swimming_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "MODERN PENTATHLON":
                Glide.with(this).load(R.drawable.modern_pentathlon_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "ROWING":
                Glide.with(this).load(R.drawable.rowing_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "RUGBY":
                Glide.with(this).load(R.drawable.rugby_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "SAILING":
                Glide.with(this).load(R.drawable.sailing_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "SHOOTING":
                Glide.with(this).load(R.drawable.shooting_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "SWIMMING":
                Glide.with(this).load(R.drawable.swimming_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "SYNCHRONISED SWIMMING":
                Glide.with(this).load(R.drawable.synchronized_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "TABLE TANNIS":
                Glide.with(this).load(R.drawable.table_tennis_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "TAEKWONDO":
                Glide.with(this).load(R.drawable.taekwondo_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "TENNIS":
                Glide.with(this).load(R.drawable.tennis_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "TRAMPOLINE":
                Glide.with(this).load(R.drawable.trampoline_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "TRIATHLON":
                Glide.with(this).load(R.drawable.triathlon_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "VOLLEYBALL":
                Glide.with(this).load(R.drawable.volleyball_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "WATER POLO":
                Glide.with(this).load(R.drawable.water_polo_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "WEIGHTLIFTING":
                Glide.with(this).load(R.drawable.weightlifting_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "WRESTLING FREESTYLE":
                Glide.with(this).load(R.drawable.wrestling_freestyle_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
            case "WRESTLING GRECO-ROMAN":
                Glide.with(this).load(R.drawable.wrestling_greco_roman_banner).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;
        }
        graphtab.addTab(graphtab.newTab().setText("Details"));
        graphtab.addTab(graphtab.newTab().setText("Rules"));
        graphtab.addTab(graphtab.newTab().setText("Contact"));
        eventTabPagerAdapter =new EventTabPagerAdapter(getSupportFragmentManager());
        mPager4.setAdapter(eventTabPagerAdapter);
        mPager4.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(graphtab));
        graphtab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               mPager4.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public static String getGraphtitle(){
        return graphtitle;
    }
}
