package com.example.rump.p2000reader.helpers;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;

import com.example.rump.p2000reader.R;

public class CheckPermission {

    //  CHECK FOR LOCATION PERMISSION
    public static boolean checkPermission(Activity activity){
        int result = ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
        return result == PackageManager.PERMISSION_GRANTED;
    }

    //REQUEST FOR PERMISSSION
    public static void requestPermission(Activity activity, final int code){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity,Manifest.permission.ACCESS_FINE_LOCATION)){
            Toast.makeText(activity, R.string.permission_explaination,Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},code);
        }
    }

}
