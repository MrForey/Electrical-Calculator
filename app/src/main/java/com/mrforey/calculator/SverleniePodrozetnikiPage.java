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

public class SverleniePodrozetnikiPage extends AppCompatActivity {

    private EditText podrozetniki_plainText1, podrozetniki_plainText2,podrozetniki_plainText3,podrozetniki_plainText4,podrozetniki_plainText5, podrozetniki_plainText6, podrozetniki_plainText7, podrozetniki_plainText8;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sverlenie_podrozetniki_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        podrozetniki_plainText1 = findViewById(R.id.text_field45);
        podrozetniki_plainText2 = findViewById(R.id.text_field46);
        podrozetniki_plainText3 = findViewById(R.id.text_field47);
        podrozetniki_plainText4 = findViewById(R.id.text_field48);
        podrozetniki_plainText5 = findViewById(R.id.text_field49);
        podrozetniki_plainText6 = findViewById(R.id.text_field50);
        podrozetniki_plainText7 = findViewById(R.id.text_field51);
        podrozetniki_plainText8 = findViewById(R.id.text_field52);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(podrozetniki_plainText1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(podrozetniki_plainText2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(podrozetniki_plainText3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(podrozetniki_plainText4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(podrozetniki_plainText5.getText().toString(),0);
                    float number6 = parseFloatOrDefault(podrozetniki_plainText6.getText().toString(),0);
                    float number7 = parseFloatOrDefault(podrozetniki_plainText7.getText().toString(),0);
                    float number8 = parseFloatOrDefault(podrozetniki_plainText8.getText().toString(),0);

                    float res = (number1 * 120) + (number2 * 400) + (number3 * 250) + (number4 * 700) + (number5 * 400) + (number6 * 250) + (number7 * 700) + (number8 * 1000);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(SverleniePodrozetnikiPage.this);
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
        edit.putString("save_text45", podrozetniki_plainText1.getText().toString());
        edit.putString("save_text46", podrozetniki_plainText2.getText().toString());
        edit.putString("save_text47", podrozetniki_plainText3.getText().toString());
        edit.putString("save_text48", podrozetniki_plainText4.getText().toString());
        edit.putString("save_text49", podrozetniki_plainText5.getText().toString());
        edit.putString("save_text50", podrozetniki_plainText6.getText().toString());
        edit.putString("save_text51", podrozetniki_plainText7.getText().toString());
        edit.putString("save_text52", podrozetniki_plainText8.getText().toString());
        edit.apply();
        Toast.makeText(SverleniePodrozetnikiPage.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}