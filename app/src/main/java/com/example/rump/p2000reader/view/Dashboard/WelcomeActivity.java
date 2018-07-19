package com.example.rump.p2000reader.view.Dashboard;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.rump.p2000reader.R;
import com.example.rump.p2000reader.helpers.CheckPermission;


public class WelcomeActivity extends AppCompatActivity {
    public final static int TAG_PERMISSION_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (CheckPermission.checkPermission(WelcomeActivity.this)) {
            startMainActivity();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        locationButtonListener();
        skipLocationStep();
    }

    private void locationButtonListener() {
        findViewById(R.id.enable_location_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!CheckPermission.checkPermission(WelcomeActivity.this)) {
                    CheckPermission.requestPermission(WelcomeActivity.this, TAG_PERMISSION_CODE);
                }
            }
        });
    }

    private void skipLocationStep() {
        findViewById(R.id.skipText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMainActivity();
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(getApplicationContext(), "Permission granted", Toast.LENGTH_SHORT).show();
                    startMainActivity();
                } else {
                    Toast.makeText(getApplicationContext(), "Permission denied", Toast.LENGTH_SHORT).show();
                    startMainActivity();
                }
                return;
            }
            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    private void startMainActivity() {
        Intent MainActivityIntent = new Intent(this, MainActivity.class);
        MainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(MainActivityIntent);
    }
}
