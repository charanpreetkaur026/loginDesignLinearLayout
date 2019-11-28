package com.example.logindesignlinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class FormMarks extends AppCompatActivity {

    private TextView txt_ios;
    private TextView txt_java;
    private TextView txt_database;
    private EditText edt_ios;
    private EditText edtJava;
    private EditText edtDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_marks);
        txt_ios =findViewById(R.id.edt_ios);
        txt_java = findViewById(R.id.txt_java);
        txt_database = findViewById(R.id.txt_database);
        edt_ios = findViewById(R.id.edt_ios);
        edtJava = findViewById(R.id.edt_java);
        edtDatabase = findViewById(R.id.edt_database);

    }
    public static String getData(){


    }
}
