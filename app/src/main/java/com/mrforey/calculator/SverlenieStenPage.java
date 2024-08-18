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

public class SverlenieStenPage extends AppCompatActivity {

    private EditText sverlenie_sten_plainText1, sverlenie_sten_plainText2,sverlenie_sten_plainText3,sverlenie_sten_plainText4,sverlenie_sten_plainText5,
            sverlenie_sten_plainText6, sverlenie_sten_plainText7, sverlenie_sten_plainText8, sverlenie_sten_plainText9, sverlenie_sten_plainText10, sverlenie_sten_plainText11;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sverlenie_sten_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sverlenie_sten_plainText1 = findViewById(R.id.text_field53);
        sverlenie_sten_plainText2 = findViewById(R.id.text_field54);
        sverlenie_sten_plainText3 = findViewById(R.id.text_field55);
        sverlenie_sten_plainText4 = findViewById(R.id.text_field56);
        sverlenie_sten_plainText5 = findViewById(R.id.text_field57);
        sverlenie_sten_plainText6 = findViewById(R.id.text_field58);
        sverlenie_sten_plainText7 = findViewById(R.id.text_field59);
        sverlenie_sten_plainText8 = findViewById(R.id.text_field60);
        sverlenie_sten_plainText9 = findViewById(R.id.text_field61);
        sverlenie_sten_plainText10 = findViewById(R.id.text_field62);
        sverlenie_sten_plainText11 = findViewById(R.id.text_field63);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(sverlenie_sten_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(sverlenie_sten_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(sverlenie_sten_plainText3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(sverlenie_sten_plainText4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(sverlenie_sten_plainText5.getText().toString(),0);
                    float number6 = parseFloatOrDefault(sverlenie_sten_plainText6.getText().toString(),0);
                    float number7 = parseFloatOrDefault(sverlenie_sten_plainText7.getText().toString(),0);
                    float number8 = parseFloatOrDefault(sverlenie_sten_plainText8.getText().toString(),0);
                    float number9 = parseFloatOrDefault(sverlenie_sten_plainText9.getText().toString(),0);
                    float number10 = parseFloatOrDefault(sverlenie_sten_plainText10.getText().toString(),0);
                    float number11 = parseFloatOrDefault(sverlenie_sten_plainText11.getText().toString(),0);

                    float res = (number1 * 245) + (number2 * 345) + (number3 * 200) + (number4 * 350) + (number5 * 590) + (number6 * 300) + (number7 * 445) +
                            (number8 * 745)+ (number9 * 400) + (number10 * 745)+ (number11 * 1100);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(SverlenieStenPage.this);
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
        edit.putString("save_text53", sverlenie_sten_plainText1.getText().toString());
        edit.putString("save_text54", sverlenie_sten_plainText2.getText().toString());
        edit.putString("save_text55", sverlenie_sten_plainText3.getText().toString());
        edit.putString("save_text56", sverlenie_sten_plainText4.getText().toString());
        edit.putString("save_text57", sverlenie_sten_plainText5.getText().toString());
        edit.putString("save_text58", sverlenie_sten_plainText6.getText().toString());
        edit.putString("save_text59", sverlenie_sten_plainText7.getText().toString());
        edit.putString("save_text60", sverlenie_sten_plainText8.getText().toString());
        edit.putString("save_text61", sverlenie_sten_plainText9.getText().toString());
        edit.putString("save_text62", sverlenie_sten_plainText10.getText().toString());
        edit.putString("save_text63", sverlenie_sten_plainText11.getText().toString());
        edit.apply();
        Toast.makeText(SverlenieStenPage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}