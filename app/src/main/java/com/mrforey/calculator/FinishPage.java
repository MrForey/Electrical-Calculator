package com.mrforey.calculator;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class FinishPage extends AppCompatActivity {

    TextView rozetkiCountContainer, lightCountContainer, cableCountContainer, shtroblenieCountContainer, sverleniePodrozetnikiCountContainer,
            sverlenieStenCountContainer, montazhCountContainer, electricalCountContainer, automatsCountContainer, bitovayaCountContainer,
            derevoCountContainer, retroCountContainer, montazhCableCountContainer, zazemlenieCountContainer, dopCountContainer, allCountContainer;
    Button savetofileButton;
    SharedPreferences sPref;
    EditText percent;
    public static float result_value;

    public static float rozetki;
    public static float light;
    public static float cable;
    public static float shtroblenie;
    public static float podrozetniki;
    public static float sverlenie_sten;
    public static float montazh;
    public static float electrical_shield;
    public static float automats;
    public static float bitovaya;
    public static float derevo;
    public static float retro;
    public static float montazh_cable;
    public static float zazemlenie;
    public static float dop;


    public void loadText(View view){
        sPref = getSharedPreferences("my_settings", MODE_PRIVATE);
        SharedPreferences.Editor editor = sPref.edit();
        String save_text1 = sPref.getString("save_text1", "0");
        String save_text2 = sPref.getString("save_text2", "0");
        String save_text3 = sPref.getString("save_text3", "0");
        String save_text4 = sPref.getString("save_text4", "0");
        String save_text5 = sPref.getString("save_text5", "0");
        String save_text6 = sPref.getString("save_text6", "0");
        String save_text7 = sPref.getString("save_text7", "0");
        String save_text8 = sPref.getString("save_text8", "0");
        String save_text9 = sPref.getString("save_text9", "0");
        String save_text10 = sPref.getString("save_text10", "0");
        String save_text11 = sPref.getString("save_text11", "0");
        String save_text12 = sPref.getString("save_text12", "0");
        String save_text13 = sPref.getString("save_text13", "0");
        String save_text14 = sPref.getString("save_text14", "0");
        String save_text15 = sPref.getString("save_text15", "0");
        String save_text16 = sPref.getString("save_text16", "0");
        String save_text17 = sPref.getString("save_text17", "0");
        String save_text18 = sPref.getString("save_text18", "0");
        String save_text19 = sPref.getString("save_text19", "0");
        String save_text20 = sPref.getString("save_text20", "0");
        String save_text21 = sPref.getString("save_text21", "0");
        String save_text22 = sPref.getString("save_text22", "0");
        String save_text23 = sPref.getString("save_text23", "0");
        String save_text24 = sPref.getString("save_text24", "0");
        String save_text25 = sPref.getString("save_text25", "0");
        String save_text26 = sPref.getString("save_text26", "0");
        String save_text27 = sPref.getString("save_text27", "0");
        String save_text28 = sPref.getString("save_text28", "0");
        String save_text29 = sPref.getString("save_text29", "0");
        String save_text30 = sPref.getString("save_text30", "0");
        String save_text31 = sPref.getString("save_text31", "0");
        String save_text32 = sPref.getString("save_text32", "0");
        String save_text33 = sPref.getString("save_text33", "0");
        String save_text34 = sPref.getString("save_text34", "0");
        String save_text35 = sPref.getString("save_text35", "0");
        String save_text36 = sPref.getString("save_text36", "0");
        String save_text37 = sPref.getString("save_text37", "0");
        String save_text38 = sPref.getString("save_text38", "0");
        String save_text39 = sPref.getString("save_text39", "0");
        String save_text40 = sPref.getString("save_text40", "0");
        String save_text41 = sPref.getString("save_text41", "0");
        String save_text42 = sPref.getString("save_text42", "0");
        String save_text43 = sPref.getString("save_text43", "0");
        String save_text44 = sPref.getString("save_text44", "0");
        String save_text45 = sPref.getString("save_text45", "0");
        String save_text46 = sPref.getString("save_text46", "0");
        String save_text47 = sPref.getString("save_text47", "0");
        String save_text48 = sPref.getString("save_text48", "0");
        String save_text49 = sPref.getString("save_text49", "0");
        String save_text50 = sPref.getString("save_text50", "0");
        String save_text51 = sPref.getString("save_text51", "0");
        String save_text52 = sPref.getString("save_text52", "0");
        String save_text53 = sPref.getString("save_text53", "0");
        String save_text54 = sPref.getString("save_text54", "0");
        String save_text55 = sPref.getString("save_text55", "0");
        String save_text56 = sPref.getString("save_text56", "0");
        String save_text57 = sPref.getString("save_text57", "0");
        String save_text58 = sPref.getString("save_text58", "0");
        String save_text59 = sPref.getString("save_text59", "0");
        String save_text60 = sPref.getString("save_text60", "0");
        String save_text61 = sPref.getString("save_text61", "0");
        String save_text62 = sPref.getString("save_text62", "0");
        String save_text63 = sPref.getString("save_text63", "0");
        String save_text64 = sPref.getString("save_text64", "0");
        String save_text65 = sPref.getString("save_text65", "0");
        String save_text66 = sPref.getString("save_text66", "0");
        String save_text67 = sPref.getString("save_text67", "0");
        String save_text68 = sPref.getString("save_text68", "0");
        String save_text69 = sPref.getString("save_text69", "0");
        String save_text70 = sPref.getString("save_text70", "0");
        String save_text71 = sPref.getString("save_tex71", "0");
        String save_text72 = sPref.getString("save_text72", "0");
        String save_text73 = sPref.getString("save_text73", "0");
        String save_text74 = sPref.getString("save_text74", "0");
        String save_text75 = sPref.getString("save_text75", "0");
        String save_text76 = sPref.getString("save_text76", "0");
        String save_text77 = sPref.getString("save_text77", "0");
        String save_text78 = sPref.getString("save_text78", "0");
        String save_text79 = sPref.getString("save_text79", "0");
        String save_text80 = sPref.getString("save_text80", "0");
        String save_text81 = sPref.getString("save_text81", "0");
        String save_text82 = sPref.getString("save_text82", "0");
        String save_text83 = sPref.getString("save_text83", "0");
        String save_text84 = sPref.getString("save_text84", "0");
        String save_text85 = sPref.getString("save_text85", "0");
        String save_text86 = sPref.getString("save_text86", "0");
        String save_text87 = sPref.getString("save_text87", "0");
        String save_text88 = sPref.getString("save_text88", "0");
        String save_text89 = sPref.getString("save_text89", "0");
        String save_text90 = sPref.getString("save_text90", "0");
        String save_text91 = sPref.getString("save_text91", "0");
        String save_text92 = sPref.getString("save_text92", "0");
        String save_text93 = sPref.getString("save_text93", "0");
        String save_text94 = sPref.getString("save_text94", "0");
        String save_text95 = sPref.getString("save_text95", "0");
        String save_text96 = sPref.getString("save_text96", "0");
        String save_text97 = sPref.getString("save_text97", "0");
        String save_text98 = sPref.getString("save_text98", "0");
        String save_text99 = sPref.getString("save_text99", "0");
        String save_text100 = sPref.getString("save_text100", "0");
        String save_text101 = sPref.getString("save_text101", "0");
        String save_text102 = sPref.getString("save_text102", "0");
        String save_text103 = sPref.getString("save_text103", "0");
        String save_text104 = sPref.getString("save_text104", "0");
        String save_text105 = sPref.getString("save_text105", "0");
        String save_text106 = sPref.getString("save_text106", "0");
        String save_text107 = sPref.getString("save_text107", "0");
        String save_text108 = sPref.getString("save_text108", "0");
        String save_text109 = sPref.getString("save_text109", "0");
        String save_text110 = sPref.getString("save_text110", "0");
        String save_text111 = sPref.getString("save_text111", "0");
        String save_text112 = sPref.getString("save_text112", "0");
        String save_text113 = sPref.getString("save_text113", "0");
        String save_text114 = sPref.getString("save_text114", "0");
        String save_text115 = sPref.getString("save_text115", "0");
        String save_text116 = sPref.getString("save_text116", "0");
        String save_text117 = sPref.getString("save_text117", "0");
        String save_text118 = sPref.getString("save_text118", "0");
        String save_text119 = sPref.getString("save_text119", "0");
        String save_text120 = sPref.getString("save_text120", "0");
        String save_text121 = sPref.getString("save_text121", "0");
        String save_text122 = sPref.getString("save_text122", "0");
        String save_text123 = sPref.getString("save_text123", "0");
        String save_text124 = sPref.getString("save_text124", "0");
        String save_text125 = sPref.getString("save_text125", "0");
        String save_text126 = sPref.getString("save_text126", "0");
        String save_text127 = sPref.getString("save_text127", "0");
        String save_text128 = sPref.getString("save_text128", "0");
        String save_text129 = sPref.getString("save_text129", "0");
        String save_text130 = sPref.getString("save_text130", "0");
        String save_text131 = sPref.getString("save_text131", "0");
        String save_text132 = sPref.getString("save_text132", "0");
        String save_text133 = sPref.getString("save_text133", "0");
        String save_text134 = sPref.getString("save_text134", "0");
        String save_text135 = sPref.getString("save_text135", "0");
        String save_text136 = sPref.getString("save_text136", "0");
        String save_text137 = sPref.getString("save_text137", "0");
        String save_text138 = sPref.getString("save_text138", "0");
        String save_text139 = sPref.getString("save_text139", "0");
        String save_text140 = sPref.getString("save_text140", "0");
        String save_text141 = sPref.getString("save_text141", "0");
        String save_text142 = sPref.getString("save_text142", "0");
        String save_text143 = sPref.getString("save_text143", "0");
        String save_text144 = sPref.getString("save_text144", "0");
        String save_text145 = sPref.getString("save_text145", "0");
        String save_text146 = sPref.getString("save_text146", "0");
        String save_text147 = sPref.getString("save_text147", "0");
        String save_text148 = sPref.getString("save_text148", "0");
        String save_text149 = sPref.getString("save_text149", "0");
        String save_text150 = sPref.getString("save_text150", "0");
        String save_text151 = sPref.getString("save_text151", "0");
        String save_text152 = sPref.getString("save_text152", "0");
        String save_text153 = sPref.getString("save_text153", "0");
        String save_text154 = sPref.getString("save_text154", "0");
        String save_text155 = sPref.getString("save_text155", "0");
        String save_text156 = sPref.getString("save_text156", "0");
        String save_text157 = sPref.getString("save_text157", "0");
        String save_text158 = sPref.getString("save_text158", "0");
        String save_text159 = sPref.getString("save_text159", "0");
        String save_text160 = sPref.getString("save_text160", "0");
        String save_text161 = sPref.getString("save_text161", "0");
        String save_text162 = sPref.getString("save_text162", "0");
        String save_text163 = sPref.getString("save_text163", "0");
        String save_text164 = sPref.getString("save_text164", "0");
        String save_text165 = sPref.getString("save_text165", "0");
        String save_text166 = sPref.getString("save_text166", "0");
        String save_text167 = sPref.getString("save_text167", "0");
        String save_text168 = sPref.getString("save_text168", "0");
        String save_text169 = sPref.getString("save_text169", "0");
        String save_text170 = sPref.getString("save_text170", "0");
        String save_text171 = sPref.getString("save_text171", "0");
        String save_text172 = sPref.getString("save_text172", "0");
        String save_text173 = sPref.getString("save_text173", "0");
        String save_text174 = sPref.getString("save_text174", "0");
        String save_text175 = sPref.getString("save_text175", "0");
        String save_text176 = sPref.getString("save_text176", "0");
        String save_text177 = sPref.getString("save_text177", "0");

        float number1 = parseFloatOrDefault(save_text1, 0);
        float number2 = parseFloatOrDefault(save_text2, 0);
        float number3 = parseFloatOrDefault(save_text3, 0);
        float number4 = parseFloatOrDefault(save_text4, 0);
        float number5 = parseFloatOrDefault(save_text5, 0);
        float number6 = parseFloatOrDefault(save_text6, 0);
        float number7 = parseFloatOrDefault(save_text7, 0);
        float number8 = parseFloatOrDefault(save_text8, 0);
        float number9 = parseFloatOrDefault(save_text9, 0);
        float number10 = parseFloatOrDefault(save_text10, 0);
        float number11 = parseFloatOrDefault(save_text11, 0);
        float number12 = parseFloatOrDefault(save_text12, 0);
        float number13 = parseFloatOrDefault(save_text13, 0);
        float number14 = parseFloatOrDefault(save_text14, 0);
        float number15 = parseFloatOrDefault(save_text15, 0);
        float number16 = parseFloatOrDefault(save_text16, 0);
        float number17 = parseFloatOrDefault(save_text17, 0);
        float number18 = parseFloatOrDefault(save_text18, 0);
        float number19 = parseFloatOrDefault(save_text19, 0);
        float number20 = parseFloatOrDefault(save_text20, 0);
        float number21 = parseFloatOrDefault(save_text21, 0);
        float number22 = parseFloatOrDefault(save_text22, 0);
        float number23 = parseFloatOrDefault(save_text23, 0);
        float number24 = parseFloatOrDefault(save_text24, 0);
        float number25 = parseFloatOrDefault(save_text25, 0);
        float number26 = parseFloatOrDefault(save_text26, 0);
        float number27 = parseFloatOrDefault(save_text27, 0);
        float number28 = parseFloatOrDefault(save_text28, 0);
        float number29 = parseFloatOrDefault(save_text29, 0);
        float number30 = parseFloatOrDefault(save_text30, 0);
        float number31 = parseFloatOrDefault(save_text31, 0);
        float number32 = parseFloatOrDefault(save_text32, 0);
        float number33 = parseFloatOrDefault(save_text33, 0);
        float number34 = parseFloatOrDefault(save_text34, 0);
        float number35 = parseFloatOrDefault(save_text35, 0);
        float number36 = parseFloatOrDefault(save_text36, 0);
        float number37 = parseFloatOrDefault(save_text37, 0);
        float number38 = parseFloatOrDefault(save_text38, 0);
        float number39 = parseFloatOrDefault(save_text39, 0);
        float number40 = parseFloatOrDefault(save_text40, 0);
        float number41 = parseFloatOrDefault(save_text41, 0);
        float number42 = parseFloatOrDefault(save_text42, 0);
        float number43 = parseFloatOrDefault(save_text43, 0);
        float number44 = parseFloatOrDefault(save_text44, 0);
        float number45 = parseFloatOrDefault(save_text45, 0);
        float number46 = parseFloatOrDefault(save_text46, 0);
        float number47 = parseFloatOrDefault(save_text47, 0);
        float number48 = parseFloatOrDefault(save_text48, 0);
        float number49 = parseFloatOrDefault(save_text49, 0);
        float number50 = parseFloatOrDefault(save_text50, 0);
        float number51 = parseFloatOrDefault(save_text51, 0);
        float number52 = parseFloatOrDefault(save_text52, 0);
        float number53 = parseFloatOrDefault(save_text53, 0);
        float number54 = parseFloatOrDefault(save_text54, 0);
        float number55 = parseFloatOrDefault(save_text55, 0);
        float number56 = parseFloatOrDefault(save_text56, 0);
        float number57 = parseFloatOrDefault(save_text57, 0);
        float number58 = parseFloatOrDefault(save_text58, 0);
        float number59 = parseFloatOrDefault(save_text59, 0);
        float number60 = parseFloatOrDefault(save_text60, 0);
        float number61 = parseFloatOrDefault(save_text61, 0);
        float number62 = parseFloatOrDefault(save_text62, 0);
        float number63 = parseFloatOrDefault(save_text63, 0);
        float number64 = parseFloatOrDefault(save_text64, 0);
        float number65 = parseFloatOrDefault(save_text65, 0);
        float number66 = parseFloatOrDefault(save_text66, 0);
        float number67 = parseFloatOrDefault(save_text67, 0);
        float number68 = parseFloatOrDefault(save_text68, 0);
        float number69 = parseFloatOrDefault(save_text69, 0);
        float number70 = parseFloatOrDefault(save_text70, 0);
        float number71 = parseFloatOrDefault(save_text71, 0);
        float number72 = parseFloatOrDefault(save_text72, 0);
        float number73 = parseFloatOrDefault(save_text73, 0);
        float number74 = parseFloatOrDefault(save_text74, 0);
        float number75 = parseFloatOrDefault(save_text75, 0);
        float number76 = parseFloatOrDefault(save_text76, 0);
        float number77 = parseFloatOrDefault(save_text77, 0);
        float number78 = parseFloatOrDefault(save_text78, 0);
        float number79 = parseFloatOrDefault(save_text79, 0);
        float number80 = parseFloatOrDefault(save_text80, 0);
        float number81 = parseFloatOrDefault(save_text81, 0);
        float number82 = parseFloatOrDefault(save_text82, 0);
        float number83 = parseFloatOrDefault(save_text83, 0);
        float number84 = parseFloatOrDefault(save_text84, 0);
        float number85 = parseFloatOrDefault(save_text85, 0);
        float number86 = parseFloatOrDefault(save_text86, 0);
        float number87 = parseFloatOrDefault(save_text87, 0);
        float number88 = parseFloatOrDefault(save_text88, 0);
        float number89 = parseFloatOrDefault(save_text89, 0);
        float number90 = parseFloatOrDefault(save_text90, 0);
        float number91 = parseFloatOrDefault(save_text91, 0);
        float number92 = parseFloatOrDefault(save_text92, 0);
        float number93 = parseFloatOrDefault(save_text93, 0);
        float number94 = parseFloatOrDefault(save_text94, 0);
        float number95 = parseFloatOrDefault(save_text95, 0);
        float number96 = parseFloatOrDefault(save_text96, 0);
        float number97 = parseFloatOrDefault(save_text97, 0);
        float number98 = parseFloatOrDefault(save_text98, 0);
        float number99 = parseFloatOrDefault(save_text99, 0);
        float number100 = parseFloatOrDefault(save_text100, 0);
        float number101 = parseFloatOrDefault(save_text101, 0);
        float number102 = parseFloatOrDefault(save_text102, 0);
        float number103 = parseFloatOrDefault(save_text103, 0);
        float number104 = parseFloatOrDefault(save_text104, 0);
        float number105 = parseFloatOrDefault(save_text105, 0);
        float number106 = parseFloatOrDefault(save_text106, 0);
        float number107 = parseFloatOrDefault(save_text107, 0);
        float number108 = parseFloatOrDefault(save_text108, 0);
        float number109 = parseFloatOrDefault(save_text109, 0);
        float number110 = parseFloatOrDefault(save_text110, 0);
        float number111 = parseFloatOrDefault(save_text111, 0);
        float number112 = parseFloatOrDefault(save_text112, 0);
        float number113 = parseFloatOrDefault(save_text113, 0);
        float number114 = parseFloatOrDefault(save_text114, 0);
        float number115 = parseFloatOrDefault(save_text115, 0);
        float number116 = parseFloatOrDefault(save_text116, 0);
        float number117 = parseFloatOrDefault(save_text117, 0);
        float number118 = parseFloatOrDefault(save_text118, 0);
        float number119 = parseFloatOrDefault(save_text119, 0);
        float number120 = parseFloatOrDefault(save_text120, 0);
        float number121 = parseFloatOrDefault(save_text121, 0);
        float number122 = parseFloatOrDefault(save_text122, 0);
        float number123 = parseFloatOrDefault(save_text123, 0);
        float number124 = parseFloatOrDefault(save_text124, 0);
        float number125 = parseFloatOrDefault(save_text125, 0);
        float number126 = parseFloatOrDefault(save_text126, 0);
        float number127 = parseFloatOrDefault(save_text127, 0);
        float number128 = parseFloatOrDefault(save_text128, 0);
        float number129 = parseFloatOrDefault(save_text129, 0);
        float number130 = parseFloatOrDefault(save_text130, 0);
        float number131 = parseFloatOrDefault(save_text131, 0);
        float number132 = parseFloatOrDefault(save_text132, 0);
        float number133 = parseFloatOrDefault(save_text133, 0);
        float number134 = parseFloatOrDefault(save_text134, 0);
        float number135 = parseFloatOrDefault(save_text135, 0);
        float number136 = parseFloatOrDefault(save_text136, 0);
        float number137 = parseFloatOrDefault(save_text137, 0);
        float number138 = parseFloatOrDefault(save_text138, 0);
        float number139 = parseFloatOrDefault(save_text139, 0);
        float number140 = parseFloatOrDefault(save_text140, 0);
        float number141 = parseFloatOrDefault(save_text141, 0);
        float number142 = parseFloatOrDefault(save_text142, 0);
        float number143 = parseFloatOrDefault(save_text143, 0);
        float number144 = parseFloatOrDefault(save_text144, 0);
        float number145 = parseFloatOrDefault(save_text145, 0);
        float number146 = parseFloatOrDefault(save_text146, 0);
        float number147 = parseFloatOrDefault(save_text147, 0);
        float number148 = parseFloatOrDefault(save_text148, 0);
        float number149 = parseFloatOrDefault(save_text149, 0);
        float number150 = parseFloatOrDefault(save_text150, 0);
        float number151 = parseFloatOrDefault(save_text151, 0);
        float number152 = parseFloatOrDefault(save_text152, 0);
        float number153 = parseFloatOrDefault(save_text153, 0);
        float number154 = parseFloatOrDefault(save_text154, 0);
        float number155 = parseFloatOrDefault(save_text155, 0);
        float number156 = parseFloatOrDefault(save_text156, 0);
        float number157 = parseFloatOrDefault(save_text157, 0);
        float number158 = parseFloatOrDefault(save_text158, 0);
        float number159 = parseFloatOrDefault(save_text159, 0);
        float number160 = parseFloatOrDefault(save_text160, 0);
        float number161 = parseFloatOrDefault(save_text161, 0);
        float number162 = parseFloatOrDefault(save_text162, 0);
        float number163 = parseFloatOrDefault(save_text163, 0);
        float number164 = parseFloatOrDefault(save_text164, 0);
        float number165 = parseFloatOrDefault(save_text165, 0);
        float number166 = parseFloatOrDefault(save_text166, 0);
        float number167 = parseFloatOrDefault(save_text167, 0);
        float number168 = parseFloatOrDefault(save_text168, 0);
        float number169 = parseFloatOrDefault(save_text169, 0);
        float number170 = parseFloatOrDefault(save_text170, 0);
        float number171 = parseFloatOrDefault(save_text171, 0);
        float number172 = parseFloatOrDefault(save_text172, 0);
        float number173 = parseFloatOrDefault(save_text173, 0);
        float number174 = parseFloatOrDefault(save_text174, 0);
        float number175 = parseFloatOrDefault(save_text175, 0);
        float number176 = parseFloatOrDefault(save_text176, 0);
        float number177 = parseFloatOrDefault(save_text177, 0);


        float res = (number1 * 350) + (number2 * 250) + (number3 * 350) + (number4 * 350) + (number5 * 400) + (number6 * 400) + (number7 * 600) + (number8 * 800) +
                (number9 * 750) + (number10 * 350) + (number11 * 400) + (number12 * 1000) + (number13 * 400) + (number14 * 550) +
                (number15 * 1000) + (number16 * 550) + (number17 * 200) + (number18 * 250) + (number19 * 350) + (number20 * 150) + (number21 * 350) +
                (number22 * 200) + (number23 * 1000) + (number24 * 1000) + (number25 * 600) + (number26 * 300) +
                (number27 * 80) + (number28 * 80) + (number29 * 120) + (number30 * 80) + (number31 * 130) + (number32 * 130)
                + (number33 * 150) + (number34 * 120) + (number35 * 30) + (number36 * 35) + (number37 * 40) + (number38 * 90) + (number39 * 100)
                + (number40 * 200) + (number41 * 300) + (number42 * 700) + (number43 * 1000) + (number44 * 70) +
                (number45 * 120) + (number46 * 400) + (number47 * 250) + (number48 * 700) + (number49 * 400) + (number50 * 250) + (number51 * 700) + (number52 * 1000) +
                (number53 * 245) + (number54 * 345) + (number55 * 200) + (number56 * 350) + (number57 * 590) + (number58 * 300) + (number59 * 445) +
                (number60 * 745)+ (number61 * 400) + (number62 * 745)+ (number63 * 1100) + (number64 * 150) + (number65 * 250) + (number66 * 100) + (number67 * 100) +
                (number68 * 400) + (number69 * 500) + (number70 * 600) + (number71 * 750)+ (number72 * 50) + (number73 * 2400) + (number74 * 3600) + (number75 * 4900) +
                (number76 * 5350) + (number77 * 7150) + (number78 * 8200) + (number79 * 11000)
                + (number80 * 1800)+ (number81 * 2350) + (number82 * 2400) + (number83 * 3600) + (number84 * 4700) + (number85 * 5350) + (number86 * 7100)
                + (number87 * 600) + (number88 * 900) + (number89 * 950) + (number90 * 1300)+ (number91 * 2150) + (number92 * 2400) + (number93 * 3600)
                + (number94 * 5400) + (number95 * 7200) + (number96 * 10700) + (number97 * 14300) + (number98 * 16200) + (number99 * 21500) + (number100 * 2150)
                + (number101 * 2400) + (number102 * 3600) + (number103 * 5400) + (number104 * 7200) + (number105 * 10700) + (number106 * 14300)+ (number107 * 16200)
                + (number108 * 21500) + (number109 * 340) + (number110 * 500) + (number111 * 600) + (number112 * 800) + (number113 * 1800) + (number114 * 900) + (number115 * 1800)
                + (number116 * 500)+ (number117 * 800) + (number118 * 100) + (number119 * 100) + (number120 * 700) + (number121 * 900) + (number122 * 600) + (number123 * 1000)
                + (number124 * 1000) + (number125 * 350) + (number126 * 500) + (number127 * 200) + (number128 * 1800) + (number129 * 1000)+ (number130 * 1000)
                + (number131 * 1000) + (number132 * 500) + (number133 * 350) + (number134 * 300) + (number135 * 400) + (number136 * 300) + (number137 * 100) + (number138 * 300) +
                (number139 * 80) + (number140 * 120)+ (number141 * 150) + (number142 * 100) + (number143 * 120) + (number144 * 100) + (number145 * 250) + (number146 * 400) +
                (number147 * 100) + (number148 * 70) + (number149 * 30) + (number150 * 50) + (number151 * 600) + (number152 * 900) + (number153 * 500) +
                (number154 * 800) + (number155 * 80) + (number156 * 120) + (number157 * 160) + (number158 * 100) + (number159 * 120) + (number160 * 230) +
                (number161 * 10000) + (number162 * 15000) + (number163 * 2000) + (number164 * 40) + (number165 * 50) + (number166 * 150) + (number167 * 35) + (number168 * 1000) +
                (number169 * 1000) + (number170 * 1000) + (number171 * 1000) + (number172 * 4000) + (number173 * 1400) + (number174 * 15000) +
                (number175 * 3000) + (number176 * 3000) + (number177 * 3000);

        float rozetket_res = (number1 * 350) + (number2 * 250) + (number3 * 350) + (number4 * 350) + (number5 * 400) + (number6 * 400) + (number7 * 600) + (number8 * 800) +
                (number9 * 750) + (number10 * 350) + (number11 * 400) + (number12 * 1000) + (number13 * 400) + (number14 * 550);

        float light_res = (number15 * 1000) + (number16 * 550) + (number17 * 200) + (number18 * 250) + (number19 * 350) + (number20 * 150) + (number21 * 350) +
                (number22 * 200) + (number23 * 1000) + (number24 * 1000) + (number25 * 600) + (number26 * 300);

        float cable_res = (number27 * 80) + (number28 * 80) + (number29 * 120) + (number30 * 80) + (number31 * 130) + (number32 * 130)
                + (number33 * 150) + (number34 * 120) + (number35 * 30) + (number36 * 35) + (number37 * 40) + (number38 * 90) + (number39 * 100);

        float shtroblenie_res = (number40 * 200) + (number41 * 300) + (number42 * 700) + (number43 * 1000) + (number44 * 70);

        float podrozetniki_res = (number45 * 120) + (number46 * 400) + (number47 * 250) + (number48 * 700) + (number49 * 400) + (number50 * 250) + (number51 * 700) + (number52 * 1000);

        float sverlenie_sten_res = (number53 * 245) + (number54 * 345) + (number55 * 200) + (number56 * 350) + (number57 * 590) + (number58 * 300) + (number59 * 445) +
                (number60 * 745)+ (number61 * 400) + (number62 * 745)+ (number63 * 1100);

        float montazh_res = (number64 * 150) + (number65 * 250) + (number66 * 100) + (number67 * 100) +
                (number68 * 400) + (number69 * 500) + (number70 * 600) + (number71 * 750)+ (number72 * 50);

        float electrical_res = (number73 * 2400) + (number74 * 3600) + (number75 * 4900) +
                (number76 * 5350) + (number77 * 7150) + (number78 * 8200) + (number79 * 11000)
                + (number80 * 1800)+ (number81 * 2350) + (number82 * 2400) + (number83 * 3600) + (number84 * 4700) + (number85 * 5350) + (number86 * 7100)
                + (number87 * 600) + (number88 * 900) + (number89 * 950) + (number90 * 1300)+ (number91 * 2150) + (number92 * 2400) + (number93 * 3600)
                + (number94 * 5400) + (number95 * 7200) + (number96 * 10700) + (number97 * 14300) + (number98 * 16200) + (number99 * 21500) + (number100 * 2150)
                + (number101 * 2400) + (number102 * 3600) + (number103 * 5400) + (number104 * 7200) + (number105 * 10700) + (number106 * 14300)+ (number107 * 16200)
                + (number108 * 21500);

        float automats_res = (number109 * 340) + (number110 * 500) + (number111 * 600) + (number112 * 800) + (number113 * 1800) + (number114 * 900) + (number115 * 1800)
                + (number116 * 500)+ (number117 * 800) + (number118 * 100) + (number119 * 100) + (number120 * 700) + (number121 * 900);

        float bitovaya_res = (number122 * 600) + (number123 * 1000)
                + (number124 * 1000) + (number125 * 350) + (number126 * 500) + (number127 * 200) + (number128 * 1800) + (number129 * 1000)+ (number130 * 1000)
                + (number131 * 1000) + (number132 * 500);

        float derevo_res = (number133 * 350) + (number134 * 300) + (number135 * 400) + (number136 * 300) + (number137 * 100) + (number138 * 300) +
                (number139 * 80) + (number140 * 120)+ (number141 * 150) + (number142 * 100) + (number143 * 120) + (number144 * 100) + (number145 * 250) + (number146 * 400);

        float retro_res = (number147 * 100) + (number148 * 70) + (number149 * 30) + (number150 * 50) + (number151 * 600) + (number152 * 900) + (number153 * 500) + (number154 * 800);

        float montazh_cable_res = (number155 * 80) + (number156 * 120) + (number157 * 160) + (number158 * 100) + (number159 * 120) + (number160 * 230);

        float zazemlenie_res = (number161 * 10000) + (number162 * 15000) + (number163 * 2000);

        float dop_res = (number164 * 40) + (number165 * 50) + (number166 * 150) + (number167 * 35) + (number168 * 1000) +
                (number169 * 1000) + (number170 * 1000) + (number171 * 1000) + (number172 * 4000) + (number173 * 1400) + (number174 * 15000) +
                (number175 * 3000) + (number176 * 3000) + (number177 * 3000);

        rozetkiCountContainer = findViewById(R.id.rozetkiCountContainer);
        lightCountContainer = findViewById(R.id.lightCountContainer);
        cableCountContainer = findViewById(R.id.cableCountContainer);
        shtroblenieCountContainer = findViewById(R.id.shtroblenieCountContainer);
        sverleniePodrozetnikiCountContainer = findViewById(R.id.sverleniePodrozetnikiCountContainer);
        sverlenieStenCountContainer = findViewById(R.id.sverlenieStenCountContainer);
        montazhCountContainer = findViewById(R.id.montazhCountContainer);
        electricalCountContainer = findViewById(R.id.electricalCountContainer);
        automatsCountContainer = findViewById(R.id.automatsCountContainer);
        bitovayaCountContainer = findViewById(R.id.bitovayaCountContainer);
        derevoCountContainer = findViewById(R.id.derevoCountContainer);
        retroCountContainer = findViewById(R.id.retroCountContainer);
        montazhCableCountContainer = findViewById(R.id.montazhCableCountContainer);
        zazemlenieCountContainer = findViewById(R.id.zazemlenieCountContainer);
        dopCountContainer = findViewById(R.id.dopCountContainer);
        allCountContainer = findViewById(R.id.allCountContainer);

        rozetkiCountContainer.setText("Итог: "+rozetket_res+" руб.");
        lightCountContainer.setText("Итог: "+light_res+" руб.");
        cableCountContainer.setText("Итог: "+cable_res+" руб.");
        shtroblenieCountContainer.setText("Итог: "+shtroblenie_res+" руб.");
        sverleniePodrozetnikiCountContainer.setText("Итог: "+podrozetniki_res+" руб.");
        sverlenieStenCountContainer.setText("Итог: "+sverlenie_sten_res+" руб.");
        montazhCountContainer.setText("Итог: "+montazh_res+" руб.");
        electricalCountContainer.setText("Итог: "+electrical_res+" руб.");
        automatsCountContainer.setText("Итог: "+automats_res+" руб.");
        bitovayaCountContainer.setText("Итог: "+bitovaya_res+" руб.");
        derevoCountContainer.setText("Итог: "+derevo_res+" руб.");
        retroCountContainer.setText("Итог: "+retro_res+" руб.");
        montazhCableCountContainer.setText("Итог: "+montazh_cable_res+" руб.");
        zazemlenieCountContainer.setText("Итог: "+zazemlenie_res+" руб.");
        dopCountContainer.setText("Итог: "+dop_res+" руб.");
        allCountContainer.setText("Итог: "+res+" руб.");

        percent = findViewById(R.id.percent);

        float percent_float = Float.parseFloat(percent.getText().toString());

        float subtract = res * (percent_float / 100);

        float result = res - subtract;

        result_value = result;

        rozetki = rozetket_res;
        light = light_res;
        cable = cable_res;
        shtroblenie = shtroblenie_res;
        podrozetniki = podrozetniki_res;
        sverlenie_sten = sverlenie_sten_res;
        montazh = montazh_res;
        electrical_shield = electrical_res;
        automats = automats_res;
        bitovaya = bitovaya_res;
        derevo = derevo_res;
        retro = retro_res;
        montazh_cable = montazh_cable_res;
        zazemlenie = zazemlenie_res;
        dop = dop_res;

        resultAlert("Итого: "+ result +" руб.");
        editor.clear();
        editor.apply();
    }

    private float parseFloatOrDefault(String text, float defaultValue) {
        try {
            return Float.parseFloat(text);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public void saveFile(View v)
    {
        saveToMediaStore("Рассчёты", "<p style='font-size:20px; font-family: Verdana, Arial, Helvetica, sans-serif; color:#000000; margin-top:30px;'>Розетки и выключатели: " + rozetki + "</p>\n" +
                "<p style='font-size:20px; font-family: Verdana, Arial, Helvetica, sans-serif; color:#000000; margin-top:30px;'>Освещение: " + light + "</p>\n" +
                "<p style='font-size:20px; font-family: Verdana, Arial, Helvetica, sans-serif; margin-top:30px;'>Прокладка кабеля: " + cable + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Штробление: " + shtroblenie + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Сверление отверстий под подрозетники: " + podrozetniki + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Сквозное сверление стен: " + sverlenie_sten + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Монтаж коробок, подрозетников: " + montazh + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Электрощит: " + electrical_shield + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Автоматы, УЗО, реле: " + automats + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Подключение бытовой техники: " + bitovaya + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Электрика в деревянном доме, бане: " + derevo + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Ретро проводка: " + retro + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Монтаж кабель-канала, лотков, труб: " + montazh_cable + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Заземление: " + zazemlenie + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Доп. работы: " + dop + "</p>\n" +
                "<p style='font-size:20px; font-family: 'Arial' sans-serif; color:#000000; margin-top:30px;'>Итого: " + result_value + "</p>\n");
    }

    public void saveToMediaStore(String fileName, String content) {
        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DISPLAY_NAME, fileName);
        values.put(MediaStore.MediaColumns.MIME_TYPE, "text/html");
        values.put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOWNLOADS);

        Uri uri = getContentResolver().insert(MediaStore.Files.getContentUri("external"), values);

        if (uri != null) {
            try (OutputStream outputStream = getContentResolver().openOutputStream(uri)) {
                outputStream.write(content.getBytes(StandardCharsets.UTF_16));
                Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(this, "Ошибка при сохранении файла", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Не удалось создать файл", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_finish_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void resultAlert(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(FinishPage.this);
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
}