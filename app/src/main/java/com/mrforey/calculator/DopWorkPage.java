package com.mrforey.calculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DopWorkPage extends AppCompatActivity {

    private EditText dop_plainText1, dop_plainText2,dop_plainText3, dop_plainText4, dop_plainText5,
            dop_plainText6, dop_plainText7, dop_plainText8,dop_plainText9, dop_plainText10,
            dop_plainText11,dop_plainText12, dop_plainText13, dop_plainText14;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dop_work_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dop_plainText1 = findViewById(R.id.text_field164);
        dop_plainText2 = findViewById(R.id.text_field165);
        dop_plainText3 = findViewById(R.id.text_field166);
        dop_plainText4 = findViewById(R.id.text_field167);
        dop_plainText5 = findViewById(R.id.text_field168);
        dop_plainText6 = findViewById(R.id.text_field169);
        dop_plainText7 = findViewById(R.id.text_field170);
        dop_plainText8 = findViewById(R.id.text_field171);
        dop_plainText9 = findViewById(R.id.text_field172);
        dop_plainText10 = findViewById(R.id.text_field173);
        dop_plainText11 = findViewById(R.id.text_field174);
        dop_plainText12 = findViewById(R.id.text_field175);
        dop_plainText13 = findViewById(R.id.text_field176);
        dop_plainText14 = findViewById(R.id.text_field177);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(dop_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(dop_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(dop_plainText3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(dop_plainText4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(dop_plainText5.getText().toString(),0);
                    float number6 = parseFloatOrDefault(dop_plainText6.getText().toString(),0);
                    float number7 = parseFloatOrDefault(dop_plainText7.getText().toString(),0);
                    float number8 = parseFloatOrDefault(dop_plainText8.getText().toString(),0);
                    float number9 = parseFloatOrDefault(dop_plainText9.getText().toString(),0);
                    float number10 = parseFloatOrDefault(dop_plainText10.getText().toString(),0);
                    float number11 = parseFloatOrDefault(dop_plainText11.getText().toString(),0);
                    float number12 = parseFloatOrDefault(dop_plainText12.getText().toString(),0);
                    float number13 = parseFloatOrDefault(dop_plainText13.getText().toString(),0);
                    float number14 = parseFloatOrDefault(dop_plainText14.getText().toString(),0);

                    float res = (number1 * 40) + (number2 * 50) + (number3 * 150) + (number4 * 35) + (number5 * 1000) + (number6 * 1000) +
                            (number7 * 1000) + (number8 * 1000) + (number9 * 4000) + (number10 * 1400) + (number11 * 15000) + (number12 * 3000) +
                            (number13 * 3000) + (number14 * 3000);

                    resultAlert("Итого: " + res + " руб.");
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            private float parseFloatOrDefault(String text, float defaultValue) {
                try {
                    return Float.parseFloat(text);
                } catch (NumberFormatException e) {
                    return defaultValue;
                }
            }

        });
    }

    private void resultAlert(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(DopWorkPage.this);
        builder.setTitle("Успешный расчёт!")
                .setMessage(text)
                .setCancelable(true)
                .setPositiveButton("ОК!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void goToMenu(View v)
    {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void saveText(View v){
        sPref = getSharedPreferences("my_settings", MODE_PRIVATE);
        SharedPreferences.Editor edit = sPref.edit();
        edit.putString("save_text164", dop_plainText1.getText().toString());
        edit.putString("save_text165", dop_plainText2.getText().toString());
        edit.putString("save_text166", dop_plainText3.getText().toString());
        edit.putString("save_text167", dop_plainText4.getText().toString());
        edit.putString("save_text168", dop_plainText5.getText().toString());
        edit.putString("save_text169", dop_plainText6.getText().toString());
        edit.putString("save_text170", dop_plainText7.getText().toString());
        edit.putString("save_text171", dop_plainText8.getText().toString());
        edit.putString("save_text172", dop_plainText9.getText().toString());
        edit.putString("save_text173", dop_plainText10.getText().toString());
        edit.putString("save_text174", dop_plainText11.getText().toString());
        edit.putString("save_text175", dop_plainText12.getText().toString());
        edit.putString("save_text176", dop_plainText13.getText().toString());
        edit.putString("save_text177", dop_plainText14.getText().toString());
        edit.apply();
        Toast.makeText(DopWorkPage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}