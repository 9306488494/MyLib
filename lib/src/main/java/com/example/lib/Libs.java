package com.example.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;

import static android.content.Context.TELEPHONY_SERVICE;

public class Libs {

    @SuppressLint("HardwareIds")
    public static String IMEI(Context context) {
        String IMEI = null;
        // collect IMEI no
        TelephonyManager tm = (TelephonyManager) context.getSystemService(TELEPHONY_SERVICE);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (ActivityCompat.checkSelfPermission(context, android.Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return IMEI;
            }
            assert tm != null;
            IMEI = tm.getImei();
        } else {
            assert tm != null;
            IMEI = tm.getDeviceId();
         

        }
        return IMEI;
    }
}
