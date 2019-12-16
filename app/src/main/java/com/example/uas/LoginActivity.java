package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.uas.fragments.HistoryFragment;

public class LoginActivity extends AppCompatActivity {

    public static final String NAME_KEY = "name";
    public static final String USERNAME_KEY = "username";
    public static final String PASSWORD_KEY = "password";
    private EditText nameinput;
    private EditText usernameInput;
    private EditText passwordinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameinput = findViewById(R.id.inname);
        usernameInput = findViewById(R.id.inusername);
        passwordinput = findViewById(R.id.inpass);
    }

    public void login(View view) {
        String name = nameinput.getText().toString();
        String username = usernameInput.getText().toString();
        String password = passwordinput.getText().toString();

        if (name.equals("hai") && username.equals("halo") && password.equals("haihalo"))
        {
            Intent intent = new Intent(this, HistoryFragment.class);
            intent.putExtra(NAME_KEY,name);
            intent.putExtra(USERNAME_KEY,username);
            intent.putExtra(PASSWORD_KEY,password);
            startActivity(intent);

            Toast.makeText(this, "Login Berhasil !", Toast.LENGTH_SHORT).show();
        }
        else if ((name.equals("") && username.equals("") && password.equals("")))
        {
            Toast.makeText(this, "Masukkan Username & Password !!!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Username & Passord Salah", Toast.LENGTH_SHORT).show();
        }

    }
}
