package com.example.UasAndroidDenyLaduni;

import android.os.Bundle;
import android.view.MenuItem;

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
}
