package shubh.sport.Hindi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import me.anwarshahriar.calligrapher.Calligrapher;
import shubh.sport.AboutUs;
import shubh.sport.NewsFragment;
import shubh.sport.R;
import shubh.sport.Social.Social_Login;
import shubh.sport.Social.Social_Register;
import shubh.sport.Social.Social_Timeline;
import shubh.sport.SportsFragment;
import shubh.sport.ToolsFragment;
import shubh.sport.UpdatesFragment;
import shubh.sport.leaderboard;

import static java.lang.System.exit;

/**
 * Created by $hubh on 2/18/2018.
 */

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.tools:
                  transaction.replace(R.id.container,new ToolsFragment()).commit();
                    return true;
                case R.id.news:
                    transaction.replace(R.id.container,new NewsFragment()).commit();
                    return true;
                case R.id.training:
                    transaction.replace(R.id.container,new SportsFragment()).commit();
                    return true;
                case R.id.item:
                    transaction.replace(R.id.container,new UpdatesFragment()).commit();
                    return true;
                case R.id.profile:
                    transaction.replace(R.id.container,new leaderboard()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setElevation(0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.training);

        bottomNavigationView = findViewById(R.id.navigation);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container,new SportsFragment()).commit();

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"productsans.ttf",true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu main)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, main);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.signin:
                Intent intent = new Intent(MainActivity.this,Social_Login.class);
                startActivity(intent);
                return true;

            case R.id.register:
                Intent intent2 = new Intent(MainActivity.this,Social_Register.class);
                startActivity(intent2);
                return true;

            case R.id.Update:
                Intent intent3 = new Intent(MainActivity.this, Social_Timeline.class);
                startActivity(intent3);
                return true;

            case R.id.aboutus:
                Intent intent4 = new Intent(MainActivity.this, AboutUs.class);
                startActivity(intent4);
                return true;

            case R.id.exit:
                exit(0);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

private Boolean exit = false;
    @Override
    public void onBackPressed()
    {
        if (exit) {
            finish();
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);
        }
    }
}
