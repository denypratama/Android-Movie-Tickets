package com.example.UasAndroidDenyLaduni;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;

public class te extends AppCompatActivity {

    EditText orderNama;
    Button buttonAdd;
    Spinner spinnerBioskop;
    Spinner spinnerJam;
    Spinner spinnerFilm;
    Spinner spinnerMakanan;

    DatabaseReference databaseOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_te);
    }
}
