package shubh.sport.Player.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
        view=inflater.inflate(R.layout.player_item,null);
        ImageView img= view.findViewById(R.id.graphimg);
        TextView graphname= view.findViewById(R.id.graph);
        String gr=graphlist.get(i);
        switch(gr){

            case "Cristiano Ronaldo":
                img.setImageResource(R.drawable.p1);
                graphname.setText("Cristiano Ronaldo");
                break;


            case "LeBron James":
                img.setImageResource(R.drawable.p2);
                graphname.setText("LeBron James");
                break;

            case "Lionel Messi":
                img.setImageResource(R.drawable.p3);
                graphname.setText("Lionel Messi");
                break;

            case "Roger Federer":
                img.setImageResource(R.drawable.p4);
                graphname.setText("Roger Federer");
                break;

            case "Phil Mickelson":
                img.setImageResource(R.drawable.p5);
                graphname.setText(" Phil Mickelson");
                break;

            case "Neymar":
                img.setImageResource(R.drawable.p6);
                graphname.setText("Neymar");
                break;

            case "Usain Bolt":
                img.setImageResource(R.drawable.p7);
                graphname.setText("Usain Bolt");
                break;

            case "Kevin Durant":
                img.setImageResource(R.drawable.p8);
                graphname.setText("Kevin Durant");
                break;

            case "Rafael Nadal":
                img.setImageResource(R.drawable.p9);
                graphname.setText("Rafael Nadal");
                break;

            case "Tiger Woods":
                img.setImageResource(R.drawable.p10);
                graphname.setText("Tiger Woods");
                break;


            case "Stephen Curry":
                img.setImageResource(R.drawable.p11);
                graphname.setText("Stephen Curry");
                break;

            case "Novak Djokovic":
                img.setImageResource(R.drawable.p12);
                graphname.setText("Novak Djokovic");
                break;

            case "Virat Kohli":
                img.setImageResource(R.drawable.p13);
                graphname.setText("Virat Kohli");
                break;

            case "Rory McIlroy":
                img.setImageResource(R.drawable.p14);
                graphname.setText("Rory McIlroy");
                break;

            case "Mahendra Singh Dhoni":
                img.setImageResource(R.drawable.p15);
                graphname.setText("Mahendra Singh Dhoni");
                break;

            case "Ronda Rousey":
                img.setImageResource(R.drawable.p16);
                graphname.setText("Ronda Rousey");
                break;

            case "Jordan Spieth":
                img.setImageResource(R.drawable.p17);
                graphname.setText("Jordan Spieth");
                break;

            case "Kaká":
                img.setImageResource(R.drawable.p18);
                graphname.setText("Kaká");
                break;

            case "Serena Williams":
                img.setImageResource(R.drawable.p19);
                graphname.setText("Serena Williams");
                break;

            case "Kei Nishikori":
                img.setImageResource(R.drawable.p20);
                graphname.setText("Kei Nishikori");
                break;

            case "Tom Brady":
                img.setImageResource(R.drawable.p21);
                graphname.setText("Tom Brady");
                break;

            case "Gareth Bale":
                img.setImageResource(R.drawable.p22);
                graphname.setText("Gareth Bale");
                break;

            case "Maria Sharapova":
                img.setImageResource(R.drawable.p23);
                graphname.setText("Maria Sharapova");
                break;

            case "Dwyane Wade":
                img.setImageResource(R.drawable.p24);
                graphname.setText("Dwyane Wade");
                break;

            case "Conor McGregor":
                img.setImageResource(R.drawable.p25);
                graphname.setText("Conor McGregor");
                break;

            case "Zlatan Ibrahimovic":
                img.setImageResource(R.drawable.p26);
                graphname.setText("Zlatan Ibrahimovic");
                break;

            case "James Rodríguez":
                img.setImageResource(R.drawable.p27);
                graphname.setText("James Rodríguez");
                break;

            case "James Harden":
                img.setImageResource(R.drawable.p28);
                graphname.setText("James Harden");
                break;

            case "Alexis Sánchez":
                img.setImageResource(R.drawable.p29);
                graphname.setText("Alexis Sánchez");
                break;

            case "Mesut Özil":
                img.setImageResource(R.drawable.p30);
                graphname.setText("Mesut Özil");
                break;

            case "Wayne Rooney":
                img.setImageResource(R.drawable.p31);
                graphname.setText("Wayne Rooney");
                break;

            case "Andy Murray":
                img.setImageResource(R.drawable.p32);
                graphname.setText("Andy Murray");
                break;

            case "Derrick Rose":
                img.setImageResource(R.drawable.p33);
                graphname.setText("Derrick Rose");
                break;

            case "Kyrie Irving":
                img.setImageResource(R.drawable.p34);
                graphname.setText("Kyrie Irving");
                break;

            case "Russell Westbrook":
                img.setImageResource(R.drawable.p35);
                graphname.setText("Russell Westbrook");
                break;

            case "Antoine Griezmann":
                img.setImageResource(R.drawable.p36);
                graphname.setText("Antoine Griezmann");
                break;

            case "Andrés Iniesta":
                img.setImageResource(R.drawable.p37);
                graphname.setText("Andrés Iniesta");
                break;

            case "Luis Suárez":
                img.setImageResource(R.drawable.p38);
                graphname.setText("Luis Suárez");
                break;

            case "Anderson Silva":
                img.setImageResource(R.drawable.p39);
                graphname.setText("Anderson Silva");
                break;

            case "Paul Pogba":
                img.setImageResource(R.drawable.p40);
                graphname.setText("Paul Pogba");
                break;

            case "Carmelo Anthony":
                img.setImageResource(R.drawable.p41);
                graphname.setText("Carmelo Anthony");
                break;

            case "Stan Wawrinka":
                img.setImageResource(R.drawable.p42);
                graphname.setText("Stan Wawrinka");
                break;

            case "Dustin Johnson":
                img.setImageResource(R.drawable.p43);
                graphname.setText("Dustin Johnson");
                break;

            case "Karim Benzema":
                img.setImageResource(R.drawable.p44);
                graphname.setText("Karim Benzema");
                break;

            case "Marcelo Vieira":
                img.setImageResource(R.drawable.p45);
                graphname.setText("Marcelo Vieira");
                break;

            case "Radamel Falcao":
                img.setImageResource(R.drawable.p46);
                graphname.setText("Radamel Falcao");
                break;

            case "Cam Newton":
                img.setImageResource(R.drawable.p47);
                graphname.setText("Cam Newton");
                break;

            case "Simone Biles":
                img.setImageResource(R.drawable.p48);
                graphname.setText("Simone Biles");
                break;

            case "Sergio Agüero":
                img.setImageResource(R.drawable.p49);
                graphname.setText("Sergio Agüero");
                break;

            case "Ivan Rakitic":
                img.setImageResource(R.drawable.p50);
                graphname.setText("Ivan Rakitic");
                break;

            case "Chris Paul":
                img.setImageResource(R.drawable.p51);
                graphname.setText("Chris Paul");
                break;

            case "Drew Brees":
                img.setImageResource(R.drawable.p52);
                graphname.setText("Drew Brees");
                break;

            case "David Luiz":
                img.setImageResource(R.drawable.p53);
                graphname.setText("David Luiz");
                break;

            case "Cesc Fàbregas":
                img.setImageResource(R.drawable.p54);
                graphname.setText("Cesc Fàbregas");
                break;

            case "Russell Wilson":
                img.setImageResource(R.drawable.p55);
                graphname.setText("Russell Wilson");
                break;

            case "Aaron Rodgers":
                img.setImageResource(R.drawable.p56);
                graphname.setText("Aaron Rodgers");
                break;

            case "Dani Alves":
                img.setImageResource(R.drawable.p57);
                graphname.setText("Dani Alves");
                break;

            case "Sergio Garcia":
                img.setImageResource(R.drawable.p58);
                graphname.setText("Sergio Garcia");
                break;

            case "Manny Pacquiao":
                img.setImageResource(R.drawable.p59);
                graphname.setText("Manny Pacquiao");
                break;

            case "Eli Manning":
                img.setImageResource(R.drawable.p60);
                graphname.setText("Eli Manning");
                break;

            case "Damian Lillard":
                img.setImageResource(R.drawable.p61);
                graphname.setText("Damian Lillard");
                break;

            case "Rickie Fowler":
                img.setImageResource(R.drawable.p62);
                graphname.setText("Rickie Fowler");
                break;

            case "Blake Griffin":
                img.setImageResource(R.drawable.p63);
                graphname.setText("Blake Griffin");
                break;

            case "Odell Beckham Jr.":
                img.setImageResource(R.drawable.p64);
                graphname.setText("Odell Beckham Jr.");
                break;

            case "Dwight Howard":
                img.setImageResource(R.drawable.p65);
                graphname.setText("Dwight Howard");
                break;

            case "Ning Zetao":
                img.setImageResource(R.drawable.p66);
                graphname.setText("Ning Zetao");
                break;

            case "Ryan Lochte":
                img.setImageResource(R.drawable.p67);
                graphname.setText("Ryan Lochte");
                break;

            case "Bastian Schweinsteiger":
                img.setImageResource(R.drawable.p68);
                graphname.setText("Bastian Schweinsteiger");
                break;

            case "Dale Earnhardt Jr.":
                img.setImageResource(R.drawable.p69);
                graphname.setText("Dale Earnhardt Jr.");
                break;

            case "Javier Hernández":
                img.setImageResource(R.drawable.p70);
                graphname.setText("Javier Hernández");
                break;

            case "Ma Long":
                img.setImageResource(R.drawable.p71);
                graphname.setText("Ma Long");
                break;

            case "Toni Kroos":
                img.setImageResource(R.drawable.p72);
                graphname.setText("Toni Kroos");
                break;

            case "Justin Rose":
                img.setImageResource(R.drawable.p73);
                graphname.setText("Justin Rose");
                break;

            case "J.J. Watt":
                img.setImageResource(R.drawable.p74);
                graphname.setText("J.J. Watt");
                break;

            case "Hope Solo":
                img.setImageResource(R.drawable.p75);
                graphname.setText("Hope Solo");
                break;

            case "Thiago Silva":
                img.setImageResource(R.drawable.p76);
                graphname.setText("Thiago Silva");
                break;

            case "Raheem Sterling":
                img.setImageResource(R.drawable.p77);
                graphname.setText("Raheem Sterling");
                break;

            case "Eden Hazard":
                img.setImageResource(R.drawable.p78);
                graphname.setText("Eden Hazard");
                break;

            case "Theo Walcott":
                img.setImageResource(R.drawable.p79);
                graphname.setText("Theo Walcott");
                break;

            case "Didier Drogba":
                img.setImageResource(R.drawable.p80);
                graphname.setText("Didier Drogba");
                break;

            case "Mario Götze":
                img.setImageResource(R.drawable.p81);
                graphname.setText("Mario Götze");
                break;

            case "Robert Lewandowski":
                img.setImageResource(R.drawable.p82);
                graphname.setText("Robert Lewandowski");
                break;

            case "Marco Reus":
                img.setImageResource(R.drawable.p83);
                graphname.setText("Marco Reus");
                break;

            case "Lewis Hamilton":
                img.setImageResource(R.drawable.p84);
                graphname.setText("Lewis Hamilton");
                break;

            case "Jason Day":
                img.setImageResource(R.drawable.p85);
                graphname.setText("Jason Day");
                break;

            case "Jimmie Johnson":
                img.setImageResource(R.drawable.p86);
                graphname.setText("Jimmie Johnson");
                break;

            case "Caroline Wozniacki":
                img.setImageResource(R.drawable.p87);
                graphname.setText("Caroline Wozniacki");
                break;

            case "Lin Dan":
                img.setImageResource(R.drawable.p88);
                graphname.setText("Lin Dan");
                break;

            case "Saúl Álvarez":
                img.setImageResource(R.drawable.p89);
                graphname.setText("Saúl Álvarez");
                break;

            case "Yuvraj Singh":
                img.setImageResource(R.drawable.p90);
                graphname.setText("Yuvraj Singh");
                break;

            case "Thomas Müller":
                img.setImageResource(R.drawable.p91);
                graphname.setText("Thomas Müller");
                break;

            case "Felipe Massa":
                img.setImageResource(R.drawable.p92);
                graphname.setText("Felipe Massa");
                break;

            case "Eugenie Bouchard":
                img.setImageResource(R.drawable.p93);
                graphname.setText("Eugenie Bouchard");
                break;

            case "Bubba Watson":
                img.setImageResource(R.drawable.p94);
                graphname.setText("Bubba Watson");
                break;

            case "Suresh Raina":
                img.setImageResource(R.drawable.p95);
                graphname.setText("Suresh Raina");
                break;

            case "Gabriel Jesus":
                img.setImageResource(R.drawable.p96);
                graphname.setText("Gabriel Jesus");
                break;

            case "Manuel Neuer":
                img.setImageResource(R.drawable.p97);
                graphname.setText("Manuel Neuer");
                break;

            case "Adam Scott":
                img.setImageResource(R.drawable.p98);
                graphname.setText("Adam Scott");
                break;

            case "Aly Raisman":
                img.setImageResource(R.drawable.p99);
                graphname.setText("Aly Raisman");
                break;

            case "Mohamed Salah":
                img.setImageResource(R.drawable.p100);
                graphname.setText("Mohamed Salah");
                break;

        }
        return view;
    }
}
