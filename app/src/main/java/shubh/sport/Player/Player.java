package shubh.sport.Player;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import shubh.sport.Player.Adapters.CustomListGraphAdapter;
import shubh.sport.R;


public class Player extends Fragment {
    public Player() {
        // Required empty public constructor
    }
    private GridView graphlist;
    private ArrayList<String> graphalgo=new ArrayList<String>();
    private CustomListGraphAdapter adapter;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.player, container, false);
        graphlist= v.findViewById(R.id.list4);

        graphalgo.add(0,"Cristiano Ronaldo");
        graphalgo.add(1,"LeBron James");
		graphalgo.add(2,"Lionel Messi");
		graphalgo.add(3,"Roger Federer");
		graphalgo.add(4,"Phil Mickelson");
		graphalgo.add(5,"Neymar");
		graphalgo.add(6,"Usain Bolt"); 
        graphalgo.add(7,"Kevin Durant");
		graphalgo.add(8,"Rafael Nadal");
		graphalgo.add(9,"Tiger Woods");
		graphalgo.add(10,"Stephen Curry");
		graphalgo.add(11,"Novak Djokovic");
		graphalgo.add(12,"Virat Kohli");
		graphalgo.add(13,"Rory McIlroy");
		graphalgo.add(14,"Mahendra Singh Dhoni");
		graphalgo.add(15,"Ronda Rousey");
		graphalgo.add(16,"Jordan Spieth");
		graphalgo.add(17,"Kaká");
		graphalgo.add(18,"Serena Williams");
		graphalgo.add(19,"Kei Nishikori");
		graphalgo.add(20,"Tom Brady");
		graphalgo.add(21,"Gareth Bale");
		graphalgo.add(22,"Maria Sharapova");
		graphalgo.add(23,"Dwyane Wade");
		graphalgo.add(24,"Conor McGregor");
		graphalgo.add(25,"Zlatan Ibrahimovic");
		graphalgo.add(26,"James Rodríguez");
		graphalgo.add(27,"James Harden");
		graphalgo.add(28,"Alexis Sánchez");
		graphalgo.add(29,"Mesut Özil");
		graphalgo.add(30,"Wayne Rooney");
		graphalgo.add(31,"Andy Murray");
		graphalgo.add(32,"Derrick Rose");
		graphalgo.add(33,"Kyrie Irving");
		graphalgo.add(34,"Russell Westbrook");
		graphalgo.add(35,"Antoine Griezmann");
		graphalgo.add(36,"Andrés Iniesta");
		graphalgo.add(37,"Luis Suárez");
		graphalgo.add(38,"Anderson Silva");
		graphalgo.add(39,"Paul Pogba");
		graphalgo.add(40,"Carmelo Anthony");
		graphalgo.add(41,"Stan Wawrinka");
		graphalgo.add(42,"Dustin Johnson");
		graphalgo.add(43,"Karim Benzema");
		graphalgo.add(44,"Marcelo Vieira");
		graphalgo.add(45,"Radamel Falcao");
		graphalgo.add(46,"Cam Newton");
		graphalgo.add(47,"Simone Biles");
		graphalgo.add(48,"Sergio Agüero");
		graphalgo.add(49,"Ivan Rakitic");
		graphalgo.add(50,"Chris Paul");
		graphalgo.add(51,"Drew Brees");
		graphalgo.add(52,"David Luiz");
		graphalgo.add(53,"Cesc Fàbregas");
		graphalgo.add(54,"Russell Wilson");
		graphalgo.add(55,"Aaron Rodgers");
		graphalgo.add(56,"Dani Alves");
		graphalgo.add(57,"Sergio Garcia");
		graphalgo.add(58,"Manny Pacquiao");
		graphalgo.add(59,"Eli Manning");
		graphalgo.add(60,"Damian Lillard");
		graphalgo.add(61,"Rickie Fowler");
		graphalgo.add(62,"Blake Griffin");
		graphalgo.add(63,"Odell Beckham Jr.");
		graphalgo.add(64,"Dwight Howard");
		graphalgo.add(65,"Ning Zetao");
		graphalgo.add(66,"Ryan Lochte");
		graphalgo.add(67,"Bastian Schweinsteiger");
		graphalgo.add(68,"Dale Earnhardt Jr.");
		graphalgo.add(69,"Javier Hernández");
		graphalgo.add(70,"Ma Long");
		graphalgo.add(71,"Toni Kroos");
		graphalgo.add(72,"Justin Rose");
		graphalgo.add(73,"J.J. Watt");
		graphalgo.add(74,"Hope Solo");
		graphalgo.add(75,"Thiago Silva");
		graphalgo.add(76,"Raheem Sterling");
		graphalgo.add(77,"Eden Hazard");
		graphalgo.add(78,"Theo Walcott");
		graphalgo.add(79,"Didier Drogba");
		graphalgo.add(80,"Mario Götze");
		graphalgo.add(81,"Robert Lewandowski");
		graphalgo.add(82,"Marco Reus");
		graphalgo.add(83,"Lewis Hamilton");
		graphalgo.add(84,"Jason Day");
		graphalgo.add(85,"Jimmie Johnson");
		graphalgo.add(86,"Caroline Wozniacki");
		graphalgo.add(87,"Lin Dan");
		graphalgo.add(88,"Saúl Álvarez");
		graphalgo.add(89,"Yuvraj Singh");
		graphalgo.add(90,"Thomas Müller");
		graphalgo.add(91,"Felipe Massa");
		graphalgo.add(92,"Eugenie Bouchard");
		graphalgo.add(93,"Bubba Watson");
		graphalgo.add(94,"Suresh Raina");
		graphalgo.add(95,"Gabriel Jesus");
		graphalgo.add(96,"Manuel Neuer");
		graphalgo.add(97,"Adam Scott");
		graphalgo.add(98,"Aly Raisman");
		graphalgo.add(99,"Mohamed Salah");
		
		
        adapter=new CustomListGraphAdapter(getActivity(),graphalgo);
        graphlist.setAdapter(adapter);
        graphlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getActivity(), PlayerActivity.class);
                intent.putExtra("graphname",graphalgo.get(i));
                startActivity(intent);
            }
        });
        return v;
    }

    public static Player newInstance(int position) {
        Player fragment = new Player();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }

}
