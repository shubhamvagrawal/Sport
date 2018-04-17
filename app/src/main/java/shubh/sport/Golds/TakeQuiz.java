package shubh.sport.Golds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import shubh.sport.R;

public class TakeQuiz extends AppCompatActivity {

    Button yes, no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_quiz);

        View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.yes:
                        startActivity(new Intent(getApplicationContext(), Quiz.class));
                        break;
                    case R.id.no:
                        startActivity(new Intent(getApplicationContext(), HomeScreen.class));
                        break;
                }
            }
        };

        yes = (Button) findViewById(R.id.yes);
        yes.setOnClickListener(onClick);

        no = (Button) findViewById(R.id.no);
        no.setOnClickListener(onClick);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), HomeScreen.class));
    }
}
