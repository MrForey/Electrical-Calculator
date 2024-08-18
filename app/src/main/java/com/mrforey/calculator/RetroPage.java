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

public class RetroPage extends AppCompatActivity {

    private EditText retro_plainText1, retro_plainText2,retro_plainText3,retro_plainText4,retro_plainText5,retro_plainText6,
            retro_plainText7,retro_plainText8;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_retro_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        retro_plainText1 = findViewById(R.id.text_field147);
        retro_plainText2 = findViewById(R.id.text_field148);
        retro_plainText3 = findViewById(R.id.text_field149);
        retro_plainText4 = findViewById(R.id.text_field150);
        retro_plainText5 = findViewById(R.id.text_field151);
        retro_plainText6 = findViewById(R.id.text_field152);
        retro_plainText7 = findViewById(R.id.text_field153);
        retro_plainText8 = findViewById(R.id.text_field154);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(retro_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(retro_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(retro_plainText3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(retro_plainText4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(retro_plainText5.getText().toString(),0);
                    float number6 = parseFloatOrDefault(retro_plainText6.getText().toString(),0);
                    float number7 = parseFloatOrDefault(retro_plainText7.getText().toString(),0);
                    float number8 = parseFloatOrDefault(retro_plainText8.getText().toString(),0);

                    float res = (number1 * 100) + (number2 * 70) + (number3 * 30) + (number4 * 50) + (number5 * 600) + (number6 * 900) + (number7 * 500) + (number8 * 800);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(RetroPage.this);
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
        edit.putString("save_text147", retro_plainText1.getText().toString());
        edit.putString("save_text148", retro_plainText2.getText().toString());
        edit.putString("save_text149", retro_plainText3.getText().toString());
        edit.putString("save_text150", retro_plainText4.getText().toString());
        edit.putString("save_text151", retro_plainText5.getText().toString());
        edit.putString("save_text152", retro_plainText6.getText().toString());
        edit.putString("save_text153", retro_plainText7.getText().toString());
        edit.putString("save_text154", retro_plainText8.getText().toString());
        edit.apply();
        Toast.makeText(RetroPage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}