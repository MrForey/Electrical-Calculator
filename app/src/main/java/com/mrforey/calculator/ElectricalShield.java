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

public class ElectricalShield extends AppCompatActivity {

    private EditText electrical_plain1, electrical_plain2,electrical_plain3,electrical_plain4, electrical_plain5,electrical_plain6,electrical_plain7,
            electrical_plain8,electrical_plain9,electrical_plain10, electrical_plain11, electrical_plain12,electrical_plain13,electrical_plain14,
            electrical_plain15,electrical_plain16,electrical_plain17, electrical_plain18,electrical_plain19,electrical_plain20, electrical_plain21,
            electrical_plain22,electrical_plain23,electrical_plain24, electrical_plain25,electrical_plain26,electrical_plain27, electrical_plain28,electrical_plain29,
            electrical_plain30, electrical_plain31,electrical_plain32,electrical_plain33, electrical_plain34,electrical_plain35,electrical_plain36;
    private Button button_calculate;
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_electrical_shield);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        electrical_plain1 = findViewById(R.id.text_field73);
        electrical_plain2 = findViewById(R.id.text_field74);
        electrical_plain3 = findViewById(R.id.text_field75);
        electrical_plain4 = findViewById(R.id.text_field76);
        electrical_plain5 = findViewById(R.id.text_field77);
        electrical_plain6 = findViewById(R.id.text_field78);
        electrical_plain7 = findViewById(R.id.text_field79);
        electrical_plain8 = findViewById(R.id.text_field80);
        electrical_plain9 = findViewById(R.id.text_field81);
        electrical_plain10 = findViewById(R.id.text_field82);
        electrical_plain11 = findViewById(R.id.text_field83);
        electrical_plain12 = findViewById(R.id.text_field84);
        electrical_plain13 = findViewById(R.id.text_field85);
        electrical_plain14 = findViewById(R.id.text_field86);
        electrical_plain15 = findViewById(R.id.text_field87);
        electrical_plain16 = findViewById(R.id.text_field88);
        electrical_plain17 = findViewById(R.id.text_field89);
        electrical_plain18 = findViewById(R.id.text_field90);
        electrical_plain19 = findViewById(R.id.text_field91);
        electrical_plain20 = findViewById(R.id.text_field92);
        electrical_plain21 = findViewById(R.id.text_field93);
        electrical_plain22 = findViewById(R.id.text_field94);
        electrical_plain23 = findViewById(R.id.text_field95);
        electrical_plain24 = findViewById(R.id.text_field96);
        electrical_plain25 = findViewById(R.id.text_field97);
        electrical_plain26 = findViewById(R.id.text_field98);
        electrical_plain27 = findViewById(R.id.text_field99);
        electrical_plain28 = findViewById(R.id.text_field100);
        electrical_plain29 = findViewById(R.id.text_field101);
        electrical_plain30 = findViewById(R.id.text_field102);
        electrical_plain31 = findViewById(R.id.text_field103);
        electrical_plain32 = findViewById(R.id.text_field104);
        electrical_plain33 = findViewById(R.id.text_field105);
        electrical_plain34 = findViewById(R.id.text_field106);
        electrical_plain35 = findViewById(R.id.text_field107);
        electrical_plain36 = findViewById(R.id.text_field108);

        button_calculate = findViewById(R.id.calculate_button1);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float number1 = parseFloatOrDefault(electrical_plain1.getText().toString(),0);
                    float number2 = parseFloatOrDefault(electrical_plain2.getText().toString(),0);
                    float number3 = parseFloatOrDefault(electrical_plain3.getText().toString(),0);
                    float number4 = parseFloatOrDefault(electrical_plain4.getText().toString(),0);
                    float number5 = parseFloatOrDefault(electrical_plain5.getText().toString(),0);
                    float number6 = parseFloatOrDefault(electrical_plain6.getText().toString(),0);
                    float number7 = parseFloatOrDefault(electrical_plain7.getText().toString(),0);
                    float number8 = parseFloatOrDefault(electrical_plain8.getText().toString(),0);
                    float number9 = parseFloatOrDefault(electrical_plain9.getText().toString(),0);
                    float number10 = parseFloatOrDefault(electrical_plain10.getText().toString(),0);
                    float number11 = parseFloatOrDefault(electrical_plain11.getText().toString(),0);
                    float number12 = parseFloatOrDefault(electrical_plain12.getText().toString(),0);
                    float number13 = parseFloatOrDefault(electrical_plain13.getText().toString(),0);
                    float number14 = parseFloatOrDefault(electrical_plain14.getText().toString(),0);
                    float number15 = parseFloatOrDefault(electrical_plain15.getText().toString(),0);
                    float number16 = parseFloatOrDefault(electrical_plain16.getText().toString(),0);
                    float number17 = parseFloatOrDefault(electrical_plain17.getText().toString(),0);
                    float number18 = parseFloatOrDefault(electrical_plain18.getText().toString(),0);
                    float number19 = parseFloatOrDefault(electrical_plain19.getText().toString(),0);
                    float number20 = parseFloatOrDefault(electrical_plain20.getText().toString(),0);
                    float number21 = parseFloatOrDefault(electrical_plain21.getText().toString(),0);
                    float number22 = parseFloatOrDefault(electrical_plain22.getText().toString(),0);
                    float number23 = parseFloatOrDefault(electrical_plain23.getText().toString(),0);
                    float number24 = parseFloatOrDefault(electrical_plain24.getText().toString(),0);
                    float number25 = parseFloatOrDefault(electrical_plain25.getText().toString(),0);
                    float number26 = parseFloatOrDefault(electrical_plain26.getText().toString(),0);
                    float number27 = parseFloatOrDefault(electrical_plain27.getText().toString(),0);
                    float number28 = parseFloatOrDefault(electrical_plain28.getText().toString(),0);
                    float number29 = parseFloatOrDefault(electrical_plain29.getText().toString(),0);
                    float number30 = parseFloatOrDefault(electrical_plain30.getText().toString(),0);
                    float number31 = parseFloatOrDefault(electrical_plain31.getText().toString(),0);
                    float number32 = parseFloatOrDefault(electrical_plain32.getText().toString(),0);
                    float number33 = parseFloatOrDefault(electrical_plain33.getText().toString(),0);
                    float number34 = parseFloatOrDefault(electrical_plain34.getText().toString(),0);
                    float number35 = parseFloatOrDefault(electrical_plain35.getText().toString(),0);
                    float number36 = parseFloatOrDefault(electrical_plain36.getText().toString(),0);

                    float res = (number1 * 2400) + (number2 * 3600) + (number3 * 4900) + (number4 * 5350) + (number5 * 7150) + (number6 * 8200) + (number7 * 11000)
                            + (number8 * 1800)+ (number9 * 2350) + (number10 * 2400) + (number11 * 3600) + (number12 * 4700) + (number13 * 5350) + (number14 * 7100)
                            + (number15 * 600) + (number16 * 900) + (number17 * 950) + (number18 * 1300)+ (number19 * 2150) + (number20 * 2400) + (number21 * 3600)
                            + (number22 * 5400) + (number23 * 7200) + (number24 * 10700) + (number25 * 14300) + (number26 * 16200) + (number27 * 21500) + (number28 * 2150)
                            + (number29 * 2400) + (number30 * 3600) + (number31 * 5400) + (number32 * 7200) + (number33 * 10700) + (number34 * 14300)+ (number35 * 16200)
                            + (number36 * 21500);

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
        AlertDialog.Builder builder = new AlertDialog.Builder(ElectricalShield.this);
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
        edit.putString("save_text73", electrical_plain1.getText().toString());
        edit.putString("save_text74", electrical_plain2.getText().toString());
        edit.putString("save_text75", electrical_plain3.getText().toString());
        edit.putString("save_text76", electrical_plain4.getText().toString());
        edit.putString("save_text77", electrical_plain5.getText().toString());
        edit.putString("save_text78", electrical_plain6.getText().toString());
        edit.putString("save_text79", electrical_plain7.getText().toString());
        edit.putString("save_text80", electrical_plain8.getText().toString());
        edit.putString("save_text81", electrical_plain9.getText().toString());
        edit.putString("save_text82", electrical_plain10.getText().toString());
        edit.putString("save_text83", electrical_plain11.getText().toString());
        edit.putString("save_text84", electrical_plain12.getText().toString());
        edit.putString("save_text85", electrical_plain13.getText().toString());
        edit.putString("save_text86", electrical_plain14.getText().toString());
        edit.putString("save_text87", electrical_plain15.getText().toString());
        edit.putString("save_text88", electrical_plain16.getText().toString());
        edit.putString("save_text89", electrical_plain17.getText().toString());
        edit.putString("save_text90", electrical_plain18.getText().toString());
        edit.putString("save_text91", electrical_plain19.getText().toString());
        edit.putString("save_text92", electrical_plain20.getText().toString());
        edit.putString("save_text93", electrical_plain21.getText().toString());
        edit.putString("save_text94", electrical_plain22.getText().toString());
        edit.putString("save_text95", electrical_plain23.getText().toString());
        edit.putString("save_text96", electrical_plain24.getText().toString());
        edit.putString("save_text97", electrical_plain25.getText().toString());
        edit.putString("save_text98", electrical_plain26.getText().toString());
        edit.putString("save_text99", electrical_plain27.getText().toString());
        edit.putString("save_text100", electrical_plain28.getText().toString());
        edit.putString("save_text101", electrical_plain29.getText().toString());
        edit.putString("save_text102", electrical_plain30.getText().toString());
        edit.putString("save_text103", electrical_plain31.getText().toString());
        edit.putString("save_text104", electrical_plain32.getText().toString());
        edit.putString("save_text105", electrical_plain33.getText().toString());
        edit.putString("save_text106", electrical_plain34.getText().toString());
        edit.putString("save_text107", electrical_plain35.getText().toString());
        edit.putString("save_text108", electrical_plain36.getText().toString());
        edit.apply();
        Toast.makeText(ElectricalShield.this, "Текст успешно сохранён!", Toast.LENGTH_SHORT).show();
    }
}