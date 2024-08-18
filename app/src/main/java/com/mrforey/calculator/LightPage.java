package com.mrforey.calculator;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LightPage extends AppCompatActivity {

    private EditText light_plainText1, light_plainText2, light_plainText3, light_plainText4, light_plainText5, light_plainText6, light_plainText7, light_plainText8, light_plainText9, light_plainText10, light_plainText11, light_plainText12;
    private Button button_calculate;
    SharedPreferences sPref;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_light_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        light_plainText1 = findViewById(R.id.text_field15);
        light_plainText2 = findViewById(R.id.text_field16);
        light_plainText3 = findViewById(R.id.text_field17);
        light_plainText4 = findViewById(R.id.text_field18);
        light_plainText5 = findViewById(R.id.text_field19);
        light_plainText6 = findViewById(R.id.text_field20);
        light_plainText7 = findViewById(R.id.text_field21);
        light_plainText8 = findViewById(R.id.text_field22);
        light_plainText9 = findViewById(R.id.text_field23);
        light_plainText10 = findViewById(R.id.text_field24);
        light_plainText11 = findViewById(R.id.text_field25);
        light_plainText12 = findViewById(R.id.text_field26);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(light_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(light_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(light_plainText3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(light_plainText4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(light_plainText5.getText().toString(),0);
                    float number6 = parseFloatOrDefault(light_plainText6.getText().toString(),0);
                    float number7 = parseFloatOrDefault(light_plainText7.getText().toString(),0);
                    float number8 = parseFloatOrDefault(light_plainText8.getText().toString(),0);
                    float number9 = parseFloatOrDefault(light_plainText9.getText().toString(),0);
                    float number10 = parseFloatOrDefault(light_plainText10.getText().toString(),0);
                    float number11 = parseFloatOrDefault(light_plainText11.getText().toString(),0);
                    float number12 = parseFloatOrDefault(light_plainText12.getText().toString(),0);

                    float res = (number1 * 1000) + (number2 * 550) + (number3 * 200) + (number4 * 250) + (number5 * 350) + (number6 * 150) + (number7 * 350) +
                            (number8 * 200) + (number9 * 1000) + (number10 * 1000) + (number11 * 600) + (number12 * 300);

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

    private void resultAlert(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(LightPage.this);
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
        edit.putString("save_text15", light_plainText1.getText().toString());
        edit.putString("save_text16", light_plainText2.getText().toString());
        edit.putString("save_text17", light_plainText3.getText().toString());
        edit.putString("save_text18", light_plainText4.getText().toString());
        edit.putString("save_text19", light_plainText5.getText().toString());
        edit.putString("save_text20", light_plainText6.getText().toString());
        edit.putString("save_text21", light_plainText7.getText().toString());
        edit.putString("save_text22", light_plainText8.getText().toString());
        edit.putString("save_text23", light_plainText9.getText().toString());
        edit.putString("save_text24", light_plainText10.getText().toString());
        edit.putString("save_text25", light_plainText11.getText().toString());
        edit.putString("save_text26", light_plainText12.getText().toString());
        edit.apply();
        Toast.makeText(LightPage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }

}