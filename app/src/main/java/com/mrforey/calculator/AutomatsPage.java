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

public class AutomatsPage extends AppCompatActivity {

    private EditText automats_plainText1, automats_plainText2,automats_plainText3,automats_plainText4,automats_plainText5,automats_plainText6,
            automats_plainText7,automats_plainText8,automats_plainText9,automats_plainText10,automats_plainText11,automats_plainText12,automats_plainText13;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_automats_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        automats_plainText1 = findViewById(R.id.text_field109);
        automats_plainText2 = findViewById(R.id.text_field110);
        automats_plainText3 = findViewById(R.id.text_field111);
        automats_plainText4 = findViewById(R.id.text_field112);
        automats_plainText5 = findViewById(R.id.text_field113);
        automats_plainText6 = findViewById(R.id.text_field114);
        automats_plainText7 = findViewById(R.id.text_field115);
        automats_plainText8 = findViewById(R.id.text_field116);
        automats_plainText9 = findViewById(R.id.text_field117);
        automats_plainText10 = findViewById(R.id.text_field118);
        automats_plainText11 = findViewById(R.id.text_field119);
        automats_plainText12 = findViewById(R.id.text_field120);
        automats_plainText13 = findViewById(R.id.text_field121);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(automats_plainText1.getText().toString(), 0);
                    float number2 = parseFloatOrDefault(automats_plainText2.getText().toString(), 0);
                    float number3 = parseFloatOrDefault(automats_plainText3.getText().toString(), 0);
                    float number4 = parseFloatOrDefault(automats_plainText4.getText().toString(), 0);
                    float number5 = parseFloatOrDefault(automats_plainText5.getText().toString(), 0);
                    float number6 = parseFloatOrDefault(automats_plainText6.getText().toString(), 0);
                    float number7 = parseFloatOrDefault(automats_plainText7.getText().toString(), 0);
                    float number8 = parseFloatOrDefault(automats_plainText8.getText().toString(), 0);
                    float number9 = parseFloatOrDefault(automats_plainText9.getText().toString(), 0);
                    float number10 = parseFloatOrDefault(automats_plainText10.getText().toString(), 0);
                    float number11 = parseFloatOrDefault(automats_plainText11.getText().toString(), 0);
                    float number12 = parseFloatOrDefault(automats_plainText12.getText().toString(), 0);
                    float number13 = parseFloatOrDefault(automats_plainText13.getText().toString(), 0);


                    float res = (number1 * 340) + (number2 * 500) + (number3 * 600) + (number4 * 800) + (number5 * 1800) + (number6 * 900) + (number7 * 1800)
                            + (number8 * 500)+ (number9 * 800) + (number10 * 100) + (number11 * 100) + (number12 * 700) + (number13 * 900);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(AutomatsPage.this);
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
        edit.putString("save_text109", automats_plainText1.getText().toString());
        edit.putString("save_text110", automats_plainText2.getText().toString());
        edit.putString("save_text111", automats_plainText3.getText().toString());
        edit.putString("save_text112", automats_plainText4.getText().toString());
        edit.putString("save_text113", automats_plainText5.getText().toString());
        edit.putString("save_text114", automats_plainText6.getText().toString());
        edit.putString("save_text115", automats_plainText7.getText().toString());
        edit.putString("save_text116", automats_plainText8.getText().toString());
        edit.putString("save_text117", automats_plainText9.getText().toString());
        edit.putString("save_text118", automats_plainText10.getText().toString());
        edit.putString("save_text119", automats_plainText11.getText().toString());
        edit.putString("save_text120", automats_plainText12.getText().toString());
        edit.putString("save_text121", automats_plainText13.getText().toString());
        edit.apply();
        Toast.makeText(AutomatsPage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}