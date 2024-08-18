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

public class MainActivity extends AppCompatActivity{

    private EditText rozetki_plainText1, rozetki_plainText2, rozetki_plainText3, rozetki_plainText4, rozetki_plainText5, rozetki_plainText6,
            rozetki_plainText7, rozetki_plainText8, rozetki_plainText9, rozetki_plainText10, rozetki_plainText11, rozetki_plainText12,
            rozetki_plainText13, rozetki_plainText14;
    private Button button_calculate;
    private Button button_calculate_all;
    Button save_button;
    SharedPreferences sPref;

    final String SAVE_STRING = "save_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rozetki_plainText1 = findViewById(R.id.text_field1);
        rozetki_plainText2 = findViewById(R.id.text_field2);
        rozetki_plainText3 = findViewById(R.id.text_field3);
        rozetki_plainText4 = findViewById(R.id.text_field4);
        rozetki_plainText5 = findViewById(R.id.text_field5);
        rozetki_plainText6 = findViewById(R.id.text_field6);
        rozetki_plainText7 = findViewById(R.id.text_field7);
        rozetki_plainText8 = findViewById(R.id.text_field8);
        rozetki_plainText9 = findViewById(R.id.text_field9);
        rozetki_plainText10 = findViewById(R.id.text_field10);
        rozetki_plainText11 = findViewById(R.id.text_field11);
        rozetki_plainText12 = findViewById(R.id.text_field12);
        rozetki_plainText13 = findViewById(R.id.text_field13);
        rozetki_plainText14 = findViewById(R.id.text_field14);

        String save_rozetki_plainText1 = rozetki_plainText1.getText().toString();
        String save_rozetki_plainText2 = rozetki_plainText2.getText().toString();
        String save_rozetki_plainText3 = rozetki_plainText3.getText().toString();
        String save_rozetki_plainText4 = rozetki_plainText4.getText().toString();
        String save_rozetki_plainText5 = rozetki_plainText5.getText().toString();
        String save_rozetki_plainText6 = rozetki_plainText6.getText().toString();
        String save_rozetki_plainText7 = rozetki_plainText7.getText().toString();
        String save_rozetki_plainText8 = rozetki_plainText8.getText().toString();
        String save_rozetki_plainText9 = rozetki_plainText9.getText().toString();
        String save_rozetki_plainText10 = rozetki_plainText10.getText().toString();
        String save_rozetki_plainText11 = rozetki_plainText11.getText().toString();
        String save_rozetki_plainText12 = rozetki_plainText12.getText().toString();
        String save_rozetki_plainText13 = rozetki_plainText13.getText().toString();
        String save_rozetki_plainText14 = rozetki_plainText14.getText().toString();

        button_calculate = findViewById(R.id.calculate_button1);
        save_button = findViewById(R.id.btnSave);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1 = parseFloatOrDefault(rozetki_plainText1.getText().toString(), 0);
                float number2 = parseFloatOrDefault(rozetki_plainText2.getText().toString(), 0);
                float number3 = parseFloatOrDefault(rozetki_plainText3.getText().toString(), 0);
                float number4 = parseFloatOrDefault(rozetki_plainText4.getText().toString(), 0);
                float number5 = parseFloatOrDefault(rozetki_plainText5.getText().toString(), 0);
                float number6 = parseFloatOrDefault(rozetki_plainText6.getText().toString(), 0);
                float number7 = parseFloatOrDefault(rozetki_plainText7.getText().toString(), 0);
                float number8 = parseFloatOrDefault(rozetki_plainText8.getText().toString(), 0);
                float number9 = parseFloatOrDefault(rozetki_plainText9.getText().toString(), 0);
                float number10 = parseFloatOrDefault(rozetki_plainText10.getText().toString(), 0);
                float number11 = parseFloatOrDefault(rozetki_plainText11.getText().toString(), 0);
                float number12 = parseFloatOrDefault(rozetki_plainText12.getText().toString(), 0);
                float number13 = parseFloatOrDefault(rozetki_plainText13.getText().toString(), 0);
                float number14 = parseFloatOrDefault(rozetki_plainText14.getText().toString(), 0);

                float res = (number1 * 350) + (number2 * 250) + (number3 * 350) + (number4 * 350) + (number5 * 400) + (number6 * 400) + (number7 * 600) +
                        (number8 * 800) + (number9 * 750) + (number10 * 350) + (number11 * 400) + (number12 * 1000) + (number13 * 400) + (number14 * 550);

                resultAlert("Итого: "+res+" руб.");

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
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
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
        edit.putString("save_text1", rozetki_plainText1.getText().toString());
        edit.putString("save_text2", rozetki_plainText2.getText().toString());
        edit.putString("save_text3", rozetki_plainText3.getText().toString());
        edit.putString("save_text4", rozetki_plainText4.getText().toString());
        edit.putString("save_text5", rozetki_plainText5.getText().toString());
        edit.putString("save_text6", rozetki_plainText6.getText().toString());
        edit.putString("save_text7", rozetki_plainText7.getText().toString());
        edit.putString("save_text8", rozetki_plainText8.getText().toString());
        edit.putString("save_text9", rozetki_plainText9.getText().toString());
        edit.putString("save_text10", rozetki_plainText10.getText().toString());
        edit.putString("save_text11", rozetki_plainText11.getText().toString());
        edit.putString("save_text12", rozetki_plainText12.getText().toString());
        edit.putString("save_text13", rozetki_plainText13.getText().toString());
        edit.putString("save_text14", rozetki_plainText14.getText().toString());
        edit.apply();
        Toast.makeText(MainActivity.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }


}