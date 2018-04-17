package shubh.sport.Player;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import shubh.sport.Player.Adapters.EventTabPagerAdapter;
import shubh.sport.R;

public class PlayerActivity extends AppCompatActivity {
    private ViewPager mPager4;
    private TabLayout graphtab;
    private static String graphtitle;
    private EventTabPagerAdapter eventTabPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_main);
        mPager4= findViewById(R.id.pager3);
        graphtab= findViewById(R.id.tab3);
        Bundle extras=getIntent().getExtras();
        graphtitle=extras.getString("graphname");
        switch (graphtitle)
        {


            case "Cristiano Ronaldo":
                Glide.with(this).load(R.drawable.p1).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "LeBron James":
                Glide.with(this).load(R.drawable.p2).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Lionel Messi":
                Glide.with(this).load(R.drawable.p3).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Roger Federer":
                Glide.with(this).load(R.drawable.p4).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Phil Mickelson":
                Glide.with(this).load(R.drawable.p5).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Neymar":
                Glide.with(this).load(R.drawable.p6).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Usain Bolt":
                Glide.with(this).load(R.drawable.p7).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Kevin Durant":
                Glide.with(this).load(R.drawable.p8).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Rafael Nadal":
                Glide.with(this).load(R.drawable.p9).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Tiger Woods":
                Glide.with(this).load(R.drawable.p10).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Stephen Curry":
                Glide.with(this).load(R.drawable.p11).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Novak Djokovic":
                Glide.with(this).load(R.drawable.p12).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Virat Kohli":
                Glide.with(this).load(R.drawable.p13).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Rory McIlroy":
                Glide.with(this).load(R.drawable.p14).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Mahendra Singh Dhoni":
                Glide.with(this).load(R.drawable.p15).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Ronda Rousey":
                Glide.with(this).load(R.drawable.p16).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Jordan Spieth":
                Glide.with(this).load(R.drawable.p17).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Kaká":
                Glide.with(this).load(R.drawable.p18).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Serena Williams":
                Glide.with(this).load(R.drawable.p19).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Kei Nishikori":
                Glide.with(this).load(R.drawable.p20).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Tom Brady":
                Glide.with(this).load(R.drawable.p21).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Gareth Bale":
                Glide.with(this).load(R.drawable.p22).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Maria Sharapova":
                Glide.with(this).load(R.drawable.p23).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Dwyane Wade":
                Glide.with(this).load(R.drawable.p24).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Conor McGregor":
                Glide.with(this).load(R.drawable.p25).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Zlatan Ibrahimovic":
                Glide.with(this).load(R.drawable.p26).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "James Rodríguez":
                Glide.with(this).load(R.drawable.p27).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "James Harden":
                Glide.with(this).load(R.drawable.p28).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Alexis Sánchez":
                Glide.with(this).load(R.drawable.p29).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Mesut Özil":
                Glide.with(this).load(R.drawable.p30).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Wayne Rooney":
                Glide.with(this).load(R.drawable.p31).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Andy Murray":
                Glide.with(this).load(R.drawable.p32).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Derrick Rose":
                Glide.with(this).load(R.drawable.p33).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Kyrie Irving":
                Glide.with(this).load(R.drawable.p34).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Russell Westbrook":
                Glide.with(this).load(R.drawable.p35).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Antoine Griezmann":
                Glide.with(this).load(R.drawable.p36).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Andrés Iniesta":
                Glide.with(this).load(R.drawable.p37).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Luis Suárez":
                Glide.with(this).load(R.drawable.p38).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Anderson Silva":
                Glide.with(this).load(R.drawable.p39).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Paul Pogba":
                Glide.with(this).load(R.drawable.p40).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Carmelo Anthony":
                Glide.with(this).load(R.drawable.p41).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Stan Wawrinka":
                Glide.with(this).load(R.drawable.p42).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Dustin Johnson":
                Glide.with(this).load(R.drawable.p43).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Karim Benzema":
                Glide.with(this).load(R.drawable.p44).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Marcelo Vieira":
                Glide.with(this).load(R.drawable.p45).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Radamel Falcao":
                Glide.with(this).load(R.drawable.p46).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Cam Newton":
                Glide.with(this).load(R.drawable.p47).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Simone Biles":
                Glide.with(this).load(R.drawable.p48).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Sergio Agüero":
                Glide.with(this).load(R.drawable.p49).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Ivan Rakitic":
                Glide.with(this).load(R.drawable.p50).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Chris Paul":
                Glide.with(this).load(R.drawable.p51).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Drew Brees":
                Glide.with(this).load(R.drawable.p52).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "David Luiz":
                Glide.with(this).load(R.drawable.p53).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Cesc Fàbregas":
                Glide.with(this).load(R.drawable.p54).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Russell Wilson":
                Glide.with(this).load(R.drawable.p55).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Aaron Rodgers":
                Glide.with(this).load(R.drawable.p56).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Dani Alves":
                Glide.with(this).load(R.drawable.p57).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Sergio Garcia":
                Glide.with(this).load(R.drawable.p58).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Manny Pacquiao":
                Glide.with(this).load(R.drawable.p59).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Eli Manning":
                Glide.with(this).load(R.drawable.p60).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Damian Lillard":
                Glide.with(this).load(R.drawable.p61).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Rickie Fowler":
                Glide.with(this).load(R.drawable.p62).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Blake Griffin":
                Glide.with(this).load(R.drawable.p63).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Odell Beckham Jr.":
                Glide.with(this).load(R.drawable.p64).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Dwight Howard":
                Glide.with(this).load(R.drawable.p65).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Ning Zetao":
                Glide.with(this).load(R.drawable.p66).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Ryan Lochte":
                Glide.with(this).load(R.drawable.p67).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Bastian Schweinsteiger":
                Glide.with(this).load(R.drawable.p68).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Dale Earnhardt Jr.":
                Glide.with(this).load(R.drawable.p69).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Javier Hernández":
                Glide.with(this).load(R.drawable.p70).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Ma Long":
                Glide.with(this).load(R.drawable.p71).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Toni Kroos":
                Glide.with(this).load(R.drawable.p72).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Justin Rose":
                Glide.with(this).load(R.drawable.p73).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "J.J. Watt":
                Glide.with(this).load(R.drawable.p74).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Hope Solo":
                Glide.with(this).load(R.drawable.p75).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Thiago Silva":
                Glide.with(this).load(R.drawable.p76).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Raheem Sterling":
                Glide.with(this).load(R.drawable.p77).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Eden Hazard":
                Glide.with(this).load(R.drawable.p78).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Theo Walcott":
                Glide.with(this).load(R.drawable.p79).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Didier Drogba":
                Glide.with(this).load(R.drawable.p80).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Mario Götze":
                Glide.with(this).load(R.drawable.p81).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Robert Lewandowski":
                Glide.with(this).load(R.drawable.p82).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Marco Reus":
                Glide.with(this).load(R.drawable.p83).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Lewis Hamilton":
                Glide.with(this).load(R.drawable.p84).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Jason Day":
                Glide.with(this).load(R.drawable.p85).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Jimmie Johnson":
                Glide.with(this).load(R.drawable.p86).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Caroline Wozniacki":
                Glide.with(this).load(R.drawable.p87).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Lin Dan":
                Glide.with(this).load(R.drawable.p88).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Saúl Álvarez":
                Glide.with(this).load(R.drawable.p89).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Yuvraj Singh":
                Glide.with(this).load(R.drawable.p90).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Thomas Müller":
                Glide.with(this).load(R.drawable.p91).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Felipe Massa":
                Glide.with(this).load(R.drawable.p92).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Eugenie Bouchard":
                Glide.with(this).load(R.drawable.p93).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Bubba Watson":
                Glide.with(this).load(R.drawable.p94).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Suresh Raina":
                Glide.with(this).load(R.drawable.p95).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Gabriel Jesus":
                Glide.with(this).load(R.drawable.p96).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Manuel Neuer":
                Glide.with(this).load(R.drawable.p97).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Adam Scott":
                Glide.with(this).load(R.drawable.p98).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Aly Raisman":
                Glide.with(this).load(R.drawable.p99).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;

            case "Mohamed Salah":
                Glide.with(this).load(R.drawable.p100).into(new GlideDrawableImageViewTarget((ImageView) findViewById(R.id.gifgraph)));
                break;


        }
        graphtab.addTab(graphtab.newTab());
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
