package shubh.sport.Player;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import shubh.sport.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerDetails extends Fragment {


    public PlayerDetails() {
        // Required empty public constructor
    }

    private TextView player_details,player_name,player_sport,player_dob;
    private PlayerActivity graphActivity;

    private String graphtitle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.player_details, container, false);
        player_details= v.findViewById(R.id.player_details);
        player_name= v.findViewById(R.id.player_name);
        player_sport= v.findViewById(R.id.player_sport);
        player_dob = v.findViewById(R.id.player_dob);


        switch (graphtitle)
        {


            case "Cristiano Ronaldo":
                player_name.setText("Cristiano Ronaldo");
                player_sport.setText("Footballer");
                player_dob.setText("5 February 1985");
                player_details.setText(R.string.p1_info);
                break;


            case "LeBron James":
                player_name.setText("LeBron James");
                player_sport.setText("Basketball player");
                player_dob.setText("30 December 1984");
                player_details.setText(R.string.p2_info);
                break;

            case "Lionel Messi":
                player_name.setText("Lionel Messi");
                player_sport.setText("Footballer");
                player_dob.setText("24 June 1987");
                player_details.setText(R.string.p3_info);
                break;

            case "Roger Federer":
                player_name.setText("Roger Federer");
                player_sport.setText("Tennis player");
                player_dob.setText("8 August 1981");
                player_details.setText(R.string.p4_info);
                break;

            case "Phil Mickelson":
                player_name.setText("Phil Mickelson");
                player_sport.setText("Golfer");
                player_dob.setText("16 June 1970");
                player_details.setText(R.string.p5_info);
                break;


            case "Neymar":
                player_name.setText("Neymar");
                player_sport.setText("Footballer");
                player_dob.setText("5 February 1992");
                player_details.setText(R.string.p6_info);
                break;

            case "Usain Bolt":
                player_name.setText("Usain Bolt");
                player_sport.setText("Sprinter");
                player_dob.setText("21 August 1986");
                player_details.setText(R.string.p7_info);
                break;

            case "Kevin Durant":
                player_name.setText("Kevin Durant");
                player_sport.setText("Basketball player");
                player_dob.setText("29 September 1988");
                player_details.setText(R.string.p8_info);
                break;

            case "Rafael Nadal":
                player_name.setText("Rafael Nadal");
                player_sport.setText("Tennis player");
                player_dob.setText("3 June 1985");
                player_details.setText(R.string.p9_info);
                break;

            case "Tiger Woods":
                player_name.setText("Tiger Woods");
                player_sport.setText("Golfer");
                player_dob.setText("30 December 1975");
                player_details.setText(R.string.p10_info);
                break;

            case "Stephen Curry":
                break;

            case "Novak Djokovic":
                break;

            case "Virat Kohli":
                break;

            case "Rory McIlroy":
                break;

            case "Mahendra Singh Dhoni":
                break;

            case "Ronda Rousey":
                break;

            case "Jordan Spieth":
                break;

            case "Kaká":
                break;

            case "Serena Williams":
                break;

            case "Kei Nishikori":
                break;

            case "Tom Brady":
                break;

            case "Gareth Bale":
                break;

            case "Maria Sharapova":
                break;

            case "Dwyane Wade":
                break;

            case "Conor McGregor":
                break;

            case "Zlatan Ibrahimovic":
                break;

            case "James Rodríguez":
                break;

            case "James Harden":
                break;

            case "Alexis Sánchez":
                break;

            case "Mesut Özil":
                break;

            case "Wayne Rooney":
                break;

            case "Andy Murray":
                break;

            case "Derrick Rose":
                break;

            case "Kyrie Irving":
                break;

            case "Russell Westbrook":
                break;

            case "Antoine Griezmann":
                break;

            case "Andrés Iniesta":
                break;

            case "Luis Suárez":
                break;

            case "Anderson Silva":
                break;

            case "Paul Pogba":
                break;

            case "Carmelo Anthony":
                break;

            case "Stan Wawrinka":
                break;

            case "Dustin Johnson":
                break;

            case "Karim Benzema":
                break;

            case "Marcelo Vieira":
                break;

            case "Radamel Falcao":
                break;

            case "Cam Newton":
                break;

            case "Simone Biles":
                break;

            case "Sergio Agüero":
                break;

            case "Ivan Rakitic":
                break;

            case "Chris Paul":
                break;

            case "Drew Brees":
                break;

            case "David Luiz":
                break;

            case "Cesc Fàbregas":
                break;

            case "Russell Wilson":
                break;

            case "Aaron Rodgers":
                break;

            case "Dani Alves":
                break;

            case "Sergio Garcia":
                break;

            case "Manny Pacquiao":
                break;

            case "Eli Manning":
                break;

            case "Damian Lillard":
                break;

            case "Rickie Fowler":
                break;

            case "Blake Griffin":
                break;

            case "Odell Beckham Jr.":
                break;

            case "Dwight Howard":
                break;

            case "Ning Zetao":
                break;

            case "Ryan Lochte":
                break;

            case "Bastian Schweinsteiger":
                break;

            case "Dale Earnhardt Jr.":
                break;

            case "Javier Hernández":
                break;

            case "Ma Long":
                break;

            case "Toni Kroos":
                break;

            case "Justin Rose":
                break;

            case "J.J. Watt":
                break;

            case "Hope Solo":
                break;

            case "Thiago Silva":
                break;

            case "Raheem Sterling":
                break;

            case "Eden Hazard":
                break;

            case "Theo Walcott":
                break;

            case "Didier Drogba":
                break;

            case "Mario Götze":
                break;

            case "Robert Lewandowski":
                break;

            case "Marco Reus":
                break;

            case "Lewis Hamilton":
                break;

            case "Jason Day":
                break;

            case "Jimmie Johnson":
                break;

            case "Caroline Wozniacki":
                break;

            case "Lin Dan":
                break;

            case "Saúl Álvarez":
                break;

            case "Yuvraj Singh":
                break;

            case "Thomas Müller":
                break;

            case "Felipe Massa":
                break;

            case "Eugenie Bouchard":
                break;

            case "Bubba Watson":
                break;

            case "Suresh Raina":
                break;

            case "Gabriel Jesus":
                break;

            case "Manuel Neuer":
                break;

            case "Adam Scott":
                break;

            case "Aly Raisman":
                break;

            case "Mohamed Salah":
                break;


        }
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            graphActivity= (PlayerActivity) context;
            graphtitle=graphActivity.getGraphtitle();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
