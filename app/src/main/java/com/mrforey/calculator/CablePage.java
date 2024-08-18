package com.mrforey.calculator;

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

public class CablePage extends AppCompatActivity {

    private EditText cable_plainText1, cable_plainText2,cable_plainText3,cable_plainText4,cable_plainText5,cable_plainText6,cable_plainText7,cable_plainText8,
            cable_plainText9,cable_plainText10,cable_plainText11,cable_plainText12, cable_plainText13;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cable_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cable_plainText1 = findViewById(R.id.text_field27);
        cable_plainText2 = findViewById(R.id.text_field28);
        cable_plainText3 = findViewById(R.id.text_field29);
        cable_plainText4 = findViewById(R.id.text_field30);
        cable_plainText5 = findViewById(R.id.text_field31);
        cable_plainText6 = findViewById(R.id.text_field32);
        cable_plainText7 = findViewById(R.id.text_field33);
        cable_plainText8 = findViewById(R.id.text_field34);
        cable_plainText9 = findViewById(R.id.text_field35);
        cable_plainText10 = findViewById(R.id.text_field36);
        cable_plainText11 = findViewById(R.id.text_field37);
        cable_plainText12 = findViewById(R.id.text_field38);
        cable_plainText13 = findViewById(R.id.text_field39);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(cable_plainText1.getText().toString(), 0);
                    float number2 = parseFloatOrDefault(cable_plainText2.getText().toString(), 0);
                    float number3 = parseFloatOrDefault(cable_plainText3.getText().toString(), 0);
                    float number4 = parseFloatOrDefault(cable_plainText4.getText().toString(), 0);
                    float number5 = parseFloatOrDefault(cable_plainText5.getText().toString(), 0);
                    float number6 = parseFloatOrDefault(cable_plainText6.getText().toString(), 0);
                    float number7 = parseFloatOrDefault(cable_plainText7.getText().toString(), 0);
                    float number8 = parseFloatOrDefault(cable_plainText8.getText().toString(), 0);
                    float number9 = parseFloatOrDefault(cable_plainText9.getText().toString(), 0);
                    float number10 = parseFloatOrDefault(cable_plainText10.getText().toString(), 0);
                    float number11 = parseFloatOrDefault(cable_plainText11.getText().toString(), 0);
                    float number12 = parseFloatOrDefault(cable_plainText12.getText().toString(), 0);
                    float number13 = parseFloatOrDefault(cable_plainText13.getText().toString(), 0);

                    float res = (number1 * 80) + (number2 * 80) + (number3 * 120) + (number4 * 80) + (number5 * 130) + (number6 * 130) +
                            (number7 * 150) + (number8 * 120) + (number9 * 30) + (number10 * 35) + (number11 * 40) + (number12 * 90) + (number13 * 100);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(CablePage.this);
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
        edit.putString("save_text27", cable_plainText1.getText().toString());
        edit.putString("save_text28", cable_plainText2.getText().toString());
        edit.putString("save_text29", cable_plainText3.getText().toString());
        edit.putString("save_text30", cable_plainText4.getText().toString());
        edit.putString("save_text31", cable_plainText5.getText().toString());
        edit.putString("save_text32", cable_plainText6.getText().toString());
        edit.putString("save_text33", cable_plainText7.getText().toString());
        edit.putString("save_text34", cable_plainText8.getText().toString());
        edit.putString("save_text35", cable_plainText9.getText().toString());
        edit.putString("save_text36", cable_plainText10.getText().toString());
        edit.putString("save_text37", cable_plainText11.getText().toString());
        edit.putString("save_text38", cable_plainText12.getText().toString());
        edit.putString("save_text39", cable_plainText13.getText().toString());
        edit.apply();
        Toast.makeText(CablePage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}
