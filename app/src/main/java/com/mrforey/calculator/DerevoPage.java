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

public class DerevoPage extends AppCompatActivity {

    private EditText derevo_plainText1, derevo_plainText2,derevo_plainText3,derevo_plainText4,derevo_plainText5,derevo_plainText6,
            derevo_plainText7,derevo_plainText8,derevo_plainText9,derevo_plainText10,derevo_plainText11,derevo_plainText12,derevo_plainText13,derevo_plainText14;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_derevo_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        derevo_plainText1 = findViewById(R.id.text_field133);
        derevo_plainText2 = findViewById(R.id.text_field134);
        derevo_plainText3 = findViewById(R.id.text_field135);
        derevo_plainText4 = findViewById(R.id.text_field136);
        derevo_plainText5 = findViewById(R.id.text_field137);
        derevo_plainText6 = findViewById(R.id.text_field138);
        derevo_plainText7 = findViewById(R.id.text_field139);
        derevo_plainText8 = findViewById(R.id.text_field140);
        derevo_plainText9 = findViewById(R.id.text_field141);
        derevo_plainText10 = findViewById(R.id.text_field142);
        derevo_plainText11 = findViewById(R.id.text_field143);
        derevo_plainText12 = findViewById(R.id.text_field144);
        derevo_plainText13 = findViewById(R.id.text_field145);
        derevo_plainText14 = findViewById(R.id.text_field146);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(derevo_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(derevo_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(derevo_plainText3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(derevo_plainText4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(derevo_plainText5.getText().toString(),0);
                    float number6 = parseFloatOrDefault(derevo_plainText6.getText().toString(),0);
                    float number7 = parseFloatOrDefault(derevo_plainText7.getText().toString(),0);
                    float number8 = parseFloatOrDefault(derevo_plainText8.getText().toString(),0);
                    float number9 = parseFloatOrDefault(derevo_plainText9.getText().toString(),0);
                    float number10 = parseFloatOrDefault(derevo_plainText10.getText().toString(),0);
                    float number11 = parseFloatOrDefault(derevo_plainText11.getText().toString(),0);
                    float number12 = parseFloatOrDefault(derevo_plainText9.getText().toString(),0);
                    float number13 = parseFloatOrDefault(derevo_plainText10.getText().toString(),0);
                    float number14 = parseFloatOrDefault(derevo_plainText11.getText().toString(),0);

                    float res = (number1 * 350) + (number2 * 300) + (number3 * 400) + (number4 * 300) + (number5 * 100) + (number6 * 300) + (number7 * 80)
                            + (number8 * 120)+ (number9 * 150) + (number10 * 100) + (number11 * 120) + (number12 * 100) + (number13 * 250) + (number14 * 400);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(DerevoPage.this);
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
        edit.putString("save_text133", derevo_plainText1.getText().toString());
        edit.putString("save_text134", derevo_plainText2.getText().toString());
        edit.putString("save_text135", derevo_plainText3.getText().toString());
        edit.putString("save_text136", derevo_plainText4.getText().toString());
        edit.putString("save_text137", derevo_plainText5.getText().toString());
        edit.putString("save_text138", derevo_plainText6.getText().toString());
        edit.putString("save_text139", derevo_plainText7.getText().toString());
        edit.putString("save_text140", derevo_plainText8.getText().toString());
        edit.putString("save_text141", derevo_plainText9.getText().toString());
        edit.putString("save_text142", derevo_plainText10.getText().toString());
        edit.putString("save_text143", derevo_plainText11.getText().toString());
        edit.putString("save_text144", derevo_plainText12.getText().toString());
        edit.putString("save_text145", derevo_plainText13.getText().toString());
        edit.putString("save_text146", derevo_plainText14.getText().toString());
        edit.apply();
        Toast.makeText(DerevoPage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}