package com.example.UasAndroidDenyLaduni;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.UasAndroidDenyLaduni.fragments.HomeFragment;
import com.example.UasAndroidDenyLaduni.fragments.SettingFragment;
import com.example.UasAndroidDenyLaduni.fragments.TicketFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment (new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId())
        {
            case R.id.home:
                fragment = new HomeFragment();
                break;
            case R.id.cinema:
                fragment = new TicketFragment();
                break;
            case R.id.ticket:
                fragment = new SettingFragment();
                break;
//            case R.id.set:
//                fragment = new SettingFragment();
//                break;
        }
        return loadFragment(fragment);
    }

//    @Override
//    public void onp1Clicked() {
//        getSupportFragmentManager().beginTransaction().addToBackStack(null)
//                .replace(R.id.fragment_container, new CinemaFragment())
//                .commit();
//    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }

    public void aa1(View view) {
        String url = "https://www.youtube.com/watch?v=tmeOjFno6Do";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void aa2(View view) {
        String url = "https://www.youtube.com/watch?v=MxqsmsA8y5k";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void aa3(View view) {
        String url = "https://www.youtube.com/watch?v=DlM2CWNTQ84";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void aa4(View view) {
        String url = "https://www.youtube.com/watch?v=azvR__GRQic";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void aa5(View view) {
        String url = "https://www.youtube.com/watch?v=6ZfuNTqbHE8&t=19s";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void aa6(View view) {
        String url = "https://www.youtube.com/watch?v=TcMBFSGVi1c";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void aa7(View view) {
        String url = "https://www.youtube.com/watch?v=Ke1Y3P9D0Bc";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void bb1(View view) {
        String url = "https://www.youtube.com/watch?v=X_b-wNkz4DU";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void bb2(View view) {
        String url = "https://www.youtube.com/watch?v=foyufD52aog";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void bb3(View view) {
        String url = "https://www.youtube.com/watch?v=3c_McS4_2A8";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void bb4(View view) {
        String url = "https://www.youtube.com/watch?v=nwhB2Hb7g5c&t=68s";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void bb5(View view) {
        String url = "https://www.youtube.com/watch?v=r3VFPV90F54";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void cc1(View view) {
        String url = "https://www.youtube.com/watch?v=XY7falovJiI";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void cc2(View view) {
        String url = "https://www.youtube.com/watch?v=VFsmuRPClr4";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void cc3(View view) {
        String url = "https://www.youtube.com/watch?v=B-6Kz__Mpvg";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void cc4(View view) {
        String url = "https://www.youtube.com/watch?v=pzD9zGcUNrw";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
