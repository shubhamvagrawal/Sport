package shubh.sport.BMI;

/**
 * Created by $hubh on 3/17/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import shubh.sport.R;

public class bmi extends AppCompatActivity {

        private EditText height;
        private EditText weight;
        private TextView result;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.bmi);
            height = findViewById(R.id.height);
            weight = findViewById(R.id.weight);
            result = findViewById(R.id.result);
        }

        public void calculateBMI(View v) {
            String heightStr = height.getText().toString();
            String weightStr = weight.getText().toString();

            if (heightStr != null && !"".equals(heightStr)
                    && weightStr != null  &&  !"".equals(weightStr)) {
                float heightValue = Float.parseFloat(heightStr) / 100;
                float weightValue = Float.parseFloat(weightStr);

                float bmi = weightValue / (heightValue * heightValue);

                displayBMI(bmi);
            }
        }

        private void displayBMI(float bmi) {
            String bmiLabel = "";

            if (Float.compare(bmi, 15f) <= 0) {
                bmiLabel = getString(R.string.very_severely_underweight);
            } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
                bmiLabel = getString(R.string.severely_underweight);
            } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
                bmiLabel = getString(R.string.underweight);
            } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
                bmiLabel = getString(R.string.normal);
            } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
                bmiLabel = getString(R.string.overweight);
            } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
                bmiLabel = getString(R.string.Moderate_Obese);
            } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
                bmiLabel = getString(R.string.Severely_Obese);
            } else {
                bmiLabel = getString(R.string.Very_Severely_Obese);
            }

            bmiLabel = bmi + "\n\n" + bmiLabel;
            result.setText(bmiLabel);
        }
    }
