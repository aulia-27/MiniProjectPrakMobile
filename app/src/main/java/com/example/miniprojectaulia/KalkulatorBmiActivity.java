package com.example.miniprojectaulia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorBmiActivity extends AppCompatActivity {

    EditText editBB,editTB;
    Button btnHitung;
    TextView txtInfoBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_bmi);
        editBB = findViewById(R.id.editBB);
        editTB = findViewById(R.id.editTB);
        txtInfoBMI = findViewById(R.id.txtInfo);
        btnHitung = findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proses();
            }
        });
    }
    private void proses() {
        String height = editTB.getText().toString();
        String weight = editBB.getText().toString();

        if (height != null && !"".equals(height)
                && weight != null  &&  !"".equals(weight)) {
            float heightValue = Float.parseFloat(height) / 100;
            float weightValue = Float.parseFloat(weight);

            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi) {
        String bmiLabel = "";

        if (Float.compare(bmi, 18.5f) <= 0) {
            bmiLabel = "di bawah berat badan";
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 24.9f) <= 0) {
            bmiLabel = "Berat badan normal";
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 29.9f) <= 0) {
            bmiLabel = "Berat badan berlebih";
        } else {
            bmiLabel = "obesitas";
        }

        bmiLabel = bmi + "\n\n" + bmiLabel;
        txtInfoBMI.setText(bmiLabel);
    }
}