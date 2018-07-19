package com.example.rump.p2000reader.view.dashboard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.rump.p2000reader.R;
import com.example.rump.p2000reader.view.accidents.AccidentsFragment;
import com.example.rump.p2000reader.view.map.MapsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new DashboardFragment());
        navigationListener();
    }

    private void navigationListener() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_main_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.navigation_dashboard:
                        replaceFragment(new DashboardFragment());
                        break;
                    case R.id.navigation_accidents:
                        replaceFragment(new AccidentsFragment());
                        break;
                    case R.id.navigation_map:
                        replaceFragment(new MapsFragment());
                        break;
                }
                return true;
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout, fragment)
                .commit();
    }
}
