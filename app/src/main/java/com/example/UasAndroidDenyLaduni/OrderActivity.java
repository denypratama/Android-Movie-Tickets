package com.example.UasAndroidDenyLaduni;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.UasAndroidDenyLaduni.Model.Order;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OrderActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_order);

        databaseOrder = FirebaseDatabase.getInstance().getReference("Order");

        buttonAdd = (Button)findViewById(R.id.addButton);
        spinnerBioskop = (Spinner)findViewById(R.id.spBioskop);
        spinnerJam = (Spinner)findViewById(R.id.spJam);
        spinnerFilm = (Spinner)findViewById(R.id.spFilm);
        spinnerMakanan = (Spinner)findViewById(R.id.spMakanan);
        orderNama = (EditText) findViewById(R.id.orderNama);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

        private void orderBaru(){
            String bioskop = spinnerBioskop.getSelectedItem().toString();
            String jam = spinnerJam.getSelectedItem().toString();
            String film = spinnerFilm.getSelectedItem().toString();
            String makanan = spinnerMakanan.getSelectedItem().toString();
            String nama = orderNama.getText().toString();

            if(!TextUtils.isEmpty(nama)){
                 String id = databaseOrder.push().getKey();

                Order order = new Order(bioskop, jam, film, makanan, nama, id);

                databaseOrder.child(id).setValue(order);

                Toast.makeText(this, "Pesanan Berhasil. Silahkan Cek History Anda", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, "Masukkan Nama Terlebih Dahulu", Toast.LENGTH_SHORT).show();
            }
        }


}
